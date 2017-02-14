package com.spring.mvc.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

     @RequestMapping("/welcome")
     public ModelAndView helloWorld() {
          ModelAndView model = new ModelAndView("HelloPage");
          model.addObject("welcomeMessage", "Hello what's up");
          return model;
     }

     @RequestMapping("/hi")
     public ModelAndView hiWorld() {
          ModelAndView model = new ModelAndView("HelloPage");
          model.addObject("welcomeMessage", "Hello what's up");
          return model;
     }

     @RequestMapping(value = "/welcome/country/{user}")
     public ModelAndView helloVariable(@PathVariable("user") String user) {
          ModelAndView model = new ModelAndView("HelloPage");
          model.addObject("welcomeMessage", "Hello " + user);
          return model;
     }
     @RequestMapping(value = "/welcome/2/{country}/{user}")
     public ModelAndView countryVariable(@PathVariable("user") String userName,@PathVariable("country") String country) {
          ModelAndView model = new ModelAndView("HelloPage");
          model.addObject("welcomeMessage", "Hello " + userName+" You are from "+country);
          return model;
     }
     @RequestMapping(value = "/welcome/3/{country}/{user}")
     public ModelAndView mapVariable(@PathVariable Map<String, String> map) {
          String userName = map.get("user");
          String country = map.get("country");
          ModelAndView model = new ModelAndView("HelloPage");
          model.addObject("welcomeMessage", "Hello " + userName+" You are from "+country);
          return model;
     }
}
