package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.vista.ClienteView;

public class ClienteController {

	// objetos vista y modelo
	private ClienteView vista;
	private Cliente modelo;

	// constructor para inicializar el modelo y la vista
	public ClienteController(Cliente modelo, ClienteView vista)

	{
		this.modelo = modelo;
		this.vista = vista;
	}

	// Getteers y Setters del modelo
	public int getId() {
		return modelo.getId();
	}

	public void setId(int id) {
		this.modelo.setId(id);
	}

	public String getNombre() {

		return modelo.getNombre();
	}

	public void setNombre(String nombre) {

		this.modelo.setNombre(nombre);
	}

	public String getApellido() {

		return modelo.getApellido();
	}

	public void setApellido(String apellido) {

		this.modelo.setNombre(apellido);
	}
	
	public int getDni() {

		return modelo.getDni();
	}

	public void setDni(int dni) {

		this.modelo.setDni(dni);
	}
	
	//pasamos el modelo a la vista para poder 
	//presentar los dato
	public void actualizaVista() {
		
		vista.imprimirDatos(modelo.getId(), modelo.getNombre(), modelo.getApellido(), modelo.getDni());
		
	}
	

}
