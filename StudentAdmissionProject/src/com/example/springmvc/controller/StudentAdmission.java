package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmission {

	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submtAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name, @RequestParam("studentHobby")String hobby) {
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details submitted successfully by " + name + ", hobby is "+ hobby);
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hioWorld() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hello!! This is hi.");
		return modelAndView;
	}

}
