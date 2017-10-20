package com.imfe.ejercicio6.services;

import com.imfe.ejercicio6.model.User;

public interface UserService {
	
		public boolean serviceValidarUser(User u); //Servicio que devuelve un boolean y le pasamos el objeto user (compuesto de id,username,pass)
		public User crear (String user, String pass); // Servicio que devuelve un objeto pasándole un user y un pass

}
