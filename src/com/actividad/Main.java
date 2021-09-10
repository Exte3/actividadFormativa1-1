package com.actividad;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Medicamento paracetamol = new Medicamento("101", 6000.0, "Paracetamol 1000mg", true);
		Medicamento ibuprofeno = new Medicamento("102", 3000.0, "Ibuprofeno 500mg", false);
		
		RegistroProducto registroProducto = new RegistroProducto();
		
		
		registroProducto.agregarMedicamento(paracetamol);
		registroProducto.agregarMedicamento(ibuprofeno);
		System.out.println(registroProducto.getMedicamentos());
		
		registroProducto.agregarMedicamento(ibuprofeno);
		System.out.println(registroProducto.getMedicamentos());
		
	}

}
