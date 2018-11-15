package com.utn.clase3Bis;

import java.util.Calendar;

public class Fecha {

	private int dia, mes, año;
	
	
	

	public Fecha(int dia, int mes, int año) {
		
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		
		
		if (!fechaCorrecta()) {
			Calendar fechaSistema = Calendar.getInstance();
			setDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
			setMes(fechaSistema.get(Calendar.MONTH));
			setAño(fechaSistema.get(Calendar.YEAR));
			
			
		}
		
		
	}
	
	

	private boolean esBisiesto() {

		return ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)));
	}

	// sobrecarga de metodo Asignar fecha
	public void asignarFecha() {
		// este metodo asigna la fecha del sistema
		Calendar fechaSistema = Calendar.getInstance();
		setDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
		setMes(fechaSistema.get(Calendar.MONTH));
		setAño(fechaSistema.get(Calendar.YEAR));

	}

	// primer metodo sobrecargado
	public void asignarFecha(int d) {
		Calendar fechaSistema = Calendar.getInstance();
		setDia(d);
		setMes(fechaSistema.get(Calendar.MONTH));
		setAño(fechaSistema.get(Calendar.YEAR));

	}

	// segundo metodo sobrecargado
	public void asignarFecha(int d, int m) {
		Calendar fechaSistema = Calendar.getInstance();
		setDia(d);
		setMes(m);
		setAño(fechaSistema.get(Calendar.YEAR));

	}

	// segundo metodo sobrecargado
	public void asignarFecha(int d, int m ,int a) {
		
		setDia(d);
		setMes(m);
		setAño(a);

	}
	
	public boolean fechaCorrecta() {
		boolean diaCorrecto ,mesCorrecto , anyoCorrecto;
		anyoCorrecto = (año > 0);
		mesCorrecto = ((mes >= 1 ) && (mes <=12));
		
		switch (mes) {
		case 2:
			if(esBisiesto())
				diaCorrecto =(dia >=1 && dia <= 29);
			else {
				diaCorrecto =(dia >=1 && dia <= 28);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto =(dia >=1 && dia <= 30);
			break;

		default:
			
			diaCorrecto =(dia >=1 && dia <= 31);
			break;
			
		
		}
		return diaCorrecto && mesCorrecto && anyoCorrecto;
		
		
	}

	// get and set
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
}
