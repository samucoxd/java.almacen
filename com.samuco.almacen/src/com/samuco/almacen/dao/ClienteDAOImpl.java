package com.samuco.almacen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samuco.almacen.config.MysqlConnection;
import com.samuco.almacen.model.Cliente;
import com.samuco.almacen.model.Pedido;

public class ClienteDAOImpl implements ICrudDAO<Cliente>{

	@Override
	public List<Cliente> getAll() {
		Connection con = null;
		PreparedStatement prepared = null;
		ResultSet result = null;
		ArrayList<Cliente> cliente = new ArrayList<>();
		try {
			con = MysqlConnection.getConnection();
			String selectSQL = "";

			selectSQL = "SELECT * FROM almacen.cliente";

			prepared = con.prepareStatement(selectSQL);

			result = prepared.executeQuery();
			Cliente cli = null;

			while (result.next()) {
				cli = new Cliente();
				cli.setId(result.getInt("id"));
				cli.setCodigo(result.getInt("codigo"));
				cli.setNombre(result.getString("nombre"));
				cli.setZona(result.getString("zona"));
				cliente.add(cli);
			}
		} catch (SQLException ex) {
			System.out.println("Error al Traer todos los Clientes. " + ex.getMessage());
		}
		return cliente;
	}

	@Override
	public Cliente getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Cliente pedido) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Cliente pedidoEdit, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "ClienteDAOImpl [getAll()=" + getAll() + "]";
	}

}
