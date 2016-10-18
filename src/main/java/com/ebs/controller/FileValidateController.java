package com.ebs.controller;

import com.ebs.model.Shipment;
import com.ebs.tools.CreateShipmentList;
import com.ebs.model.Template;
import com.ebs.tools.ValidateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by lukasz.homik on 2016-09-14.
 */
@Controller
public class FileValidateController {

//    @RequestMapping("/validateFile")
//    public String FileValidate(RedirectAttributes redirectAttributes){
//
//        redirectAttributes.addFlashAttribute("message","validation");
//        return "validateFile";
//    }

    @RequestMapping(value = "/validateFile", method = RequestMethod.GET)
    public Model messages(Model model, HttpServletRequest request) {

        /**
         * Recognize template
         */
        String fileName = request.getParameter("filename");
        ValidateTemplate vt = new ValidateTemplate(fileName);

        if (vt.ValidateTemplate()){
            ArrayList<Shipment> tableList;
            CreateShipmentList shList = new CreateShipmentList();
            shList.generateShipmentList(fileName);
            tableList = shList.getShipmentList();
            model.addAttribute("tableList",tableList);
            model.addAttribute("message", "validation: " + vt.getTemplateType());
        }
        else
        {
            model.addAttribute("message", "Error: Incorrect template type");
        }
        return model;
    }


}
