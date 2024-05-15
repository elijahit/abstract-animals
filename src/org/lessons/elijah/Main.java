package org.lessons.elijah;

public class Main {

	public static void main(String[] args) {
		System.out.println("CANE");
		Animale cane = new Cane();
		cane.dormi();
		cane.verso();
		cane.mangia();
		System.out.println();
		
		System.out.println("PASSEROTTO");
		Animale passerotto = new Passerotto();
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		System.out.println();
		
		System.out.println("AQUILA");
		Animale aquila = new Aquila();
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		System.out.println();
		
		System.out.println("DELFINO");
		Animale delfino = new Delfino();
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		System.out.println();

	}

}
