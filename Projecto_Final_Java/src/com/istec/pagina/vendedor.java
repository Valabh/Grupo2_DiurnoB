package com.istec.pagina;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.istec.main.dados;
import com.istec.objetos.PaginadoVendedor;
import com.istec.paginas.componentes.PlaceholderPasswordField;
import com.istec.paginas.componentes.PlaceholderTextField;

public class vendedor extends JFrame {

	private JPanel contentPane;
	private PlaceholderPasswordField pwd;
	private PlaceholderPasswordField cfn;
	private PlaceholderTextField email;
	private PlaceholderTextField username;
	private String imagepath;
	
	public vendedor() {
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
		
				
		JButton Back = new JButton("Back");
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					Dashboard gestao = new Dashboard();
					gestao.setVisible(true);
					dispose();
					}
		});
		Back.setOpaque(true);
		Back.setBorderPainted(false);
		Back.setBounds(50, 302, 117, 29);
		MenuLogin.add(Back);
		
		pwd = new PlaceholderPasswordField();
		pwd.setOpaque(true);
		pwd.setPlaceholder("Password");
		pwd.setBounds(99, 183, 179, 26);
		MenuLogin.add(pwd);
		
		cfn = new PlaceholderPasswordField();
		cfn.setOpaque(true);
		cfn.setPlaceholder("Confirm Password");
		cfn.setBounds(99, 220, 179, 26);
		MenuLogin.add(cfn);
		
		JButton Registo = new JButton("Registo");
		Registo.addActionListener(
				new ActionListener() {
					

					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e) {
					if (dados.getinstance().VendedorRegisto(username.getText(),email.getText(),pwd.getText(), imagepath)){
						dispose(); 
						Dashboard gestao = new Dashboard();
						gestao.setVisible(true);
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

		
		JLabel AddVendedor = new JLabel("Adicionar Vendedor");
		AddVendedor.setBounds(113, 11, 123, 87);
		MenuLogin.add(AddVendedor);
		AddVendedor.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\harsh\\git\\repository\\Projecto_Final_Java\\Image\\addUser.png").getImage().getScaledInstance(AddVendedor.getWidth(),AddVendedor.getHeight(), Image.SCALE_DEFAULT)));
		AddVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser jFileChooser = new JFileChooser();
				jFileChooser.setDialogTitle("save file");
				int result = jFileChooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
						try {
				//			imagepath = jFileChooser.getSelectedFile().getAbsolutePath();
						} catch (Exception e) {
							
							e.printStackTrace();
						}
						// TODO Auto-generated catch block
				}
			}
		});
				
		setResizable(false);
	}
}