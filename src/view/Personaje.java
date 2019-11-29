package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje {
	protected int posX;
	protected int posY;
	protected int tamX;
	protected int tamY;
	protected int dist;
	protected float velX;
	protected float velY;

	protected PImage imagen;
	protected Logica log;
	protected PApplet app;

	// private ArrayList <Imags> Homero;

	public Personaje(int posX, int posY, PImage imagen, Logica log) {
		this.posX = posX;
		this.posY = posY;
		this.imagen = imagen;
		app = Main.app;
		this.log = log;
		dist = (tamX + tamY) / 2;

		// bart = false;
	}

	public void inicializar() {
	}

	public void mover() {

		posX += velX;

	}

	// Para que quede en pantalla
	public void rebotar() {

		if (posX + velX < 0 + tamX / 2) {
			velX *= -1;
		}

		if (posX + velX > 1200 - tamX / 2) {
			velX *= -1;
		}
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

	public float getVelX() {
		return velX;
	}
	public void setVelX(float velX) {
		this.velX = velX;
	}

}
