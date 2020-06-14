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
import java.awt.Panel;



public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel adduser;
	private JButton snacks;
	private JButton Drinks;
	private JButton HotDrinks;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 797);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
        
        
        
        JButton manage = new JButton("Manage");
        manage.setFont(new Font("Arial", Font.BOLD, 11));
        manage.setBackground(new Color(102, 205, 170));
        manage.setBounds(0, 43, 149, 29);
        contentPane.add(manage);
        manage.addActionListener(
        new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "Clicou no manage!!");
        	}
        });
        manage.setOpaque(true);
        manage.setBorderPainted(false);
        
        JButton Stats = new JButton("Stats");
        Stats.setFont(new Font("Arial", Font.BOLD, 11));
        Stats.setBackground(new Color(102, 205, 170));
        Stats.setBounds(0, 83, 149, 29);
        contentPane.add(Stats);
        Stats.setOpaque(true);
        Stats.setBorderPainted(false);
        
        JLabel label = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/addUser.png")).getImage();
        
        JPanel drink = new JPanel();
        drink.setBounds(347, 107, 69, 29);
        contentPane.add(drink);
        
        JLabel drinks = new JLabel("Drinks");
        drink.add(drinks);
        label.setIcon((Icon) img);
        label.setBounds(893, 11, 192, 115);
        contentPane.add(label);
        Image Image = new ImageIcon(this.getClass().getResource("/addUser.png")).getImage();
        label.setIcon((Icon) img);
        
        JPanel hotdrink = new JPanel();
        hotdrink.setBounds(416, 107, 67, 29);
        contentPane.add(hotdrink);
        
        JLabel hotdrinks = new JLabel("Hot Drinks\r\n");
        hotdrink.add(hotdrinks);
        
        JPanel snack = new JPanel();
        snack.setBounds(268, 107, 79, 29);
        contentPane.add(snack);
        
        JLabel Snacks = new JLabel("Snacks\r\n");
        snack.add(Snacks);
        
        JPanel panel = new JPanel();
        panel.setBounds(164, 167, 914, 557);
        contentPane.add(panel);
       


        setResizable(false);
	}
}
