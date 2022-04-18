package model;

public class Leopardo4 extends Thread{

	public Leopardo4(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			try {
				Thread.sleep(600);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " corrio " +i+ " mts" );
			if (i % 8 == 0) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
