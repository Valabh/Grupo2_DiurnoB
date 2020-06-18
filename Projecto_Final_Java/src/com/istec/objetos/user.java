package com.istec.objetos;

import java.io.Serializable;

public class user implements Serializable{
	
	String username;
	String password;
	
	public user(String username, String password) {
		
		super();
		
		this.username=username;
		this.password=password;
		
		
	}

	public String getusername(){
		
		return username;
	}
	
	public String getpassword(){
		
		return password;
	}
	
	
}
