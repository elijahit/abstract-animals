package org.lessons.elijah;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("CANE");
		Cane cane = new Cane();
		cane.dormi();
		cane.verso();
		cane.mangia();
		cane.scondimzola();
		System.out.println();
		
		System.out.println("PASSEROTTO");
		Passerotto passerotto = new Passerotto();
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		passerotto.vola();
		System.out.println();
		
		System.out.println("AQUILA");
		Aquila aquila = new Aquila();
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		aquila.vola();
		System.out.println();
		
		System.out.println("DELFINO");
		Delfino delfino = new Delfino();
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		delfino.nuota();
		System.out.println();
		

	}

}
