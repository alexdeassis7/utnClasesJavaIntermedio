package com.utn;

//implemento interfaz figura en clase circulo
public class Circulo implements Figura {

	private float diametro;

	// metodo constructor
	public Circulo(float diametro) {
		this.diametro = diametro;
	}

	@Override
	public float area() {
		// PI * diametro / 2 * diametro /2
		return (PI * diametro * diametro / 4f);
	}

}
