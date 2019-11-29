package view;
import processing.core.PImage;

public class Imags extends Personaje {

	public Imags(int posX, int posY, PImage imagen, Logica log) {
		super(posX, posY, imagen, log);
		inicializar();
	}

	public void pintar() {
		app.imageMode(app.CENTER);
		app.image(imagen, posX, posY, tamX, tamY);
	}

	public void inicializar() {
		tamX = 80;
		tamY = 80;
	}

	
}
