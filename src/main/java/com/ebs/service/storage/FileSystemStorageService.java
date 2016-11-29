package com.ebs.service.storage;

import com.ebs.validation.FileValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class FileSystemStorageService implements StorageService {

    private final Path rootLocation;

    @Autowired
    public FileSystemStorageService(StorageProperties properties) {
        this.rootLocation = Paths.get(properties.getLocation());
    }
    @Autowired
    private Environment environment;
    @Autowired
    private FileValidation fileValidation;

    @Override
    public String store(MultipartFile file) {
        String errorMsg = fileValidation.validateUploadFile(file);
        if(!errorMsg.isEmpty()){
            return errorMsg;
        }
        else {
            try {
                Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
                return environment.getRequiredProperty("file.upload.success");
            } catch (Exception e) {
                return "Error";
//                throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
            }
        }
    }

    @Override
    public Stream<Path> loadAll() {
        try {
            return Files.walk(this.rootLocation, 1)
                    .filter(path -> !path.equals(this.rootLocation))
                    .map(path -> this.rootLocation.relativize(path));
        } catch (IOException e) {
            throw new StorageException("Failed to read stored files", e);
        }

    }

    @Override
    public Path load(String filename) {
        return rootLocation.resolve(filename);
    }

    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if(resource.exists() || resource.isReadable()) {
                return resource;
            }
            else {
                throw new StorageFileNotFoundException("Could not read file: " + filename);

            }
        } catch (MalformedURLException e) {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }

    @Override
    public void deleteFile(String fileName) {
//        System.out.println(rootLocation.toFile().toString() + "/" + fileName);
        File toDelete = new File(rootLocation.toFile().toString() + "/" + fileName);
        FileSystemUtils.deleteRecursively(toDelete);
    }

    @Override
    public void init() {
        try {
            if (!Files.exists(rootLocation)) {
                Files.createDirectory(rootLocation);
            }
        } catch (IOException e) {
            throw new StorageException("Could not initialize storage", e);
        }
    }
}
