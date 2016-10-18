package com.ebs.tools;

import com.ebs.model.Template;

/**
 * Created by lukasz.homik on 2016-10-13.
 */
public class ValidateTemplate {
    private String templateType;
    private String fileName;

    public ValidateTemplate(String fileName) {
        this.fileName = fileName;
    }

    public boolean ValidateTemplate(){

        System.out.println(fileName);

        Template template = new Template();
        template.setTemplateFileName(fileName);
        templateType = template.ReadTemplateType();
        System.out.println(templateType);

        if (templateType.equals("2Y_SHIPMENT_UPLOAD")){
            return true;
        }
        return false;
    }

    public String getTemplateType() {
        return templateType;
    }
}
