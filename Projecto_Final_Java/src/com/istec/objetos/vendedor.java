package com.istec.objetos;

import java.io.Serializable;

//o objeto pode ser representado por uma sequencia de bytes que inclui a informação do objeto (Serializable) //


public class vendedor extends user implements Serializable { 
		
		String email;
		String cpf;
		
	
	public vendedor(String username,String email,String password,String cpf) {
		
		
		super(username,password);
		this.cpf=cpf;
		this.email=email;
			
	}
	
public String getemail(){
		
		return email;
	}
	
	public String getcpf(){
		
		return cpf;
	}
	

}
