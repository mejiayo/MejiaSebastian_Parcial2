package view;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;
import java.lang.Thread.State;

public class Logica {

	int pantalla = 0;
	int cantidad = 0;

	public PApplet app = Main.app;

	private ArrayList<Homero> homeros;

	private PImage[] imaHomero;
	private PImage[] bart;
	private PImage[] lisa;

	public Logica() {
		inicializar();

	}

	public void ejecutar() {

		app.rect(0, 0, 200, 700);
		app.rect(50, 600, 50, 50);
		app.rect(100, 600, 50, 50);

		switch (pantalla) {
		case 0: {

			break;
		}

		case 1: {
			for (int i = 0; i < 1; i++) {
				imaHomero[i] = app.loadImage("homero.png");
				// homero.add(new Imags(100, (int) app.random(50, 650), homero, this));

				// inicia hilo
				// homero.get(i).start();

			}
			break;

		}
		}

	}

	public void clickear(int pmouseX, int pmouseY) {
		// Creo Homeros con el click
		if (cantidad < 4) {
			homeros.add(new Homero((int) app.mouseX, (int) app.mouseY, null, null ));
			cantidad++;
		}

	}

	public void inicializar() {

		// Inicializo los int
		cantidad = 4;
		pantalla = 0;

		// Inicializo los arreglos
		imaHomero = new PImage[1];

		// Inicializo los arraylist
		homeros = new ArrayList<Homero>();

		// Cargo los personajes

		for (int i = 0; i < 3; i++) {
			imaHomero[i] = app.loadImage("homero.png");
			PImage imaHom = imaHomero[i];
			homeros.add(new Homero((int) app.random(50, 400), (int) app.random(50, 650), imaHom, this));

		}

		
		// Inicializo los hilos de los objetos
		iniciarHilos();

	}

	public void iniciarHilos() {
		// Con este metodo inicio los hilos
		for (int i = 0; i < homeros.size(); i++) {
			Homero b = homeros.get(i);
			//b.start();
		}

	}

	public ArrayList<Homero> getHomeros() {
		return homeros;
	}

	public void setHomeros(ArrayList<Homero> homeros) {
		this.homeros = homeros;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
