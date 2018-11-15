package com.utn.modelo;

public class Calculadora {
	private int num1, num2, resultado;

	private String op;

	public void calcular() {
		System.out.println("+++++++++++++soy el modelo y estoy haciendo el calculo++++++++++++++++");
		
		if (op.equals("+")) {
			resultado = num1 + num2;
		} else  {
			resultado = num1 - num2;
		}

	}

	public int getResultado() {
		return resultado;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setOp(String op) {
		this.op = op;
	}

}
