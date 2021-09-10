package com.actividad;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Medicamento paracetamol = new Medicamento("101", 16000.0, "Paracetamol 1000mg", true);
		Medicamento ibuprofeno = new Medicamento("102", 3000.0, "Ibuprofeno 500mg", false);
		Medicamento loratadina = new Medicamento("103", 500.0, "Loraradina 500mg", false);
		
		Suplemento suplemento1 = new Suplemento("201", 1000.0, "Suplemento1", 3,"A B C");
		Suplemento suplemento2 = new Suplemento("202", 2000.0, "Suplemento2", 4,"C D A E");
		Suplemento suplemento3 = new Suplemento("203", 3000.0, "Suplemento3", 1,"C");
		
		RegistroProducto registroProducto = new RegistroProducto();
		
		System.out.println("-- Medicamentos");
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
		
		// ##########################################
		
		System.out.println("\n-- Suplementos");
		registroProducto.agregarSuplemento(suplemento1);
		registroProducto.agregarSuplemento(suplemento2);
		registroProducto.agregarSuplemento(suplemento3);
		
		registroProducto.listarTodosSuplementos();
		
		registroProducto.recargarSuplementos();
		System.out.println("\nSuplementos Recargo Aplicado");
		
		registroProducto.listarTodosSuplementos();
	}
}
