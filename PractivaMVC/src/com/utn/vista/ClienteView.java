package com.utn.vista;

public class ClienteView {

	public void imprimirDatos( int id,String nombre, String apellido,int  dni)
	
	{
		System.out.println("ESTOY EN LA VISTA");
		System.out.println("DATOS DEL CLIENTE");
		System.out.println("ID: "+ id);
		System.out.println("nombre : "+nombre);
		System.out.println("apllido : "+ apellido);
		System.out.println("dni : "+ dni);
		
		
	}
}
