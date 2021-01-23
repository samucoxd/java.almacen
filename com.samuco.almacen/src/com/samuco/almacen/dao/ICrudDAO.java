package com.samuco.almacen.dao;

import java.sql.SQLException;
import java.util.List;

import com.samuco.almacen.model.Pedido;

public interface ICrudDAO<T> {
	
	public List<T> getAll();
	public T getById(int id);
	public int add(T pedido);
	public int update(T pedidoEdit, int id);
	public boolean delete(int id);

}
