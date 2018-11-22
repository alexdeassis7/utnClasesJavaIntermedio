package com.utn.clase5bis;

public class Passenger {

	private int maletas;
	private int maletasPagas;
	private double tarifaPorMaleta;
	private int totalDeEquipaje;
	private double totalAPagar;

	//constructor Vacio!
	public Passenger ()
	{
		
	}
	//constructor 1 que a su vez llama al constructor privado
	public Passenger(int maletas){
		
		//siempre llamar primero alconstructor interno
		this(maletas > 1 ? 25.0d : 50.0d);
		
		this.maletas=maletas;
		totalDeEquipaje = maletas;
		totalAPagar =totalDeEquipaje * tarifaPorMaleta;			
		
	}
	//constructor 2//que llama al constructor 1
	public Passenger(int maletas, int maletasPagas) {
		
		this(maletas);//aca llamo a passenger(int maletas)
		this.maletas = maletas;
		this.maletasPagas = maletasPagas;
		totalDeEquipaje = maletas +maletasPagas;
		totalAPagar = maletas * tarifaPorMaleta; 
	}
	//constructor PRIVADO (interno)
	private Passenger(double tarifaPorMaleta){
		this.tarifaPorMaleta = tarifaPorMaleta;
		
	}
	
	
	public int getMaletas() {
		return maletas;
	}
	public void setMaletas(int maletas) {
		this.maletas = maletas;
	}
	public double getTarifaPorMaleta() {
		return tarifaPorMaleta;
	}
	
	public int getTotalDeEquipaje() {
		return totalDeEquipaje;
	}
	
	public double getTotalAPagar() {
		return totalAPagar;
	}
	
	public int getMaletasPagas() {
		return maletasPagas;
	}
	
	

}
