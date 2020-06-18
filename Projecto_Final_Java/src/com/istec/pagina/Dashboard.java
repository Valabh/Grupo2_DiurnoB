package com.istec.pagina;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;



public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JButton manage;
	private JButton stats;
	private JTabbedPane painel;
	private JPanel drinks;
	private JPanel hotdrinks;
	private JPanel snacks;
	



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
       
        
        JTabbedPane painel = new JTabbedPane(JTabbedPane.TOP);
        painel.setBounds(198, 184, 844, 535);
        contentPane.add(painel);
        
        JPanel drinks = new JPanel();
        painel.addTab("Drinks", null, drinks, null);
        
        JPanel hotdrinks = new JPanel();
        painel.addTab("Hot Drinks", null, hotdrinks, null);
        
        JPanel snack = new JPanel();
        painel.addTab("Snack", null, snack, null);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(826, 26, 266, 142);
        contentPane.add(lblNewLabel);
       


        setResizable(false);
	}
}
