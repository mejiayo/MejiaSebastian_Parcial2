package view;

import processing.core.PApplet;

public class Logica {
	
	public static PApplet app;
	int pantalla = 0;
	
	public Logica() {
		inicializar();
		
	}
	
	public void ejecutar () {
		switch (pantalla){
		case 0: {
			pantalla();
		
		
		break;
		}
		}
	}
	
	public void inicializar() {
		
	}
	
	public void pantalla() {
		app.background(0);
	}
	
	
	

}






































/*public void clickear(int pmouseX, int pmouseY) {
// Interaccion para cambiar de pantalla

if (pantalla == 0) {
	pantalla = 1;
}

// Creo hamburguesas con el click
if (cantidad < 5) {
	hambs.add(new Hamburguesa((int) app.mouseX, (int) app.mouseY));
	cantidad++;
}*/