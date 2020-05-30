package main;

import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;
import classes.Veterinario;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Menino");
		cachorro.corre();
		cachorro.emiteSom();

		Cavalo cavalo = new Cavalo("Alazão");
		cavalo.corre();
		cavalo.emiteSom();

		Preguica preguica = new Preguica("Biel");
		preguica.corre();
		preguica.emiteSom();

		Veterinario veterinario = new Veterinario();
		veterinario.examina(cachorro);
	}

}