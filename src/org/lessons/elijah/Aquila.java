package org.lessons.elijah;

public class Aquila extends Animale implements AnimaleVolante {

	@Override
	public void verso() {
		System.out.println("Il suo verso è gridono/stridono");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia la Carne");
		
	}

}
