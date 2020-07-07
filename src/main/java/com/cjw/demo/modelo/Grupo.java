package com.cjw.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupo")
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String clave;
	private String cantidad_alumnos;
	private String estatus;
	
	public Grupo() {
		
	}

	public Grupo(int id, String clave, String cantidad_alumnos, String estatus) {
		super();
		this.id = id;
		this.clave = clave;
		this.cantidad_alumnos = cantidad_alumnos;
		this.estatus = estatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCantidad_alumnos() {
		return cantidad_alumnos;
	}

	public void setCantidad_alumnos(String cantidad_alumnos) {
		this.cantidad_alumnos = cantidad_alumnos;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
