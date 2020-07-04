package com.istec.objetos;

import java.io.Serializable;


public class produto implements Serializable {

	String ImagemdoProduto;
	String Designacao;
	int Codigo;
	int Preco;
	String TipodeProduto;
	String Foto;

	public produto(String ImagemdoProduto, String Designacao, int Codigo, int Preco, String TipodeProduto, String Foto) {

		super();

		this.ImagemdoProduto = ImagemdoProduto;
		this.Designacao = Designacao;
		this.Codigo = Codigo;
		this.Preco = Preco;
		this.TipodeProduto = TipodeProduto;
		this.Foto= Foto;

	}

	public String getImagemdoProduto() {

		return ImagemdoProduto;
	}

	public String getDesignacao() {

		return Designacao;

	}

	public int Codigo() {

		return Codigo;
	}

	public int getPreco() {

		return Preco;
	}

	public String getTipodeProduto() {

		return TipodeProduto;
	}
	public String getFoto() {

		return Foto;
	}

}
