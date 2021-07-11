package ejercicio002;

public class Coche {
	
	private Motor motor;
	private int potenciaFinal;

	
	public Coche() {
		
		this.motor = new Motor();
		this.setPotenciaFinal(this.motor.getPotenciaInicial()/7);
	}
	
	public int getPotenciaFinal() {
		return potenciaFinal;
	}
	
	public void setPotenciaFinal(int potenciaFinal) {
		this.potenciaFinal = potenciaFinal;
	}
}
