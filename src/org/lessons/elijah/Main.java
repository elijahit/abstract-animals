package org.lessons.elijah;

public class Main {

	public static void main(String[] args) {
		AnimaleMovements movements = new AnimaleMovements();
		
		System.out.println("CANE");
		Cane cane = new Cane();
		cane.dormi();
		cane.verso();
		cane.mangia();
		System.out.println();
		
		System.out.println("PASSEROTTO");
		Passerotto passerotto = new Passerotto();
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		movements.vola(passerotto);
		System.out.println();
		
		System.out.println("AQUILA");
		Aquila aquila = new Aquila();
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		movements.vola(aquila);
		System.out.println();
		
		System.out.println("DELFINO");
		Delfino delfino = new Delfino();
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		movements.nuota(delfino);
		System.out.println();
		

	}

}
