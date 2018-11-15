package com.utn.clase3Bis;

public class Main {
	
	public static void main (String [] pepe) {
		
	Fecha fecha1 = new Fecha(29, 2, 2015 );
	fecha1.asignarFecha(21,4);
	System.out.println("el dia es : "+fecha1.getDia());
	System.out.println("el mes es : "+fecha1.getMes());
	
	System.out.println("el año es : "+fecha1.getAño());
	
	}
	
}
