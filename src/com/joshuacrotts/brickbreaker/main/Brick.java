package com.joshuacrotts.brickbreaker.main;

import java.awt.Color;
import java.awt.Graphics2D;

import com.joshuacrotts.brickbreaker.standards.StandardGameObject;
import com.joshuacrotts.brickbreaker.standards.StandardID;

public class Brick extends StandardGameObject{

	private Color color;
	
	public Brick(double x, double y, int val){
		super(x, y, StandardID.Brick);
		
		this.width = 80;
		this.height = 20;
		
		switch(val){
		case 0: return;
		case 1: this.color = Color.RED; break; //red
		case 2: this.color = Color.BLUE; break; //blue
		case 3: this.color = Color.GREEN;break;//green
		
		}
	}
	
	public void tick(){
		
		
	}
	
	public void render(Graphics2D g2){
		g2.setColor(this.color);
		g2.fillRect((int)x , (int) y, (int) width, (int) height);
	}
}
