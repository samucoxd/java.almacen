package com.samuco.almacen.dao;

import java.sql.SQLException;
import java.util.List;

import com.samuco.almacen.model.Pedido;

public interface IPedidoDAO {
	
	public List<Pedido> getAllPedido();
	public Pedido getPedido(int id);
	public int addPedido(Pedido pedido);
	public int updatePedido(Pedido pedidoEdit, int id);
	public boolean deletePedido(int id);

}
