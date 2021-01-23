package com.samuco.almacen.model;

public class Cliente {
	
	int id;
	int codigo;
	String nombre;
	String zona;
	
	public Cliente(int codigo, String nombre, String zona) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.zona = zona;
	}
	
	
	public Cliente() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}
	
	
	
	

}
