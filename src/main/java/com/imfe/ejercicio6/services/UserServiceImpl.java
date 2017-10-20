package com.imfe.ejercicio6.services;

import org.springframework.stereotype.Service;

import com.imfe.ejercicio6.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	//Definimos constantes
			private final String USUARIO="admin";
			private final String PASS="12345";
			
	@Override
	public boolean serviceValidarUser(User u) {
			
		boolean validador=false;
		
		if(u.getUserName().equals(USUARIO) && u.getPass().equals(PASS)) {
			
			validador=true;
		}
		
			
		return validador;
	}

	@Override
	public User crear(String user, String pass) {
		User u =new User();
		u.setUserName(user);
		u.setPass(pass);
		return u;
	}

}
