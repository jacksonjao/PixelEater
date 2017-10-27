package parcial_final1_algoritmos;

import processing.core.PApplet;
import processing.core.PVector;

public class Automata {
	int posX;
	int posY;
	int velX;
	int velY;
	int r;
	int g; 
	int b;
int rotacion;
	World world;
	PApplet app;

	public Automata(PApplet app, World world,int posX,int posY) {
		this.app = app;
		this.world = world;
		this.posX=posX;
		this.posY=posY;

	
	}

	public void display() {

		posX += velX;
		posY += velY;
		app.fill(r, g, b);
		app.rect(posX, posY, 10, 10);
		
	}

	public void move() {
	
	
		velX = (int) (app.random(-5, 5));
		velY = (int) (app.random(-5, 5));

		
		if (posX >= world.imagen.getImagen().width) {
			posX = 10;
		}
		if (posX <= 0) {
			posX = (world.imagen.getImagen().width) - 1;
		}
		if (posY <= 0) {
			posY = (world.imagen.getImagen().height) - 1;
		}
		if (posY >= (world.imagen.getImagen().height)) {
			posY = 0 + 1;
		}
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getAgenteCome() {
		int posAgente = posX + (posY * world.getImagen().width);
		return posAgente;

	}

	public void setColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	

	
}
