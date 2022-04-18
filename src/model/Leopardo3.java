package model;

public class Leopardo3 extends Thread{

	public Leopardo3(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " corrio " +i+ " mts" );
			if (i % 8 == 0) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
