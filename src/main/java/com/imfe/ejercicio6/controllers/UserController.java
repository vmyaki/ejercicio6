package com.imfe.ejercicio6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imfe.ejercicio6.model.User;
import com.imfe.ejercicio6.services.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
		
		@Autowired
		private UserService servicio; // Con esto creamos el servicio
		
		//Obligamos a que se use el método POST en el formulario
		@RequestMapping(value="/validar", method=RequestMethod.POST) 
		public String validarp(Model model, @RequestParam(name="usuario") String usuario, @RequestParam(name="pass") String pass) {
			
			//Ejecutamos el servicio 'crear' para crear el objeto usuario pasandole los parametros del formulario
			User userTemporal=servicio.crear(usuario, pass);
			
			//Ejecutamos el servicio 'serviceValidarUser' para comprobar la sesión
			boolean validacion=false;
			validacion=servicio.serviceValidarUser(userTemporal);
			
			String destino="index";
			
			if(validacion) { 
				
				model.addAttribute("mensaje", "Login correcto");
				model.addAttribute("user",userTemporal); //Enviamos el objeto a home
				destino="home";
			}
			else {
				
				model.addAttribute("mensaje", "Login incorrecto");
				destino="index";
			}
			
			return destino;
		}
		
		
		//Evitamos que el usuario pueda logearse por el método GET
		@RequestMapping(value="/validar", method=RequestMethod.GET)
		public String validarg(Model model) {
			
			model.addAttribute("mensaje","No puedes logearte así");
			return "index";
		}
		

}
