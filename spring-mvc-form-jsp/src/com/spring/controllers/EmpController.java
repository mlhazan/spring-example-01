package com.spring.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.beans.Emp;

@Controller
public class EmpController {

	@RequestMapping("/empform")
	public ModelAndView showform(){
		return new ModelAndView("empform","command",new Emp());
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp){
		//write code to save emp object

		//return new ModelAndView("empform","command",emp);
		return new ModelAndView("redirect:/viewemp");
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		//write the code to get all employees from DAO
		//writing manual code for easy understanding
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1,"Alex",55000f,"CEO"));
		list.add(new Emp(2,"John",35000f,"Scrum Master"));
		list.add(new Emp(3,"Rosetta",25000f,"Developer"));
		
		return new ModelAndView("viewemp","list",list);
	}
}
