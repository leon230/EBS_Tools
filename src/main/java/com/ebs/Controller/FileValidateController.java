package com.ebs.Controller;

import com.ebs.Model.Shipment;
import com.ebs.Tools.CreateShipmentList;
import com.ebs.Tools.ReadFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
//        redirectAttributes.addFlashAttribute("message","Validation");
//        return "validateFile";
//    }

    @RequestMapping(value = "/validateFile", method = RequestMethod.GET)
    public Model messages(Model model, HttpServletRequest request) {
        String fileName = request.getParameter("filename");
        ArrayList<Shipment> tableList;
//        System.out.println("Filename: " + fileName);
        CreateShipmentList shList = new CreateShipmentList();
//        ReadFile rf = new ReadFile();
//        rf.setFileName(fileName);
        tableList = shList.generateShipmentList(fileName);
        model.addAttribute("tableList",tableList);
        model.addAttribute("message", "Validation");


        return model;
    }


}
