package com.spring.mvc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

     @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
     public ModelAndView getAdmissionForm() {
          ModelAndView model = new ModelAndView("admissionForm");
          //model.addObject("headerMessage", "This is a Header Message");
          return model;
     }

//     @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
//     public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
//             @RequestParam("studentHobby") String hobby,
//             @RequestParam("studentDOB") String DOB,
//             @RequestParam("studentMobile") String mobile,
//             @RequestParam("studentSkills") String[] skills) {
//          ModelAndView model = new ModelAndView("admissionSuccess");
//          /**
//           * This is most basic way
//           */
//          model.addObject("msg", "Name : " + name + " Hobby : " + hobby);
//          /**
//           * Using getter and setters
//           */
//          SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//
//          Student student = new Student();
//
//          try {
//               student.setStudentName(name);
//               student.setStudentHobby(hobby);
//               student.setStudentMobile(Long.parseLong(mobile));
//               student.setStudentDOB(format.parse(DOB));
//               
//               ArrayList<String>skillsList = new ArrayList<String>();
//               for(int i =0; i<skills.length; i++){
//                    skillsList.add(skills[i]);
//               }
//               student.setStudentSkills(skillsList);
//          } catch (ParseException ex) {}
//          model.addObject("student", student);
//          return model;
//     }
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

}
