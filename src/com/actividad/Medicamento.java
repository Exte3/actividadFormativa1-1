package com.actividad;

public class Medicamento {
	private String codigo;
	private Double precioBase;
	private String nombre;
	private Boolean generico;
	private String contraindicaciones;
	
	public Medicamento(String codigo, Double precioBase, String nombre, Boolean generico) {
		super();
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.generico = generico;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getGenerico() {
		return generico;
	}

	public void setGenerico(Boolean generico) {
		this.generico = generico;
	}

	public String getContraindicaciones() {
		return contraindicaciones;
	}

	public void setContraindicaciones(String contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}

	@Override
	public String toString() {
		return "Medicamento [codigo=" + codigo + ", precioBase=" + precioBase + ", nombre=" + nombre + ", generico="
				+ generico + ", contraindicaciones=" + contraindicaciones + "]";
	}
	
	
	
	
}
