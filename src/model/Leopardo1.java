package model;

public class Leopardo1 extends Thread{
	
	public Leopardo1(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " corrio " +i+ " mts" );
			if (i % 10 == 0) {
				try {
					Thread.sleep(700);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
