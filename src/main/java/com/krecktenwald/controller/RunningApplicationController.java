package com.krecktenwald.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RunningApplicationController {

	@RequestMapping(method = RequestMethod.GET)public String printWelcomeMessage(ModelMap model) {
		model.addAttribute("welcomeMessage", "Welcome to Runner's Tools!");
		return "index";
	}
}
