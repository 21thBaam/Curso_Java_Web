package com.cjw.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maestro")
public class Maestro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String usuario;
	private String no_empleado;
	private String tipo;
	private String estatus;
	private String password;

	public Maestro() {
		
	}
	
	public Maestro(int id, String name, String usuario, String no_empleado, String tipo, String estatus, String password) {
		super();
		this.id = id;
		this.name = name;
		this.usuario = usuario;
		this.setNo_empleado(no_empleado);
		this.tipo = tipo;
		this.estatus = estatus;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getNo_empleado() {
		return no_empleado;
	}
	public void setNo_empleado(String no_empleado) {
		this.no_empleado = no_empleado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
