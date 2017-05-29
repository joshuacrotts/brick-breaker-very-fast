package com.joshuacrotts.brickbreaker.main;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;

import com.joshuacrotts.brickbreaker.standards.StandardGameObject;
import com.joshuacrotts.brickbreaker.standards.StandardHandler;
import com.joshuacrotts.brickbreaker.standards.StandardID;

public class Ball extends StandardGameObject{

	public Ball(double x, double y, StandardHandler sh){
		super(x, y, StandardID.Ball);
		
		sh.addEntity(this);
		
		this.width = 20;
		this.height = 20;
		
		this.velX = 4;
		this.velY = -4;
	}

	@Override
	public void tick() {
		
		if(this.x < 0 || this.x >= Game.window.width() - this.width){
			this.velX = -this.velX;
		}
		
		if(this.y < 0){
			this.velY = -this.velY;
		}
		
		if(this.y >= Game.window.height()){
			
			JOptionPane.showMessageDialog(null, "You lost! Your score was: "+Game.score);
			System.exit(0);
		}
		
		
		this.x += this.velX;
		this.y += this.velY;
		
		
		
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.blue);
		g2.fillOval((int) x, (int) y, (int) this.width, (int) this.height);
		
		
	}
}
