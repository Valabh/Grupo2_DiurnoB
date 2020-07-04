package com.istec.objetos;

import java.io.Serializable;


public class produto implements Serializable {

	String ImagemdoProduto;
	String Designacao;
	String Codigo;
	String Preco;
	String TipodeProduto;

	public produto(String ImagemdoProduto, String Designacao, String Codigo, String Preco, String TipodeProduto) {

		super();

		this.ImagemdoProduto = ImagemdoProduto;
		this.Designacao = Designacao;
		this.Codigo = Codigo;
		this.Preco = Preco;
		this.TipodeProduto = TipodeProduto;


	}

	public String getImagemdoProduto() {

		return ImagemdoProduto;
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
