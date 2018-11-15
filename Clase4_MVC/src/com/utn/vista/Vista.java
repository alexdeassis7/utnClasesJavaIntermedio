package com.utn.vista;

import javax.swing.JOptionPane;

import com.utn.controlador.calculadoraController;

public class Vista {

	public static void main(String[] args) {
		
		//instanciamos un obj controller!
		//con su constructor por defecto.		
		calculadoraController cc = new calculadoraController();
		
		
		int n1Vista ,n2Vista , ResultadoVista ;
		String OperacionVista;
		System.out.println("############## estoy en la vista pidiendo los datos################");
		//pedir los datos a usuario en la vista!
		n1Vista = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero 1"));
		n2Vista = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero 2"));
		OperacionVista = JOptionPane.showInputDialog("ingrese el operador + para sumar o - para restar ");
		System.out.println("############### estoy en la vista pasando datos al controller#############");
		//pasamos los datos al controller
		ResultadoVista = cc.sumaController(n1Vista, n2Vista, OperacionVista);
		
		System.out.println("###########el resultado que me devolvio el controller es :"+ ResultadoVista);

}
	}
