package com.imfe.ejercicio6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
		
	@RequestMapping(value= {"/","/index"})
	public String index () {
		return "index";
	}
	
}
