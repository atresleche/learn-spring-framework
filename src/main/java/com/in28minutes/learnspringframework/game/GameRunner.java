package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Tells Spring framework to manage this class and create an instance for me
@Component
public class GameRunner {

	// GameRunner needs a game to run
	@Autowired
	private GamingConsole game;
	
	public GameRunner(GamingConsole game){
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
