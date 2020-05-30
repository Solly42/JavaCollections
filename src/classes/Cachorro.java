package classes;

import interfaces.AnimaisInterface;

public class Cachorro extends Animais implements AnimaisInterface {
	
	 public Cachorro(String nome) {
		this.setNome(nome);
	}

	@Override
	public void emiteSom() {
		System.out.println(this.getNome() + " Está fazendo barulho.");
		
	}

	@Override
	public void corre() {
		System.out.println(this.getNome() + " Está correndo.");
	}
	
}