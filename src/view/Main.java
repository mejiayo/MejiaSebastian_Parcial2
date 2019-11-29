package view;

import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public static PApplet app;
	
	Logica log;

	
	public void settings() {
		size(1200, 700);
	}

	
	public void setup() {
		this.app = this;
		log = new Logica();
	}
	
	public void draw() {
		log.ejecutar();
		
	}

	
	
}
