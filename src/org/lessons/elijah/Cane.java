package org.lessons.elijah;

public class Cane extends Animale implements IScondinzola {

	@Override
	public void verso() {
		System.out.println("Il suo verso è Bau");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia la Carne");
		
	}

	@Override
	public void scondimzola() {
		System.out.println("Sto scondinzolando");
	}

}
