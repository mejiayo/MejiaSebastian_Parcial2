package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Homero {
	private PApplet app = Main.app;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private PImage homeros;

	public Homero(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;

		tamX = 80;
		tamY = 80;

		homeros = app.loadImage("../data/homero.png");
	}

	public void pintar() {
		app.imageMode(app.CENTER);
		app.image(homeros, posX, posY, tamX, tamY);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}