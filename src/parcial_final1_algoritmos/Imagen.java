package parcial_final1_algoritmos;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Imagen {
	PApplet app;
	PImage imagen;
	int r,r2;
	int g,g2;
	int b,b2;
	int a;
	int loc,map;

	PImage imagen2;
World world;
	public Imagen(PApplet app,World world) {
		this.app = app;
		imagen = app.loadImage("../data/imagen.jpg");
		
		imagen2 = new PImage(imagen.width, imagen.height);
		for (int i = 0; i < imagen2.pixels.length; i++) {
			imagen2.pixels[i]=app.color(255,255,255,255);
		}
		this.world=world;
		 
	}

	public void display() {
		 
		imagen.loadPixels();
		imagen2.loadPixels();

	for (int x = 0; x < imagen.width; x++) {
			for (int y = 0; y < imagen.height; y++) {
				map=(int) PApplet.map(x, 0, imagen.width,0, world.getAutomata().size());
				loc = world.getAutomata().get(map).getAgenteCome();
				r = (int) app.red(imagen.pixels[loc]);
				g = (int) app.green(imagen.pixels[loc]);
				b = (int) app.blue(imagen.pixels[loc]);
				a=(int) app.alpha(imagen.pixels[loc]);
				world.getAutomata().get(map).setColor(r, g, b);
				if(a!=1){
				imagen2.pixels[loc] = imagen.pixels[loc];}
				imagen.pixels[loc] = app.color(r,g,b,1);
		}
		}

		imagen.updatePixels();
		imagen2.updatePixels();
		app.image(imagen, 0, 0);
		app.image(imagen2, imagen.width, 0);

	}

	public PImage getImagen() {
		return imagen;
	}

	

	
	
}
