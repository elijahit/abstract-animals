package org.lessons.elijah;

public class Passerotto extends Animale implements AnimaleVolante{

	@Override
	public void verso() {
		System.out.println("Il suo verso è cip cip");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia ogni cosa (onnivoro)");
		
	}

}
