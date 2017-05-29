package com.joshuacrotts.brickbreaker.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.joshuacrotts.brickbreaker.standards.StandardHandler;

public class Level {

	private Scanner file = null;
	public int brickCount = 0;
	
	public Level(String level, StandardHandler sh){
		
		try{
			this.file = new Scanner(new File(level));
		}catch(IOException e){
			e.printStackTrace();
		}
		
		int x = 0; 
		int y = 0;
		
		for(int i = 0; i < 5; i++){
			
			x = 0;
			y += 55;
			
			String line = this.file.nextLine();
			
			for(int j = 0; j < 8; j++){
				
				x += 80;
				
				if(Integer.parseInt(line.substring(j, j+1)) != 0){
					sh.addEntity(new Brick(x, y, Integer.parseInt(line.substring(j, j+1))));
					this.brickCount++;
				}
				
			}
		}	
	}
}
