package com.istec.objetos;

import java.io.Serializable;

public class Administrador extends user implements Serializable {

	String cpf;
	String vendedortipo;
	
	public Administrador(String username, String password,String cpf,String vendedortipo) {
		super(username, password);
		
		this.cpf=cpf;
		this.vendedortipo=vendedortipo;
		
	}


	
}
