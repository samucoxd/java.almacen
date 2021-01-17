package com.samuco.almacen.model;

import java.sql.Date;

public class Pedido {
	
	int id;
	Date fechaInicial;
	int nota;
	int factura;
	int cliente;
	int vendedor;
	int cobrador;
	Date fechaFinal;
	
	public Pedido(int id, Date fechaInicial, int nota, int factura, int cliente, int vendedor, int cobrador,
			Date fechaFinal) {
		super();
		this.id = id;
		this.fechaInicial = fechaInicial;
		this.nota = nota;
		this.factura = factura;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.cobrador = cobrador;
		this.fechaFinal = fechaFinal;
	}
	
	public Pedido() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getFactura() {
		return factura;
	}

	public void setFactura(int factura) {
		this.factura = factura;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public int getVendedor() {
		return vendedor;
	}

	public void setVendedor(int vendedor) {
		this.vendedor = vendedor;
	}

	public int getCobrador() {
		return cobrador;
	}

	public void setCobrador(int cobrador) {
		this.cobrador = cobrador;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	
	

}
