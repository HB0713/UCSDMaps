package guiModule;
import processing.core.PApplet;

public class MyDisplay extends PApplet{

	public void setup(){
		size(600,600);
		background(100,150,200);
	}
	
	public void draw(){
		fill(255,255,0);
		ellipse(300,300,200,200);
		fill(0,0,0);
		ellipse(250,275,25,40);
		ellipse(350,275,25,40);
		
		noFill();
		arc(300,325,75,75,0,PI);
		
	}
}
