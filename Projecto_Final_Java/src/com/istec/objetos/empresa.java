package com.istec.objetos;

import java.io.Serializable;
import java.util.ArrayList;

public class empresa implements Serializable{
	
	String Nomedaempresa;
	int Numerodecontribuinte;
	Administrador administrador;
	
	ArrayList<PaginadoVendedor> vendedores;
	 
	public empresa(String Nomedaempresa, int Numerodecontribuinte, Administrador administrador) {
		
		super();
		
		this.Nomedaempresa=Nomedaempresa;
		this.Numerodecontribuinte=Numerodecontribuinte;
		this.administrador=administrador;
	}

	
	public String getNomedaempresa() {

		return Nomedaempresa;
	}
	
	public int getNumerodecontribuinte() {

		return Numerodecontribuinte;
	}
	
	public Administrador getadministrador() {

		return administrador;
	}
	
}

