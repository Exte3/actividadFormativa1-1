package com.actividad;

public class Suplemento {
	private String codigo;
	private double precioBase;
	private String nombre;
	//private boolean generico;
	private int cantidadVitaminas;
	private String informacionVitaminas;
	//private String contraindicaciones;
	
	public Suplemento() {
		super();
		this.precioBase = 0;
	}
	public Suplemento(String codigo, double precioBase, String nombre, int cantidadVitaminas,
			String informacionVitaminas) {
		super();
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.cantidadVitaminas = cantidadVitaminas;
		this.informacionVitaminas = informacionVitaminas;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadVitaminas() {
		return cantidadVitaminas;
	}
	public void setCantidadVitaminas(int cantidadVitaminas) {
		this.cantidadVitaminas = cantidadVitaminas;
	}
	public String getInformacionVitaminas() {
		return informacionVitaminas;
	}
	public void setInformacionVitaminas(String informacionVitaminas) {
		this.informacionVitaminas = informacionVitaminas;
	}
	
}
