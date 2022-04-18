package model;

public class Cubos extends Thread{

	private int numeros[];
	
	public Cubos(int numeros[]) {
		this.numeros = numeros;
	}
	
	@Override
	public void run() {
		
		double suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + Math.pow(numeros[i], 3);
		}
		System.out.println("La suma es: " + suma);
	}
	
	
	
}
