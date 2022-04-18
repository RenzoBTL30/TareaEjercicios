package model;

public class ContadorNumeros extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
	}
	
}
