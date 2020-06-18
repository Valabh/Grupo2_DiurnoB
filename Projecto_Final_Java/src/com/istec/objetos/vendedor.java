package com.istec.objetos;
//o objeto pode ser representado por uma sequencia de bytes que inclui a informação do objeto (Serializable) //


public class vendedor extends user implements Serializable { 
	
	String username;
	String email;
	String password;
	String cpf;
	
	public vendedor(String username,String email,String password,String cpf) {
		
		super(username,password);
		this.cpf=cpf;
		
		
		
	}

}
