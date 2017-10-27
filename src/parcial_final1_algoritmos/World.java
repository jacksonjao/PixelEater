package parcial_final1_algoritmos;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class World {
	PApplet app;
	Imagen imagen;
	ArrayList<Automata> automata;
//ArrayList<Figura> figuras;
	public World(PApplet app) {
		this.app = app;
		imagen = new Imagen(app, this);
		automata = new ArrayList<Automata>();
		for (int i = 0; i < app.random(50,150); i++) {
			automata.add(new Automata(app, this, (int) app.random(0, imagen.getImagen().width), (int) app.random(0, imagen.getImagen().height)));
		
		}
		//figuras= new ArrayList<>();
		//figuras.add(new Figura(app, imagen.imagen.width, 0, 255, 0, 0));

	}

	public void display() {
		imagen.display();

		for (int i = 0; i < automata.size(); i++) {
			automata.get(i).display();
			automata.get(i).move();
			
			
			//figuras.add(new Figura(app, imagen.imagen.width+automata.get(i).getPosX(), automata.get(i).getPosY(), automata.get(i).getR(), automata.get(i).getG(), automata.get(i).getB()));
		}
	/*	for(int i=0;i< figuras.size();i++){
			figuras.get(i).pintar();
		}
		*/

	}

	public PImage getImagen() {
		return imagen.getImagen();
	}

	public ArrayList<Automata> getAutomata() {
		return automata;
	}

}
