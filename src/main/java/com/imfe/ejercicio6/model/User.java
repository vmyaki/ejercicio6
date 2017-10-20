package com.imfe.ejercicio6.model;

public class User {
	//Atributos
	private int id;
	private String userName;
	private String pass;
	
	//Constructores
	public User(int id,String userName,String pass) {
		this.id=id;
		this.userName=userName;
		this.pass=pass;
	}
	
	public User() {
		this.id=0;
		this.userName="-";
		this.pass="*";
	}
	
	//Métodos
	
	//Getters and Setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass=pass;
	}
	
	//ToString
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", pass=" + pass + "]";
	}
	
	
}
