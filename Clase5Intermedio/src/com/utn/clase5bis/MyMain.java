package com.utn.clase5bis;

public class MyMain {

	public static void main(String[] args) {
		// definimos un array de Pasajeros
		 Passenger[] ListaDePasajeros = new Passenger[4];
		
		 ListaDePasajeros[0] = new Passenger(1);
		
		 ListaDePasajeros[1] = new Passenger(3);
		
		 ListaDePasajeros[2] = new Passenger(10, 7);
		
		 ListaDePasajeros[3] = new Passenger(1, 7);
		 int i = 0;
		 for (Passenger VariblePassajeroLocal : ListaDePasajeros) {
		
		 System.out.println("Pasajero " + i + " tarifa por maleta" +
		 VariblePassajeroLocal.getTarifaPorMaleta());
		 System.out.println("pasajero " + i + " total a pagar " +
		 VariblePassajeroLocal.getTotalAPagar());
		 System.out.println("pasajero " + i + " total de maletas que lleva" +
		 VariblePassajeroLocal.getTotalDeEquipaje());
		 System.out.println("********************************************");
		 i = i +1;
		 }

//		try {
//			//try = intentar
//			System.out.println("intentamos ejecutar un bloque de "
//					+ "intrucciones");
//			System.out.println("instruccion 1");
//			System.out.println("instruccion 2");
//			int numero = Integer.parseInt("Alex");
//
//			System.out.println("instruccion 3");
//			
//		} catch (Exception pepe) {
//			//catch = Atrapar
//			//pepe es el nombre de la variable de tipo Exception
//			System.out.println(pepe);
//			System.out.println("instrucciones a ejecutar cuando sucede"
//					+ " un error!!");
//
//		}
//
//		finally {
//			System.out.println("Instrucciones a ejecutar tanto"
//					+ " si se produce un error como si no se produce");
//		}

	}

}
