package com.istec.pagina;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.istec.main.dados;
import com.istec.paginas.componentes.PlaceholderPasswordField;
import com.istec.paginas.componentes.PlaceholderTextField;
import javax.swing.JTextField;

public class Registo extends JFrame {

	private JPanel contentPane;
	private PlaceholderTextField username;
	private PlaceholderPasswordField password;
	private PlaceholderTextField Nomedeempresa;
	private PlaceholderTextField vat;
	private PlaceholderTextField email;
	private PlaceholderPasswordField cpf;
	private JComboBox box;

	
	public Registo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MenuLogin = new JPanel();
		MenuLogin.setBackground(new Color(204, 204, 204, 150));
		MenuLogin.setBounds((getWidth()/2)-(365/2), (getHeight()/2)-(379/2), 365, 379);
		contentPane.add(MenuLogin);
		MenuLogin.setLayout(null);
		
		Nomedeempresa = new PlaceholderTextField();
		Nomedeempresa.setBounds(99, 35, 179, 26);
		Nomedeempresa.setPlaceholder("Nomedeempresa");
		Nomedeempresa.setOpaque(true);

		MenuLogin.add(Nomedeempresa);
		Nomedeempresa.setColumns(10);
		
		vat = new PlaceholderTextField();
		vat.setBounds(99, 72, 179, 26);
		vat.setPlaceholder("VAT Number");
		vat.setOpaque(true);

		MenuLogin.add(vat);
		vat.setColumns(10);
		
		username = new PlaceholderTextField();
		username.setBounds(99, 109, 179, 26);
		username.setPlaceholder("Username");
		username.setOpaque(true);

		MenuLogin.add(username);
		username.setColumns(10);
		
		email = new PlaceholderTextField();
		email.setBounds(99, 146, 179, 26);
		email.setPlaceholder("Email");
		email.setOpaque(true);

		MenuLogin.add(email);
		email.setColumns(10);
		
		JButton Registo = new JButton("Registo");
		Registo.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (dados.getinstance().Registo(Integer.valueOf(vat.getText()), Nomedeempresa.getText(), username.getText(), email.getText(), password.getText(), cpf.getText(), (String) box.getSelectedItem())) {
				dispose(); 
				LoginPage login = new LoginPage();
				login.setVisible(true);
				dispose();
				
			}else {
				JOptionPane.showMessageDialog(null, "Erro no Registo");

			}
			
			}
		});
		Registo.setOpaque(true);
		Registo.setBorderPainted(false);
		Registo.setBounds(213, 302, 117, 29);
		MenuLogin.add(Registo);
		
		JButton Back = new JButton("Back");
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					LoginPage login = new LoginPage();
					login.setVisible(true);
					dispose();
					}
		});
		Back.setOpaque(true);
		Back.setBorderPainted(false);
		Back.setBounds(50, 302, 117, 29);
		MenuLogin.add(Back);
		
		password = new PlaceholderPasswordField();
		password.setOpaque(true);
		password.setPlaceholder("Password");
		password.setBounds(99, 183, 179, 26);
		MenuLogin.add(password);
		
		cpf = new PlaceholderPasswordField();
		cpf.setOpaque(true);
		cpf.setPlaceholder("Confirm Password");
		cpf.setBounds(99, 220, 179, 26);
		MenuLogin.add(cpf);
		
		box = new JComboBox();
		box.setBounds(99, 257, 179, 22);
		MenuLogin.add(box);
		box.addItem("Restauração");
		box.addItem("Farmacia");
		box.addItem("Oficina");
		
		JLabel backgroundImage = new JLabel("New label");
		backgroundImage.setBounds(0, 0, 923, 755);
		backgroundImage.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\rodrigo\\git\\projetofinal\\ProjetoFinal\\POS.jpg").getImage().getScaledInstance(backgroundImage.getWidth(),backgroundImage.getHeight(), Image.SCALE_DEFAULT)));
		contentPane.add(backgroundImage);
		
		setResizable(false);
	}
}
