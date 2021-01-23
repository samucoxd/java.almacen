package com.samuco.almacen.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.samuco.almacen.dao.ClienteDAOImpl;
import com.samuco.almacen.model.Cliente;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import java.awt.Window.Type;

public class ClienteView extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteView frame = new ClienteView();
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
	public ClienteView() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 799, 473);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("Listado de Clientes", null, panel, null);
		panel.setLayout(null);
		
		//LISTADO CLIENTE
		listadoCliente();
		
		//TAB 2
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
	}
	
	public void listadoCliente() {
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(65, 40, 666, 350);
		panel.add(panel_1);
		
		table = new JTable();
		table.setBounds(30, 30, 50, 25);


		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Id");
		model.addColumn("Codigo");
		model.addColumn("Nombre");
		model.addColumn("Zona");
		
		table.setModel(model);
		
		String[] dato = new String[4];
		ClienteDAOImpl cliente = new ClienteDAOImpl();
		List<Cliente> cli = cliente.getAll();
		
		for (Cliente row : cli) {
			dato[0] = String.valueOf(row.getId());
			dato[1] = String.valueOf(row.getCodigo());
			dato[2] = String.valueOf(row.getNombre());
			dato[3] = String.valueOf(row.getZona());
			
			model.addRow(dato);
		}
		panel_1.setLayout(null);
		//panel_1.setLayout(null);
		

		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 666, 350);
		scrollPane.setViewportView(table);
		panel_1.add(scrollPane);
		
	}
}
