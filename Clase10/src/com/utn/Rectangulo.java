package com.utn;

//esta clase implementa la interfaz Figura
public class Rectangulo implements Figura {

	private float lado;
	private float altura;

	public Rectangulo(float lado, float altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}

	@Override // implemento el metodo de la intefaz Figura
	public float area() {
		// TODO Auto-generated method stub
		return lado * altura;
	}

}
