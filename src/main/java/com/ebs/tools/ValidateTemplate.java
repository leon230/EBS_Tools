//package com.ebs.tools;
//
//import com.ebs.model.Template;
//
//public class ValidateTemplate {
//    private String templateType;
//    private String fileName;
//
//    public ValidateTemplate(String fileName) {
//        this.fileName = fileName;
//    }
//
//    /**
//     * Validate if the template has correct tag in first cell
//     */
//    public boolean ValidateTemplate(){
//
//        Template template = new Template();
//        template.setTemplateFileName(fileName);
//        templateType = template.ReadTemplateType();
//
//        if (templateType.equals("2Y_SHIPMENT_UPLOAD")){
//            return true;
//        }
//        return false;
//    }
//
//    public String getTemplateType() {
//        return templateType;
//    }
//}
