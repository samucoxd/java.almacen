package com.samuco.almacen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.samuco.almacen.config.MysqlConnection;
import com.samuco.almacen.model.Pedido;

public class PedidoDAOImpl implements IPedidoDAO {

	@Override
	public List<Pedido> getAllPedido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido getPedido(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement prepared = null;
        int resultado = 0;

        try {
            con = MysqlConnection.getConnection();
            String insertSQL = "INSERT INTO almacen.pedido(fechaInicial,nota,factura,cliente,vendedor,cobrador,fechaFinal) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
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
	public void updatePedido(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCliente(int id) {
		// TODO Auto-generated method stub
		
	}

}
