package com.utn;

public class ContanteClase implements IContante {
	public static void main(String[] args) {
		// utilizamos las constantes de la Intefaz (MIN y MAX)
		int numeros[] = new int[MAX];

		for (int i = MIN; i < 11; i++) {
			if (i >= MAX)
				System.out.println(MENSAJEDEERROR);
			else {
				numeros[i] = i;
				System.out.println(numeros[i] + " ");
			}
		}

	}

}
