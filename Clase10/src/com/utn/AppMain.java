package com.utn;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

	public static void main(String[] args) {
		Figura cuad1 = new Cuadrado(3.5f);
		Figura cuad2 = new Cuadrado(2.2f);
		Figura cuad3 = new Cuadrado(8.9f);
		System.out.println(cuad1.area());
		Figura circ1 = new Circulo(3.5f);
		Figura circ2 = new Circulo(4f);
		System.out.println(circ1.area());

		Figura rect1 = new Rectangulo(2.25f, 2.25f);
		Figura rect2 = new Rectangulo(12f, 3f);
		// me creo un arrayList donde inseeto todas mis figuras
		List<Figura> serieDeFiguras = new ArrayList<Figura>();
		serieDeFiguras.add(cuad1);
		serieDeFiguras.add(cuad2);
		serieDeFiguras.add(cuad3);
		serieDeFiguras.add(circ1);
		serieDeFiguras.add(circ2);
		serieDeFiguras.add(rect1);
		serieDeFiguras.add(rect1);

		float areaTotal = 0;
		// usamos for each para sumar todas las area de las figuras
		for (Figura temporal : serieDeFiguras) {
			areaTotal = areaTotal + temporal.area();
		}

		System.out.println("Tenemos un total de " + serieDeFiguras.size() + " figuras y su àrea total" + " es de "
				+ areaTotal + "UDS cuadradas");

	}

}
