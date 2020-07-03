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
import javax.swing.SwingConstants;



public class RecoverPassword extends JFrame {

	private JPanel contentPane;
	private PlaceholderPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecoverPassword frame = new RecoverPassword();
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
	public RecoverPassword() {
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
		
		PlaceholderTextField email = new PlaceholderTextField();
		email.setBounds(99, 81, 179, 26);
		email.setPlaceholder("Insert a registered email");
		MenuLogin.add(email);
		
		JButton Back = new JButton("Back");
		Back.setBounds(129, 231, 117, 26);
		MenuLogin.add(Back);
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					LoginPage login = new LoginPage();
					login.setVisible(true);
					dispose();
					}
		});
		
		
		
		JButton Recover = new JButton("Recover");
		Recover.setBounds(129, 152, 117, 29);
		MenuLogin.add(Recover);
		Recover.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clicou no recover!!");
			}
		});
		Recover.setOpaque(true);
		Recover.setBorderPainted(false);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.setOpaque(true);
		Cancel.setBorderPainted(false);
		Cancel.setBounds(129, 192, 117, 29);
		MenuLogin.add(Cancel);
		
        
        JLabel RecoverPassword = new JLabel("Recover Password");
        RecoverPassword.setHorizontalAlignment(SwingConstants.CENTER);
        RecoverPassword.setFont(new Font("Arial", Font.BOLD, 14));
        RecoverPassword.setBounds(99, 45, 179, 14);
        MenuLogin.add(RecoverPassword);
        
        JLabel backgroundImage = new JLabel("New label");
		backgroundImage.setBounds(0, 0, 923, 755);
		backgroundImage.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\harsh\\git\\repository\\Projecto_Final_Java\\Image\\POS.jpg").getImage().getScaledInstance(backgroundImage.getWidth(),backgroundImage.getHeight(), Image.SCALE_DEFAULT)));
		contentPane.add(backgroundImage);
       


        setResizable(false);
	}
}
