package com.actividad;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Medicamento paracetamol = new Medicamento("101", 16000.0, "Paracetamol 1000mg", true);
		Medicamento ibuprofeno = new Medicamento("102", 3000.0, "Ibuprofeno 500mg", false);
		Medicamento loratadina = new Medicamento("103", 500.0, "Loraradina 500mg", false);
		
		Suplemento suplemento1 = new Suplemento("201", 1000.0, "Suplemento1", 3,"A B C");
		
		
		RegistroProducto registroProducto = new RegistroProducto();
		
		
		registroProducto.agregarMedicamento(paracetamol);
		registroProducto.agregarMedicamento(ibuprofeno);
		registroProducto.agregarMedicamento(loratadina);
		
		registroProducto.listarTodosMedicamentos();
		
		registroProducto.recargarMedicamentos();
		System.out.println("\nMedicamentos Recargo Aplicado");
		
		registroProducto.listarTodosMedicamentos();
		
		System.out.println("\nEliminar < $2000");
		registroProducto.eliminarMedicamentos();
		registroProducto.listarTodosMedicamentos();
		
		//SOLO PRODUCTOS > $10.000
		System.out.println("\nMedicamentos > $10000\n");
		registroProducto.listarMedicamentos();	
	}
}
