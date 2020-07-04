package com.istec.pagina;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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

import com.istec.main.dados;
import com.istec.paginas.componentes.PlaceholderPasswordField;
import com.istec.paginas.componentes.PlaceholderTextField;

public class PaginadoProduto extends JFrame {

	private JPanel contentPane;
	private PlaceholderTextField Designacao;
	private PlaceholderTextField Codigo;
	private PlaceholderPasswordField Preco;
	
	
	private JComboBox Tipo_produto;

	public PaginadoProduto() {
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
		
		
		Designacao = new PlaceholderTextField();
		Designacao.setBounds(99, 109, 179, 26);
		Designacao.setPlaceholder("Designação");
		Designacao.setOpaque(true);

		MenuLogin.add(Designacao);
		Designacao.setColumns(10);
		
		Codigo = new PlaceholderTextField();
		Codigo.setBounds(99, 146, 179, 26);
		Codigo.setPlaceholder("Código");
		Codigo.setOpaque(true);

		MenuLogin.add(Codigo);
		Codigo.setColumns(10);
		
		
		
		JButton Back = new JButton("Cancelar");
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
		
		Preco = new PlaceholderPasswordField();
		Preco.setOpaque(true);
		Preco.setPlaceholder("Preço");
		Preco.setBounds(99, 183, 179, 26);
		MenuLogin.add(Preco);
		
		JComboBox Tipo_produto = new JComboBox();
		Tipo_produto.setBounds(99, 220, 179, 22);
		MenuLogin.add(Tipo_produto);
		Tipo_produto.addItem("Snacks");
		Tipo_produto.addItem("Drinks");
		Tipo_produto.addItem("Hot Drinks");
		
		
		JButton Registo = new JButton("Registo");
		Registo.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, Tipo_produto.getSelectedItem());
				if(dados.getinstance().ProdutoRegisto(Designacao.getText(), Codigo.getText(), Preco.getText() , (String) Tipo_produto.getSelectedItem())) {
					Dashboard gestao = new Dashboard();
					gestao.setVisible(true);
				}else {
				JOptionPane.showMessageDialog(null, "Erro");
			}
			}
		});
		
		Registo.setOpaque(true);
		Registo.setBorderPainted(false);
		Registo.setBounds(213, 302, 117, 29);
		MenuLogin.add(Registo);
		
		
		JLabel AddProduto = new JLabel("AddProduto");
		AddProduto.setBounds(131, 11, 98, 91);
		MenuLogin.add(AddProduto);
		AddProduto.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gonga\\git\\Grupo1_DiurnoB\\ProjetoFinal\\add.png").getImage().getScaledInstance(AddProduto.getWidth(),AddProduto.getHeight(), Image.SCALE_DEFAULT)));
		AddProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser jFileChooser = new JFileChooser();
				jFileChooser.setDialogTitle("save file");
				int result = jFileChooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
						try {
							imagepath = jFileChooser.getSelectedFile().getAbsolutePath();
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