package com.ebs.validation;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by lukasz.homik on 2016-09-15.
 */
public class FileValidation {

    public static  String checkFile(MultipartFile file){
        String errorMsg = "";

        if (file.isEmpty()) {
            errorMsg =  "Failed to store empty file " + file.getOriginalFilename();
        }
        else if (file.getSize() >= 20000001) {
            errorMsg = "Too large file " + file.getOriginalFilename();
        }
        else if (file.getOriginalFilename().length() < 5 |
                !file.getOriginalFilename().substring(file.getOriginalFilename().length()-4,file.getOriginalFilename().length()).toLowerCase().contains("xlsx")){
            errorMsg = "File extension must be XLSX";
        }

        return errorMsg;
    }
}
