package model;

public class Factorial extends Thread{

	private int numero;
	
	public Factorial(int numero) {
		this.numero = numero;
	}
	
	
	@Override
	public void run() {
		
		int fact = 1;
		
		for (int i = 1; i <= numero; i++) {
			fact*=i;
		}
		System.out.println("El factorial es: " + fact);
	}
	
	
}
