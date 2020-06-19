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
import com.istec.objetos.empresa;
import com.istec.objetos.produto;
import com.istec.objetos.vendedor;

public class dados {
	public static dados instance;
    public empresa emp;
    public vendedor vd;
    public ArrayList<produto> produtos;
    public dados() {
        ler();
        lerprod();
    }

    public static dados getinstance() {
        if (instance == null) {
            instance = new dados();
            return instance;
        }
        return instance;
    }
    
    public boolean Registo(String Nomedaempresa, int vat, String username, String email, String password, String cpf,
            String vendedortipo) {

        Administrador  ad = new Administrador(username,password, cpf, vendedortipo);
        empresa emp = new empresa(Nomedaempresa, vat, ad);
        this.emp = Nomedaempresa;

        guardar();
        return true;
    }
    
    public boolean login(String username, String pwd) {
        if (this.emp != null) {
            if (this.emp.getadministrador().getusername().equals(username) && this.emp.getadministrador().getpassword().equals(pwd)) {
                return true;
            }
        }
        return false;
    }
   
    
    	
    }
}
