package com.istec.objetos;

import java.io.Serializable;

@SuppressWarnings("serial")
public class produto implements Serializable {

	String foto;
	String Designacao;
	String Codigo;
	String Preco;
	String TipodeProduto;

	public produto(String foto, String Designacao, String Codigo, String Preco, String TipodeProduto) {

		super();

		this.foto = foto;
		this.Designacao = Designacao;
		this.Codigo = Codigo;
		this.Preco = Preco;
		this.TipodeProduto = TipodeProduto;


	}

	public String getfoto() {

		return foto;
	}

	public String getDesignacao() {

		return Designacao;

	}

	public String Codigo() {

		return Codigo;
	}

	public String getPreco() {

		return Preco;
	}

	public String getTipodeProduto() {

		return TipodeProduto;
	}


}
