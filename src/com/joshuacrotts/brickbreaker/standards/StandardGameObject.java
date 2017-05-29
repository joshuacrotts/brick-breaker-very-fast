package com.joshuacrotts.brickbreaker.standards;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class StandardGameObject {

	public double x;
	public double y;
	
	public double velX;
	public double velY;
	
	
	public int width;
	public int height;
	
	public StandardID id;
	
	public StandardGameObject(double x, double y, StandardID id){
		this.x = x;
		this.y = y;
		
		this.id = id;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics2D g2);
	
	public Rectangle getBounds(){
		return new Rectangle((int) x,(int)  y,(int)  width, (int) height);
	}
	
}
