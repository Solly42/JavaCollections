package classes;

import interfaces.AnimaisInterface;

public class Preguica extends Animais implements AnimaisInterface {

	public Preguica(String nome) {
		this.setNome(nome);
	}

	public void emiteSom() {
		System.out.println(this.getNome() + " Est� fazendo barulho");

	}

	public void corre() {
		System.out.println(this.getNome() + " Est� com pregui�a de correr.");

	}
}