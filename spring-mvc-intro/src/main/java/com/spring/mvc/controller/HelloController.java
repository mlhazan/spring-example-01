package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {
     @Override
     protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
          ModelAndView modelandview = new ModelAndView("HelloPage");
          modelandview.addObject("welcomeMessage", "What up");
          return modelandview;
     }
}
