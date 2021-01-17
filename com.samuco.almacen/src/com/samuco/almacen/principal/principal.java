package com.samuco.almacen.principal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.samuco.almacen.config.MysqlConnection;
import com.samuco.almacen.dao.PedidoDAOImpl;
import com.samuco.almacen.model.Pedido;

public class principal {

	public static void main(String[] args) throws SQLException {
		
		Connection con = MysqlConnection.getConnection();
		if (con != null) {
			System.out.println("Coneccion Establecida");
			
			Pedido pedido = new Pedido();
			PedidoDAOImpl pedidoDAO = new PedidoDAOImpl();
			// ADD
			/*LocalDate date = LocalDate.parse("2018-05-05");
			pedido.setFechaInicial(Date.valueOf(date));
			pedido.setNota(1);
			pedido.setFactura(1);
			pedido.setCliente(1);
			pedido.setVendedor(1);
			pedido.setCobrador(1);
			pedido.setFechaFinal(Date.valueOf(date));
			pedidoDAO.addPedido(pedido);
			*/
			
			// LIST PEDIDO
			/*
			pedidoDAO.toString(pedidoDAO.getAllPedido());
			*/
			
			// GET PEDIDO
			
			pedidoDAO.imprimir(pedidoDAO.getPedido(2));
			
			
			//UPDATE PEDIDO
			/*
			LocalDate date = LocalDate.parse("2000-05-05");
			pedido.setFechaInicial(Date.valueOf(date));
			pedido.setNota(5);
			pedido.setFactura(5);
			pedido.setCliente(5);
			pedido.setVendedor(5);
			pedido.setCobrador(5);
			pedido.setFechaFinal(Date.valueOf(date));
			
			if (pedidoDAO.updatePedido(pedido, 5) == 1) {
				System.out.println("Pedido Actualizado correctamente");
			}
			*/
			
			//DELETE PEDIDO
			/*
			if (pedidoDAO.deletePedido(1) == false) {
				System.out.println("Pedido Eliminado Correctamente");
			}
			*/			
		}
	}
}
