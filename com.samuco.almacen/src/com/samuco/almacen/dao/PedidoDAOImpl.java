package com.samuco.almacen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.samuco.almacen.config.MysqlConnection;
import com.samuco.almacen.model.Pedido;


public class PedidoDAOImpl implements ICrudDAO<Pedido> {

	@Override
	public List<Pedido> getAllPedido() {
		Connection con = null;
		PreparedStatement prepared = null;
		ResultSet result = null;
		ArrayList<Pedido> pedido = new ArrayList<>();
		try {
			con = MysqlConnection.getConnection();
			String selectSQL = "";

			selectSQL = "SELECT * FROM almacen.pedido";

			prepared = con.prepareStatement(selectSQL);

			result = prepared.executeQuery();
			Pedido ped = null;

			while (result.next()) {
				ped = new Pedido();
				ped.setId(result.getInt("id"));
				ped.setFechaInicial(result.getDate("fechaInicial"));
				ped.setNota(result.getInt("nota"));
				ped.setFactura(result.getInt("factura"));
				ped.setCliente(result.getInt("cliente"));
				ped.setVendedor(result.getInt("vendedor"));
				ped.setCobrador(result.getInt("cobrador"));
				ped.setFechaFinal(result.getDate("fechaFinal"));

				pedido.add(ped);
			}
		} catch (SQLException ex) {
			System.out.println("Error al Traer todos los pedidos. " + ex.getMessage());
		}
		return pedido;
	}

	@Override
	public Pedido getPedido(int id){
		Connection con = null;
		PreparedStatement prepared = null;
		ResultSet result = null;

		Pedido ped = null;
		try {
			con = MysqlConnection.getConnection();
			String selectSQL = "";

			selectSQL = "SELECT * FROM almacen.pedido WHERE id = ?";

			prepared = con.prepareStatement(selectSQL);
			prepared.setInt(1, id);
			result = prepared.executeQuery();

			while (result.next()) {
				ped = new Pedido();
				ped = new Pedido();
				ped.setId(result.getInt("id"));
				ped.setFechaInicial(result.getDate("fechaInicial"));
				ped.setNota(result.getInt("nota"));
				ped.setFactura(result.getInt("factura"));
				ped.setCliente(result.getInt("cliente"));
				ped.setVendedor(result.getInt("vendedor"));
				ped.setCobrador(result.getInt("cobrador"));
				ped.setFechaFinal(result.getDate("fechaFinal"));

			}
		} catch (Exception ex) {
			System.out.println("Error al Traer todos los pedidos. " + ex.getMessage());
		}

		return ped;
	}

	@Override
	public int addPedido(Pedido pedido) {
		
		Connection con = null;
		PreparedStatement prepared = null;
		int resultado = 0;

		try {
			con = MysqlConnection.getConnection();
			String insertSQL = "INSERT INTO almacen.pedido(fechaInicial,nota,factura,cliente,"
					+ "vendedor,cobrador,fechaFinal) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
			prepared = con.prepareStatement(insertSQL);
			prepared.setDate(1, pedido.getFechaInicial());
			prepared.setInt(2, pedido.getNota());
			prepared.setInt(3, pedido.getFactura());
			prepared.setInt(4, pedido.getCliente());
			prepared.setInt(5, pedido.getVendedor());
			prepared.setInt(6, pedido.getCobrador());
			prepared.setDate(7, pedido.getFechaFinal());
			resultado = prepared.executeUpdate();
			System.out.println("Pedido Ingresado Correctamente");
		} catch (SQLException ex) {
			System.out.println("Error al ingresar el pedido" + ex.getMessage());
		}
		return resultado;
	}

	@Override
	public int updatePedido(Pedido pedidoEdit, int id) {
		
		Connection con = null;
		PreparedStatement prepared = null;
		int resultado = 0;

		try {
			con = MysqlConnection.getConnection();
			String selectSQL = "";

			selectSQL = "UPDATE almacen.pedido SET "
					+ "fechaInicial = ?,"
					+ "nota = ?,"
					+ "factura = ?,"
					+ "cliente = ?,"
					+ "vendedor = ?,"
					+ "cobrador = ?,"
					+ "fechaFinal = ? "
					+ "WHERE id = ?";

			prepared = con.prepareStatement(selectSQL);
			prepared.setDate(1, pedidoEdit.getFechaInicial());
			prepared.setInt(2, pedidoEdit.getNota());
			prepared.setInt(3, pedidoEdit.getFactura());
			prepared.setInt(4, pedidoEdit.getCliente());
			prepared.setInt(5, pedidoEdit.getVendedor());
			prepared.setInt(6, pedidoEdit.getCobrador());
			prepared.setDate(7, pedidoEdit.getFechaFinal());
			prepared.setInt(8, id);
			resultado = prepared.executeUpdate();

		} catch (Exception ex) {
			System.out.println("Error al Traer todos los pedidos. " + ex.getMessage());
		}

		return resultado;

	}

	@Override
	public boolean deletePedido(int id) {
		
		Connection con = null;
		PreparedStatement prepared = null;
		boolean result = true;

		try {
			con = MysqlConnection.getConnection();
			String selectSQL = "";

			selectSQL = "DELETE FROM almacen.pedido WHERE id = ?";

			prepared = con.prepareStatement(selectSQL);
			prepared.setInt(1, id);
			result = prepared.execute();

			
		} catch (Exception ex) {
			System.out.println("Error al Eliminar el pedidos. " + ex.getMessage());
		}

		return result;

	}

	public void toString(List<Pedido> pedido) {

		Iterator<Pedido> iter = pedido.iterator();
		while (iter.hasNext())
			imprimir(iter.next());
	}

	public void imprimir(Pedido ped) {
		System.out.println(ped.getId() + " " + ped.getFechaInicial() + " " + ped.getNota() + " " + ped.getFactura()
				+ " " + ped.getCliente() + " " + ped.getVendedor() + " " + ped.getCobrador() + " "
				+ ped.getFechaFinal());
	}

}
