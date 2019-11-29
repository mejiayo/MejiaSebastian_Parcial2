package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Homero extends Personaje {

	public Homero(int posX, int posY, PImage imagen, Logica log) {
		super(posX, posY, imagen, log);
		inicializar();
	}

	public void pintar() {
		app.fill(255, 0, 0, 50);
		app.ellipse(posX, posY, tamX, tamY);
		app.imageMode(app.CENTER);
		app.image(imagen, posX, posY, tamX, tamY);
	}

	public void inicializar() {
		// Tamaño
		tamX = 80;
		tamY = 80;
	}
}