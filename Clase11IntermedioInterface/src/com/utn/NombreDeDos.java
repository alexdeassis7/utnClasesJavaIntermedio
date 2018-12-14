package com.utn;

public class NombreDeDos implements Series {

	int iniciar;
	int valor;
	int anterior;

	// creamos un contructor!
	public NombreDeDos() {
		iniciar = 0;
		valor = 0;
	}

	// siempre que implementamos un metodo de la interface este debe ser
	// public
	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 2;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor - 2;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior = x - 2;
	}

	// añadimo un metodo que no esta definido en Series
	int getAnterior() {
		return anterior;
	}

}
