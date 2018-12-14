package com.utn.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//En esta clase tenemos la cadena de conexión con la que trabajará nuestra aplicación,
//en ella se define la base de datos, el usuario, password y driver de conexión, 
//si por ejemplo en un futuro se nos pide conectarnos a una base de datos diferente o establecer
//un sistema gestor distinto (pero con la misma estructura de tablas y campos), tan solo modificaremos 
//esta clase y dicho cambio sera transparente para el resto del sistema.
//(Tener en cuenta que los datos de login y password corresponden a los que yo dejé por 
//	defecto al instalar MySql, es decir login root y sin contraseña)

public class Conexion {

	// en esta clase tenemos el String de Conexion
	// con la que trabajara nuestra app

	static String db = "personas";// nombre de nuestra base de datos generada en MySql
	static String login = "root";// nombre de usuario de la base de datos
	static String password = "";// password de la base de datos
	static String url = "jdbc:mysql://localhost/" + db;

	// creamos un objeto del tipo connection para
	// administrar la conexion a la base de datos
	Connection conn = null;

	public Conexion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");// obtener el driver para mysql

			// obtenemos la conexion a la base de datos
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("Conexion a la DB >>>>>>>> " + db + " <<<<<<<<< OKs");
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	// Metodo que nos permite terornar la conexion
	public Connection getConnection() {
		return conn;
	}

	// metodo que nos permite el cierre de la conexion a la base de datos
	public void desconectar() {
		conn = null;
	}
}
