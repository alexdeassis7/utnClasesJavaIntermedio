package com.utn.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class AppMain {

	public static void main(String[] args) {
		// C:\Users\Java\Documents>

		// esta clase nos permite dejarlo en el buffer
		// para una lectura màs eficiente
		BufferedReader reader = null;

		int totalSuma = 0;
		String line = null;
		// FileReader esta clase incorporada se ocupa
		// de los detalles de la lectura del contenido
		// de un archivo!

		try {
			// intenta este codigo si
			// todo sale bien se ejecuta hasta el final del TRY

			reader = new BufferedReader(new FileReader("C:\\numbers.txt"));

			// leemos las los numero de nuestro archivo .txt
			while ((line = reader.readLine()) != null) {
				totalSuma += Integer.valueOf(line);
			}

		} catch (IOException e) {
			// mostramos el error usando el metodo GetMessage
			System.out.println("ERROR : " + e.getMessage());
			System.out.println("PILA ERROR!");
			e.printStackTrace();
		} finally {
			//mostramos total suma
			System.out.println(totalSuma);
			// CERRAMOS EL ARCHIVO!
				
			try {
				if (reader != null) {
					reader.close();
					System.out.println("se cerro el archivo con exito");
				}
			} catch (IOException e) {

				e.getMessage();
			}
		}
	}

}
