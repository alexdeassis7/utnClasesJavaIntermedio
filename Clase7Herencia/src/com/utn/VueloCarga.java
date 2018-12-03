package com.utn;

//clase hijo que hereda de Vuelo
public class VueloCarga extends Vuelo {

	// aca estoy pisando el campo de la clase padre!
	public int asientos = 12;
	public float espacioMaximoDeCarga = 1000;// pies cubicos de espacio en nuestra bodega
	public float espacioCargaUsado;// usamos esta variable para ver la cantidad de espacio
	// que hemos usado en el avion!

	// metodo para agregar un paquete al avion este recibira las dimenciones del
	// paquete
	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;
		// llamamos al metodo espacioDeCargaDisponible

		if (espacioDeCargaDisponible(size))

			espacioCargaUsado += size;
		else
			faltaEspacio();
	}

	// metodo privado para asegurarnos de que tenemos suficiente
	// espacio para el paquete que intentamos agregar al avion!
	private boolean espacioDeCargaDisponible(double tamanio) {

		return espacioCargaUsado + tamanio <= espacioMaximoDeCarga;
	}
	
	//metodo privado que imprime mensaje de falta de espacio
	private void faltaEspacio() {
		System.out.println("NO TENES MAS ESPACIO EN TU BODEGA!");
	}
	
	//utilizamos esta anotacion para asegurarnos que no cometimos un error accidental y 
	//que no coincida con la firma del metodo a Sobreescribir 
	//esto le indica al compilador que nuestra intencion es ANULAR un metodo de la
	//clase padre(no tiene inpacto en tiempo de ejecucion solo en tiempo de compilacion!)
	@Override
	public int getAsiento() {
		return 12;
	}

}
