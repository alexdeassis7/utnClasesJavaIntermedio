package com.utn.mvc.demo;

import com.utn.vista.ClienteView;

import com.utn.*;
import com.utn.controlador.ClienteController;
import com.utn.modelo.Cliente;

public class AppMain {

	public static void main(String[] args) {
		//objeto vista, y modelo 
		
		ClienteView vista = new ClienteView();
		Cliente  modelo = llenarDatosCliente();
		//se crea un objeto controlador y 
		//se le pasa un modelo y una vista
		ClienteController controlador = new ClienteController(modelo, vista);
		
		//se muestra los datos del cliente
		controlador.actualizaVista();
		
		///actualizamos un cliente y mostramos los datos nuevamente
		
		controlador.setNombre("felipe");
		controlador.setApellido("RAmon");
		controlador.actualizaVista();
		
	}
	//metodo estatico que retorna el con todos sus datos
	private static Cliente llenarDatosCliente() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(0001);
		cliente1.setApellido("de assis");
		cliente1.setNombre("alex");
		cliente1.setDni(34234);
		
		return cliente1;
	}
	

}
