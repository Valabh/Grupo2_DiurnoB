package com.istec.pagina;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import com.istec.main.dados;
import com.istec.objetos.produto;
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
			setBounds(100, 100, 900, 641);
				contentPane = new JPanel();
				contentPane.setBackground(Color.BLUE);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				//JButton Manage = new JButton("Manage");
				//Manage.setBounds(20, 13, 117, 29);
				//contentPane.add( Manage);
				 //Manage.addMouseListener(new MouseAdapter() {
					//@Override
					//public void mouseClicked(MouseEvent arg0) {
						//VendasPage vendasp = new VendasPage();
						//vendasp.setVisible(true);
						//dispose();
						
					//}
				//});
		
    manage.setBounds(20, 13, 117, 29);
	contentPane.add(manage);
	
	JButton Stats = new JButton("Stats");
	Stats.setBounds(20, 53, 117, 29);
	contentPane.add(Stats);
	Stats.addActionListener(
	new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Clicou no Stats!");
					}
				});
				Stats.setOpaque(true);
				Stats.setBorderPainted(false);
	 
				
														
				JTabbedPane AdicionarProduto = new JTabbedPane(JTabbedPane.TOP);
				AdicionarProduto.setBounds(146, 106, 684, 385);
				contentPane.add(AdicionarProduto);
				
				JPanel Snacks = new JPanel();
				FlowLayout flowLayout = (FlowLayout) Snacks.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				AdicionarProduto.addTab("Snacks", null, Snacks, null);
	
	
	
	if(dados.getinstance().getprodutos() != null) {
	
	ArrayList<produto> produtos = dados.getinstance().getprodutos();
	
	for (produto p: produtos) {
		 System.out.println(p.getTipodeProduto());
		if (p.getTipodeProduto().equals("Snacks"))
			{	
	
			JLabel lblNewLabel = new JLabel();
			lblNewLabel.setBounds(0, 0, 40, 40);
			lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
			Snacks.add(lblNewLabel);
		}
		}
	}
		
		JPanel HotDrinks = new JPanel();
		FlowLayout flowLayout2 = (FlowLayout)HotDrinks.getLayout();
		flowLayout2.setAlignment(FlowLayout.LEFT);
		AdicionarProduto.addTab("Hot Drinks", null, HotDrinks, null);
	
	if(dados.getinstance().getprodutos() != null) {
		
		ArrayList<produto> produtos = dados.getinstance().getprodutos();
		for (produto p: produtos) {
			if (p.getTipodeProduto().equals("Hot Drinks"))
			{	
			JLabel lblNewLabel_2 = new JLabel();
			lblNewLabel_2.setBounds(0, 0, 40, 40);
			lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel_2.getWidth(),lblNewLabel_2.getHeight(), Image.SCALE_DEFAULT)));
			HotDrinks.add(lblNewLabel_2);
		}
	}
	}
	
		
	JPanel Drinks = new JPanel();
	FlowLayout flowLayout3 = (FlowLayout)Drinks.getLayout();
	flowLayout3.setAlignment(FlowLayout.LEFT);
	AdicionarProduto.addTab("Drinks", null, Drinks, null);
	
	if(dados.getinstance().getprodutos() != null) {
		
		ArrayList<produto> produtos = dados.getinstance().getprodutos();
		for (produto p: produtos) {
			if (p.getTipodeProduto().equals("Drinks")){
						JLabel lblNewLabel_3 = new JLabel();
						lblNewLabel_3.setBounds(0, 0, 40, 40);
						lblNewLabel_3.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel_3.getWidth(),lblNewLabel_3.getHeight(), Image.SCALE_DEFAULT)));
						Drinks.add(lblNewLabel_3);
					}
				}		
	 }
				JLabel Addvendedor = new JLabel("Addvendedor");
	Addvendedor.setBounds(767, 13, 86, 66);
	Addvendedor.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\harsh\\git\\repository\\Projecto_Final_Java\\Image\\addUser.png").getImage().getScaledInstance(Addvendedor.getWidth(),Addvendedor.getHeight(), Image.SCALE_DEFAULT)));
	contentPane.add(Addvendedor);
	Addvendedor.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			vendedor vendores = new vendedor();
			vendores.setVisible(true);
			dispose();
			
		}
	});
	Addvendedor.setBounds(771, 13, 98, 75);
	contentPane.add(Addvendedor);
	
	JLabel Addproduto = new JLabel("Addproduto");
	Addproduto.setBounds(758, 510, 98, 91);
	Addproduto.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\harsh\\git\\repository\\Projecto_Final_Java\\Image\\add.png").getImage().getScaledInstance(Addproduto.getWidth(),Addproduto.getHeight(), Image.SCALE_DEFAULT)));
					contentPane.add(Addproduto);
					Addproduto.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							produto product = new produto();
							product.setVisible(true);
							dispose();
							
						}
					});
					
					contentPane.add(Addproduto);
					
					JPanel panel = new JPanel();
					panel.setBounds(147, 13, 561, 83);
					contentPane.add(panel);
					
					setResizable(false);
					
					 if(dados.getinstance().getprodutos() != null) { 
				        ArrayList<vendedor> vendedores = dados.getinstance().getvendedores();
				        
				        
				        for (vendedor v : vendedores) {
			
				        	JLabel lblvendedor = new JLabel(v.getusername());         	
				        	lblvendedor.setSize(80, 80);
				        	lblvendedor.setHorizontalAlignment(JLabel.CENTER);
				        	lblvendedor.setVerticalTextPosition(JLabel.BOTTOM);
				        	lblvendedor.setHorizontalTextPosition(JLabel.CENTER);
				    		Image imagemv = new ImageIcon(v.getImagemv()).getImage().getScaledInstance(lblvendedor.getWidth(),lblvendedor.getHeight(), Image.SCALE_DEFAULT);
				    		lblvendedor.setIcon(new ImageIcon(imagemv));
				    		panel.add(lblvendedor);
					
					}
				}
		 }
	}
