package com.samuco.almacen.dao;

import java.util.List;

import com.samuco.almacen.model.Pedido;

public interface IPedidoDAO {
	
	public int addPedido(Pedido pedido);
	public List<Pedido> getAllPedido();
	public Pedido getPedido(int id);
	public void updatePedido(int id);
	public void deleteCliente(int id);

}
