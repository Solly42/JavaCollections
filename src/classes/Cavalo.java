
package classes;

import interfaces.AnimaisInterface;

public class Cavalo extends Animais implements AnimaisInterface {
	public Cavalo(String nome) {
		this.setNome(nome);
	}

	public void emiteSom() {
		System.out.println(this.getNome() + " Está fazendo barulho");
	}

	public void corre() {
		System.out.println(this.getNome() + " Está correndo");
	}

}