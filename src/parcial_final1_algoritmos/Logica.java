package parcial_final1_algoritmos;

import processing.core.PApplet;

public class Logica {
	PApplet app;
World world;
	public Logica(PApplet app) {
		this.app = app;
		world=new World(app);
		// TODO Auto-generated constructor stub
	}

	public void display() {
		// TODO Auto-generated method stub
world.display();
	}

}
