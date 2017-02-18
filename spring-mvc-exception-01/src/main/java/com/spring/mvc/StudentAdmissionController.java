package com.spring.mvc;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

     @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
     public ModelAndView getAdmissionForm() throws Exception{
          String exceptionOccured = "ARITHMETIC_EXCEPTION";
          if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")){
               throw new Exception("Arithmetic Exception");
          }
          
          ModelAndView model = new ModelAndView("admissionForm");
          return model;
     }

     @ModelAttribute
     public void addingCommonObject(Model model) {
          model.addAttribute("headerMessage", "School Of Computer Science");
     }

     @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
     public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student, BindingResult result) {
          if (result.hasErrors()) {
               ModelAndView model = new ModelAndView("admissionForm");
               return model;
          }
          ModelAndView model = new ModelAndView("admissionSuccess");
          model.addObject("student", student);
          return model;
     }
     //Not working
    @InitBinder
     public void initBinder(WebDataBinder binder){
       // binder.setDisallowedFields(new String[]{"studentMobile"});
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
          dateFormat.setLenient(false);
          binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(dateFormat, false));
          binder.registerCustomEditor(String.class,"studentName",new StudentNameEditor());
     }
     
     
}
