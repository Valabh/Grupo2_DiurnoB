package com.istec.objetos;

import java.io.Serializable;

//o objeto pode ser representado por uma sequencia de bytes que inclui a informação do objeto (Serializable) //


public class PaginadoVendedor extends user implements Serializable { 
		
		String email;
		String cpf;
		String foto;
		
	
	public PaginadoVendedor(String username,String email,String password,String cpf,String foto) {
		
		
		super(username,password);
		this.cpf=cpf;
		this.email=email;
		this.foto=foto;
			
	}
	
public String getemail(){
		
		return email;
	}
	
	public String getcpf(){
		
		return cpf;
	}
	
	public String getfoto() {
		return foto;
	}
	

}
