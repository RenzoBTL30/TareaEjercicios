package controller;

import model.Leopardo1;
import model.Leopardo2;
import model.Leopardo3;
import model.Leopardo4;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Leopardo1 l1 = new Leopardo1("Leo1");
		Leopardo2 l2 = new Leopardo2("Leo2");
		Leopardo3 l3 = new Leopardo3("Leo3");
		Leopardo4 l4 = new Leopardo4("Leo4");
		
		l1.start();
		l2.start();
		l3.start();
		l4.start();

	}

}
