package parcial_final1_algoritmos;

import processing.core.PApplet;

public class Figura {
	PApplet app;
	float posX;
	float posY;
	int r,g,b;
	public Figura(PApplet app, float posX, float posY, int r, int g, int b) {
		super();
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.r = r;
		this.g = g;
		this.b = b;
		//app.noStroke();
	}
	
	public void pintar(){
		
		app.fill(r,g,b);
		app.rect(posX, posY, 10, 10);
		
	}
	public float getPosX() {
		return posX;
	}
	public void setPosX(float posX) {
		this.posX = posX;
	}
	public float getPosY() {
		return posY;
	}
	public void setPosY(float posY) {
		this.posY = posY;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	

	
	
	
	
	

}
