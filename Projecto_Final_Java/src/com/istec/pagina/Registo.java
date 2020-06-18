package com.istec.pagina;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;

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

import com.istec.paginas.componentes.PlaceholderPasswordField;
import com.istec.paginas.componentes.PlaceholderTextField;

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
		MenuLogin.setBackground(SystemColor.info);
		MenuLogin.setBounds(291, 21, 364, 637);
		contentPane.add(MenuLogin);
		MenuLogin.setLayout(null);

		companyname = new PlaceholderTextField();
		companyname.addFocusListener(new FocusAdapter() {
		});
		companyname.setBounds(99, 246, 179, 26);
		companyname.setPlaceholder("Company Name");
		companyname.setOpaque(true);

		MenuLogin.add(companyname);
		companyname.setColumns(10);

		PlaceholderTextField vatnumber = new PlaceholderTextField();
		vatnumber.setBounds(99, 283, 179, 26);
		vatnumber.setPlaceholder("Vat Number");
		MenuLogin.add(vatnumber);

		PlaceholderTextField email = new PlaceholderTextField();
		email.setBounds(99, 320, 179, 26);
		email.setPlaceholder("email");
		MenuLogin.add(email);

		pwd = new PlaceholderPasswordField();
		pwd.setOpaque(true);
		pwd.setPlaceholder("Password");
		pwd.setBounds(99, 394, 179, 26);
		MenuLogin.add(pwd);

		confirmarpwd = new PlaceholderPasswordField();
		confirmarpwd.setOpaque(true);
		confirmarpwd.setPlaceholder("Confirmar Password");
		confirmarpwd.setBounds(99, 431, 179, 26);
		MenuLogin.add(confirmarpwd);

		PlaceholderTextField username = new PlaceholderTextField();
		username.setBounds(99, 357, 179, 26);
		username.setPlaceholder("username");
		MenuLogin.add(username);

		JButton Back = new JButton("Back");
		Back.setBounds(10, 501, 117, 29);
		MenuLogin.add(Back);
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clicou no back!!");
			}
		});
		Back.setOpaque(true);
		Back.setBorderPainted(false);

		JButton Register = new JButton("Register");
		Register.setOpaque(true);
		Register.setBorderPainted(false);
		Register.setBounds(226, 501, 117, 29);
		MenuLogin.add(Register);

		JComboBox box = new JComboBox();
		box.setBounds(99, 468, 179, 22);
		MenuLogin.add(box);
		box.addItem("Restauração");
		box.addItem("Farmacia");
		box.addItem("Oficina");

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(99, 11, 172, 176);
		MenuLogin.add(lblNewLabel);
		lblNewLabel.setBorder(new LineBorder(Color.BLACK, 4));

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jchooser = new JFileChooser();
				int j = jchooser.showSaveDialog(null);

				if (j == JFileChooser.APPROVE_OPTION)

				{
					JOptionPane.showMessageDialog(null, jchooser.getSelectedFile().getAbsolutePath()); 
					lblNewLabel.setIcon(new ImageIcon(new ImageIcon( jchooser.getSelectedFile().getAbsolutePath()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
					// set the label to the path of the selected file

				}
				// if the user cancelled the operation
				else {
					JOptionPane.showMessageDialog(null, "the user cancelled the operation");
				}
			}
		});
		button.setBounds(99, 201, 179, 23);
		MenuLogin.add(button);

		setResizable(false);
	}
}
