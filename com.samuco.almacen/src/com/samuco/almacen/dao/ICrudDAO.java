package com.samuco.almacen.dao;

import java.sql.SQLException;
import java.util.List;

import com.samuco.almacen.model.Pedido;

public interface ICrudDAO<T> {
	
	public List<T> getAllPedido();
	public T getPedido(int id);
	public int addPedido(T pedido);
	public int updatePedido(T pedidoEdit, int id);
	public boolean deletePedido(int id);

}
