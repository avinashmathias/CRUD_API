package com.crudapi.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormControllers {

	@RequestMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		return "LoginPage";
	}
	
}
