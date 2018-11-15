package com.utn.controlador;

import com.utn.modelo.Calculadora;

public class calculadoraController {
	//instaciamos un objeto Calculadora 
	//usando el constructor por defecto (VACIO)
	Calculadora c1 = new Calculadora();
	
	
	//este es el metodo que recibira los 
	//datos de la vista!!
	public int sumaController(int n1 ,int n2 ,String opVista) {
		//esta es la variable que devolvemos
		//a la vista
		int resultadoController = 0;

		System.out.println("**************soy el controller recibi los datos de la vista y se los seteo al modelo *****************");
		
		//seteamos los datos al objeto del modelo
		c1.setNum1(n1);
		c1.setNum2(n2);
		c1.setOp(opVista);
		c1.calcular();
		
		resultadoController = c1.getResultado();
		
		System.out.println("************soy el controller estoy devolviendo el resultado a la vista***********");
		
		return resultadoController;
		
	}
	
	
	
}
