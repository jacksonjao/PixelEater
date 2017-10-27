package parcial_final1_algoritmos;

import processing.core.PApplet;

public class Main extends PApplet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Logica logica;
	public void setup(){
		size(572,350);
		logica=new Logica(this);
	}
	
	public void draw(){
		background(255);
		logica.display();
	}
	
}
