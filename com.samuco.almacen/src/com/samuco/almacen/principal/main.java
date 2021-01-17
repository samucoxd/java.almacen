package com.samuco.almacen.principal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import com.samuco.almacen.config.MysqlConnection;
import com.samuco.almacen.dao.PedidoDAOImpl;
import com.samuco.almacen.model.Pedido;

public class main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = MysqlConnection.getConnection();
		if (con != null) {
			System.out.println("Coneccion Establecida");
			
			Pedido pedido = new Pedido();
			LocalDate date = LocalDate.parse("2018-05-05");
			pedido.setFechaInicial(Date.valueOf(date));
			pedido.setNota(1);
			pedido.setFactura(1);
			pedido.setCliente(1);
			pedido.setVendedor(1);
			pedido.setCobrador(1);
			pedido.setFechaFinal(Date.valueOf(date));
			
			PedidoDAOImpl pedidoDAO = new PedidoDAOImpl();
			pedidoDAO.addPedido(pedido);
			
		}
	}

}
