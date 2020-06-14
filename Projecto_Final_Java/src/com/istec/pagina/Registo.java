package com.istec.pagina;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.istec.paginas.componentes.PlaceholderPasswordField;
import com.istec.paginas.componentes.PlaceholderTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Label;
import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;
import javax.swing.JComboBox;



public class Registo extends JFrame {

	private JPanel contentPane;
	private PlaceholderTextField companyname;
	private PlaceholderTextField email;
	private PlaceholderTextField vatnumber;
	private PlaceholderPasswordField username;
	private PlaceholderPasswordField pwd;
	private PlaceholderPasswordField confirmarpwd;
	private JComboBox box;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registo frame = new Registo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel MenuLogin = new JPanel();
		MenuLogin.setBorder(new LineBorder(Color.PINK, 2));
		MenuLogin.setBackground(new Color(220, 20, 60));
		MenuLogin.setBounds(283, 195, 365, 379);
		contentPane.add(MenuLogin);
		MenuLogin.setLayout(null);
		
		companyname = new PlaceholderTextField();
		companyname.addFocusListener(new FocusAdapter() {
		});
		companyname.setBounds(99, 67, 179, 26);
		companyname.setPlaceholder("Company Name");
		companyname.setOpaque(true);
		

		MenuLogin.add(companyname);
		companyname.setColumns(10);
		
		PlaceholderTextField vatnumber = new PlaceholderTextField();
		vatnumber.setBounds(99, 104, 179, 26);
		vatnumber.setPlaceholder("Vat Number");
		MenuLogin.add(vatnumber);
		
		PlaceholderTextField email = new PlaceholderTextField();
		email.setBounds(99, 142, 179, 26);
		email.setPlaceholder("email");
		MenuLogin.add(email);
		
		pwd = new PlaceholderPasswordField();
		pwd.setOpaque(true);
		pwd.setPlaceholder("Password");
		pwd.setBounds(99, 218, 179, 26);
		MenuLogin.add(pwd);

		confirmarpwd = new PlaceholderPasswordField();
		confirmarpwd.setOpaque(true);
		confirmarpwd.setPlaceholder("Confirmar Password");
		confirmarpwd.setBounds(99, 255, 179, 26);
		MenuLogin.add(confirmarpwd);
		
		PlaceholderTextField username = new PlaceholderTextField();
		username.setBounds(99, 181, 179, 26);
		username.setPlaceholder("username");
		MenuLogin.add(username);
		
		
		
		JButton Back = new JButton("Back");
		Back.setBounds(21, 325, 117, 29);
		MenuLogin.add(Back);
		Back.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clicou no back!!");
			}
		});
		Back.setOpaque(true);
		Back.setBorderPainted(false);
		
		JButton Register = new JButton("Register");
		Register.setOpaque(true);
		Register.setBorderPainted(false);
		Register.setBounds(222, 325, 117, 29);
		MenuLogin.add(Register);
		
		JComboBox box = new JComboBox();
		box.setBounds(99, 292, 179, 22);
        MenuLogin.add(box);
        box.addItem("Restauração");
        box.addItem("Farmacia");
        box.addItem("Oficina");
        
     


        setResizable(false);
	}
}
