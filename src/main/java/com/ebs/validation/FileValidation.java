package com.ebs.validation;

import org.springframework.web.multipart.MultipartFile;

public class FileValidation {

    public static  String checkFile(MultipartFile file){
        String errorMsg = "";
/**
 * Empty file check.
 */
        if (file.isEmpty()) {
            errorMsg =  "Failed to store empty file " + file.getOriginalFilename();
        }
/**
 *  File size check.
 */
        else if (file.getSize() >= 20000001) {
            errorMsg = "Too large file " + file.getOriginalFilename();
        }
/**
 *  File extension check.
 */
        else if (file.getOriginalFilename().length() < 5 |
                !file.getOriginalFilename().substring(file.getOriginalFilename().length()-4,file.getOriginalFilename().length()).toLowerCase().contains("xlsx")){
            errorMsg = "File extension must be XLSX";
        }

        return errorMsg;
    }
}
