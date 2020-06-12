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



public class LoginPage extends JFrame {

	private JPanel contentPane;
	private PlaceholderTextField username;
	private PlaceholderPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
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
		username.setBounds(99, 67, 179, 26);
		username.setPlaceholder("Username");
		username.setOpaque(true);

		MenuLogin.add(username);
		username.setColumns(10);
		
		JButton Login = new JButton("Login");
		Login.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clicou no Login!!");
			}
		});
		Login.setOpaque(true);
		Login.setBorderPainted(false);
		Login.setBounds(131, 163, 117, 29);
		MenuLogin.add(Login);
		
		pwd = new PlaceholderPasswordField();
		pwd.setOpaque(true);
		pwd.setPlaceholder("Password");
		pwd.setBounds(99, 105, 179, 26);
		MenuLogin.add(pwd);
		
		JLabel registerLbl = new JLabel("Not registered yet?");
		registerLbl.setBounds(82, 291, 124, 16);
		MenuLogin.add(registerLbl);
		
		JLabel signin = new JLabel("Sign in");
		signin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Mudar para a página de Registo!!");
			}
		});
		signin.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		signin.setBounds(218, 291, 61, 16);
		MenuLogin.add(signin);
		
		JLabel pwdLbl = new JLabel("Forgot password?");
		pwdLbl.setBounds(84, 332, 122, 16);
		MenuLogin.add(pwdLbl);
		
		JLabel recover = new JLabel("Recover");
		recover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Ir para a página de recuperação!!");
			}
		});
		recover.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		recover.setBounds(217, 332, 61, 16);
		MenuLogin.add(recover);
		
		JLabel backgroundImage = new JLabel("New label");
        backgroundImage.setBounds(0, 0, 923, 755);
        backgroundImage.setIcon((Icon) new ImageIcon("imagens").getImage().getScaledInstance(backgroundImage.getWidth(),backgroundImage.getHeight(), Image.SCALE_DEFAULT)));
        contentPane.add(backgroundImage);

        setResizable(false);
	}
}
