package com.ebs.controller;

import com.ebs.model.Shipment;
import com.ebs.tools.CreateShipmentList;
import com.ebs.validation.FileValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class FileValidateController {

    @Autowired
    private FileValidation fileValidation;

    @RequestMapping(value = "/validateFile", method = RequestMethod.GET)
    public Model validateFile(Model model, HttpServletRequest request) {
        String fileName = request.getParameter("filename");

/**
 * Validate if template has correct template name and perform Shipment object validation
 */
        if (fileValidation.validateTemplate(fileName)){
            ArrayList<Shipment> tableList;
            CreateShipmentList shList = new CreateShipmentList();
            shList.generateShipmentList(fileName);
            tableList = shList.getShipmentList();
            model.addAttribute("tableList",tableList);
            model.addAttribute("message", "Validation");
        }
        else
        {
            model.addAttribute("message", "Error: Incorrect template type");
        }
        return model;
    }


}
