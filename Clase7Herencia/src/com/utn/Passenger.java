package com.utn;

public class Passenger{

	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso; // primero crearlo como int para que vean el error
	private double totalaPagar;
	private int totalEquipaje;

	// constructor vacio! avisar que se desaparece cuando creamos otro
	public Passenger() {

	}

	// contructor 2 con un parametro <<< llama al contructor privado
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 25.0d : 50.0d);
		this.bolsos = bolsos;
		totalaPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	}

	// constructor 3 con dos parametros : este llama al constructo 2 que asu vez
	// llama al contructor privado
	public Passenger(int bolsos, int bolsosPagos) {

		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalaPagar = bolsos * tarifaXbolso;
	}

	// primero hago metodo public luego private!
	private Passenger(double tarifaXbolso) {

		this.tarifaXbolso = tarifaXbolso;
	}

	public int getBolsosGratis() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	// public void setBolsosPagos(int bolsosPagos) {
	// this.bolsosPagos = bolsosPagos;
	// }

	//
	// public void setBolsosGratis(int bolsos) {
	// this.bolsos = bolsos;
	// }

	//
	// public void setTarifaXbolso(double tarifaXbolso) {
	// this.tarifaXbolso = tarifaXbolso;
	// }
	//
	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

	public double getTotalaPagar() {
		return totalaPagar;
	}

	public static void mostrarListaDePasajeros(Passenger listaPasajeros[]) {
		for (Passenger p1 : listaPasajeros) {
			System.out.println("****************************************************");
			System.out.println("PASAJERO1 TARIFA POR BOLSO :" + p1.getTarifaXbolso());
			System.out.println("PASAJERO1 total$ :" + p1.getTotalaPagar());
			System.out.println("PASAJERO1 total de bolsos $ :" + p1.getTotalEquipaje());

		}
	}

}
