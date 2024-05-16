package org.lessons.elijah;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("Il suo verso è fischio");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangia la Carne");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando");
	}
	
	

}
