package com.ebs.validation;

import com.ebs.model.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.multipart.MultipartFile;

public class FileValidation {

    @Autowired
    private Environment environment;

    public String validateUploadFile(MultipartFile file){
        String errorMsg = "";
/**
 * Empty file check.
 */
        if (file.isEmpty()) {
            errorMsg =  environment.getRequiredProperty("file.upload.failure.empty") + file.getOriginalFilename();
        }
/**
 *  File size check.
 */
        else if (file.getSize() >= Long.parseLong(environment.getRequiredProperty("file.max.size"))) {
            errorMsg = environment.getRequiredProperty("file.upload.failure.tooLarge");
        }
/**
 *  File extension check.
 *  XLSX acceptable.
 */
        else if (file.getOriginalFilename().length() < 5 |
                !file.getOriginalFilename().substring(file.getOriginalFilename().length()-4,file.getOriginalFilename().length()).toLowerCase().contains("xlsx")){
            errorMsg = environment.getRequiredProperty("file.upload.failure.extension");
        }

        return errorMsg;
    }

    public boolean validateTemplate(String fileName){
        String templateType;
        Template template = new Template();
        template.setTemplateFileName(fileName);
        templateType = template.ReadTemplateType();

        if (templateType.equals("2Y_SHIPMENT_UPLOAD")){
            return true;
        }
        return false;
    }






}
