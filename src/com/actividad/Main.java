package com.actividad;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Medicamento paracetamol = new Medicamento("101", 6000.0, "Paracetamol 1000mg", true);
		Medicamento ibuprofeno = new Medicamento("102", 3000.0, "Ibuprofeno 500mg", false);
		
		Medicamento loratadina = new Medicamento("103", 500.0, "Loraradina 500mg", false);
		
		
		RegistroProducto registroProducto = new RegistroProducto();
		
		
		registroProducto.agregarMedicamento(paracetamol);
		registroProducto.agregarMedicamento(ibuprofeno);
		registroProducto.agregarMedicamento(loratadina);
		System.out.println(registroProducto.getMedicamentos());
		
		registroProducto.agregarMedicamento(ibuprofeno);
		System.out.println(registroProducto.getMedicamentos());
		
		registroProducto.listarMedicamentos();
		registroProducto.listarSuplementos();
		System.out.println("------");
		registroProducto.eliminarMedicamentos();
		System.out.println("------");
		registroProducto.listarMedicamentos();
		
		
		
		
	}

}
