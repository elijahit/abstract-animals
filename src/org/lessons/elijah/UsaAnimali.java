package org.lessons.elijah;

public class UsaAnimali {
	
	public static void main(String[] args) {
		System.out.println("CANE");
		Cane cane = new Cane();
		faiNuotare(cane);
		faiScondinzolare(cane);
		System.out.println();
		
		System.out.println("PASSEROTTO");
		Passerotto passerotto = new Passerotto();
		faiVolare(passerotto);
		System.out.println();
		
		System.out.println("AQUILA");
		Aquila aquila = new Aquila();
		faiVolare(aquila);
		System.out.println();
		
		System.out.println("DELFINO");
		Delfino delfino = new Delfino();
		faiNuotare(delfino);
		System.out.println();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}
	
	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiScondinzolare(IScondinzola animale) {
		animale.scondimzola();
	}
}
