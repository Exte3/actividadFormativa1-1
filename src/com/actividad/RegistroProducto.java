package com.actividad;

import java.util.ArrayList;

public class RegistroProducto {

	//1. Declarar y crear una Colección
	private ArrayList<Medicamento> medicamentos;
	private ArrayList<Suplemento> suplementos;
	
	//2. Agregar Producto (Medicamento o Suplemento Alimenticio), sólo si no existe el código.
	
	public RegistroProducto() {
		super();
		ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
		ArrayList<Suplemento> suplementos = new ArrayList<Suplemento>();
		
		this.medicamentos = medicamentos;
		this.suplementos = suplementos;
	}
	
	
	public void agregarMedicamento(Medicamento medicamento) {
		//Buscar si existe
		boolean existe = false;
		int index = 0;
		
		while(index < this.medicamentos.size() && !existe) {
			//Encuentro el medicamento
			if(this.medicamentos.get(index).getCodigo().equals(medicamento.getCodigo()) ) {
				existe = true;
			}
			index++;
		
		}
		if(!existe) {
			this.medicamentos.add(medicamento);
		}
		
	}
	


	public void agregarSuplemento(Suplemento suplemento) {
		
		boolean existe = false;
		int index = 0;
		
		while(index < this.suplementos.size() && !existe) {
			//Encuentro el suplemento
			if(this.suplementos.get(index).getCodigo().equals(suplemento.getCodigo()) ) {
				existe = true;
			}
			index++;
		
		}
		if(!existe) {
			this.suplementos.add(suplemento);
		}
		
	}



	
	//3. Listar todos los Productos(Medicamento o Suplemento Alimenticio) que tengan un precio base superior a los $10000.
	public void listarMedicamentos() {
		//Precio base > 10000
		for (int i=0;i<this.medicamentos.size();i++) {
			if(this.medicamentos.get(i).getPrecioBase() > 10000) {
				System.out.println(this.medicamentos.get(i).toString());
			}
		}
	}
	
	public void listarSuplementos() {
		//Precio base > 10000
		for (int i=0;i<this.suplementos.size();i++) {
			if(this.suplementos.get(i).getPrecioBase() > 10000) {
				System.out.println(this.suplementos.get(i).toString());
			}
		}
	}
	
	
	//4. Eliminar Producto: Eliminará todos los Productos cuyo precio base es menor a $2.000, indicando cuántos fueron
	
	public void eliminarMedicamentos() {
		this.medicamentos.removeIf( e -> e.getPrecioBase() < 2000);	
	}

	public void eliminarSuplementos() {
		this.medicamentos.removeIf( e -> e.getPrecioBase() < 2000);	
	}
	
	
	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}


	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}


	public ArrayList<Suplemento> getSuplementos() {
		return suplementos;
	}


	public void setSuplementos(ArrayList<Suplemento> suplementos) {
		this.suplementos = suplementos;
	}
	
	
}
