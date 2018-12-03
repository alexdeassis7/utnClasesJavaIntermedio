package com.utn;

//clase padre o clase base !

public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;
	// inicializador de bloque
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
		}
	}

	public int getAsientos() {
		return getAsiento();
	}

	public  int getAsiento() {
		return 150;
	}
	
	public void getAsientosDisponibles() {}
	//{
//
//		for (int i = 0; i < getAsiento(); i++) {
//			System.out.println("asiento " + 1 + asientosDisponibles[i]);
//		}
//	}

	public Vuelo() {

	}

	public Vuelo(char claseVuelo) {

		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {

		this.numVuelo = numVuelo;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible())
			pasajeros += 1;
		else
			FaltaAsiento();

	}

	private boolean asientoDisponible() {

		// valido que el numero de pasajero sean menos a los asientos
		return pasajeros < getAsiento();

	}

	private void FaltaAsiento() {

		System.out.println("YA NO QUEDAN ASIENTOS busque otra aerolinea");

	}

}
