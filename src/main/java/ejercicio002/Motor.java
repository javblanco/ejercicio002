package ejercicio002;

import java.util.Random;

public class Motor {
	
	Random valorAleatorio = new Random();
	
	private int potenciaInicial;
	
	public Motor() {

		this.potenciaInicial = generadorPotencia();
		
	}
	
	private int generadorPotencia() {
		int potencia = valorAleatorio.nextInt(40-20+1) + 20;
		return potencia;
	}

	public int getPotenciaInicial() {
	return potenciaInicial;
	}
}
