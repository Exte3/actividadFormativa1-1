package com.actividad;

public class RegistroProducto {

	//1. Declarar y crear una Colección
	private ArrayList<Medicamento> medicamentos;
	private ArrayList<Suplemento> suplementos;
	
	//2. Agregar Producto (Medicamento o Suplemento Alimenticio), sólo si no existe el código.
	
	public void agregarMedicamento(Medicamento medicamento) {
		//Buscar si existe
		boolean existe = false;
		int index = 0;
		
		while(index < this.medicamentos.size() && !existe) {
			//Encuentro el medicamento
			if(this.medicamentos.get(index).getCodigo().equals(medicamento.getCodigo()) ) {
				existe = true;
			}
		
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
		
		}
		if(!existe) {
			this.suplementos.add(suplemento);
		}
		
	}
	
	//3. Listar todos los Productos(Medicamento o Suplemento Alimenticio) que tengan un precio base superior a los $10000.
	
	//4. Eliminar Producto: Eliminará todos los Productos cuyo precio base es menor a $2.000, indicando cuántos fueron
	
}
