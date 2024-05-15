package org.lessons.elijah;

public class Delfino extends Animale implements AnimaleNuotante {

	@Override
	public void verso() {
		System.out.println("Il suo verso è fischio");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia la Carne");
		
	}

}
