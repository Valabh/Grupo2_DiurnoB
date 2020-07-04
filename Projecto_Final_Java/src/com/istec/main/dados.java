package com.istec.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.istec.objetos.Administrador;
import com.istec.objetos.PaginadoVendedor;
import com.istec.objetos.empresa;
import com.istec.objetos.produto;
public class dados {

    public static dados instance;
    public empresa emp;
    public PaginadoVendedor vd;
    public ArrayList<produto> produtos;
    public ArrayList<PaginadoVendedor> vendedores= new ArrayList<PaginadoVendedor>();
    public dados() {
    	ler();
    	lerVend();
    	lerProd();
    }
    

public static dados getinstance() {
    if (instance == null) {
        instance = new dados();
        return instance;
    }
    return instance;
}
	//REGISTO
public boolean Registo(int vat, String Nomedaempresa,String username,String email,String password,String cpf, String vendedortipo) {

    Administrador  ad = new Administrador(username,password, cpf, vendedortipo);
    empresa emp = new empresa(Nomedaempresa, vat, ad);
    this.emp = emp;

    guardar();
    return true;
}

//LOGIN
public boolean login(String username, String password) {
    if (this.emp != null) {
        if (this.emp.getadministrador().getusername().equals(username) && this.emp.getadministrador().getpassword().equals(password)) {
            return true;
        }
    }
    return false;
    
    
}
public  void guardar() {
    try {
        ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream(new File("empresa.dat")));
        objs.writeObject(emp);
        objs.close();
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

public  boolean ler() {
    try {
        ObjectInputStream objs = new ObjectInputStream(new FileInputStream(new File("empresa.dat")));
        empresa result = (empresa) objs.readObject();
        this.emp = result;
        objs.close();
        return true;
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
    return false;
    } catch (IOException e) {
        return false;

    } catch (ClassNotFoundException e) {
        return false;

    }
}



//VENDEDOR
public boolean VendedorRegisto(String username,String email,String password,String cpf, String foto) 
{

	PaginadoVendedor  vend = new PaginadoVendedor(username,email,password,cpf,foto);
    if(this.vendedores==null) {
    
this.vendedores= new ArrayList<PaginadoVendedor>();
    }
    this.vendedores.add(vend);
    guardarVend();
    return true;
}

//VENDAS
public boolean ProdutoRegisto(String ImagemdoProduto, String Designacao, String Codigo, String Preco, String TipodeProduto) 
{

    produto  prod = new produto (ImagemdoProduto, Designacao ,Codigo,Preco,TipodeProduto);
    if (this.produtos == null) {
    this.produtos = new ArrayList<produto>();
    }
    this.produtos.add(prod);
    guardarProd();
    return true;
}

public  void guardarVend() {
    try {
        ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream(new File("regisvend.dat")));
        objs.writeObject(this.vendedores);
        objs.close();
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

public  void guardarProd() {
    try {
        ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream(new File("produto.dat")));
        objs.writeObject(this.produtos);
        objs.close();
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
public  boolean lerProd() {
    try {
        ObjectInputStream objs = new ObjectInputStream(new FileInputStream(new File("produto.dat")));
        ArrayList<produto> result = (ArrayList<produto>) objs.readObject();
        this.produtos = result;
        objs.close();
        return true;
    } catch (FileNotFoundException e) {
        this.produtos = new ArrayList<produto>();
        // TODO Auto-generated catch block
    return false;
    } catch (IOException e) {
        return false;

    } catch (ClassNotFoundException e) {
        return false;

    }
}
public  boolean lerVend() {
    try {
        ObjectInputStream objs = new ObjectInputStream(new FileInputStream(new File("regisvend.dat")));
        ArrayList<PaginadoVendedor> result1 = (ArrayList<PaginadoVendedor>) objs.readObject();
        this.vendedores = result1;
        objs.close();
        return true;
    } catch (FileNotFoundException e) {
        this.vendedores = new ArrayList<PaginadoVendedor>();
        // TODO Auto-generated catch block
    return false;
    } catch (IOException e) {
        return false;

    } catch (ClassNotFoundException e) {
        return false;

    }
}

public ArrayList<produto> getprodutos() {
    return produtos;
}

public void setprodutos(ArrayList<produto> produtos) {
    this.produtos = produtos;
}

public ArrayList<PaginadoVendedor> getvendedores() {
    return vendedores;
}

public void setVendedores(ArrayList<PaginadoVendedor> vendedores) {
    this.vendedores = vendedores;
}



}


