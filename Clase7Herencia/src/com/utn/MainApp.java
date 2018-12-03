package com.utn;

public class MainApp {

	public static void main(String[] args) {

		VueloCarga vc = new VueloCarga();
		vc.agregarPaquete(1, 2, 3);

		Passenger nico = new Passenger();
		Passenger matias = new Passenger();

		vc.agregarPasajero(nico);

		// ejemplo referencia
		// aca solo tene mos acceso a las capacidades que son
		// visibles para la clase de Vuelo , asi que si tratamos de hacer lo siguiente
		Vuelo f = new VueloCarga();
		f.agregarPasajero(matias);
		// ESTO NO SE PUEDE!!!!
		// f.agregarpaquete(1,2,5);

		// supongamos que tenemos una flota o serie de vuelos en el dia y tiene espacio
		// para
		// 4 vuelos

		Vuelo[] flota = new Vuelo[4];
		// podriamos teneer miembro de la clase vuelo y de la clase vueloCarga
		// Mezclados!
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();
		//creo una intancia de vuelo cargo y le asigno una referencia a la clase padre
		//(vuelo)
		Vuelo f2 = new Vuelo();
		System.out.println(f2.getAsientos());
		
		VueloCarga f3 = new VueloCarga();
		System.out.println(f3.getAsientos());
		 //NO SE PUEDE!
		//VueloCarga p  = new Vuelo();
		
		//Object o = new Vuelo();
		
		Object[] o1 = new Object[3];
		o1[0] = new Vuelo();
		o1[1] = new Passenger();
		o1[2] = new VueloCarga();
		
		Object er = new Object();
		
		
		
		
		
		
	}

}
