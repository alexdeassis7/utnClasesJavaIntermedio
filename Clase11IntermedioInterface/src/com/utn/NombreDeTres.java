package com.utn;

public class NombreDeTres implements Series {
	int iniciar;
	int valor;

	public NombreDeTres() {

		this.iniciar = 0;
		this.valor = 0;
	}

	@Override
	public int getSiguiente() {
		valor += 3;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;

	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;

	}

}
