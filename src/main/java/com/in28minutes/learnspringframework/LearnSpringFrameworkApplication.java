package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// We create an application context to manage the components that we are creating
		// In application context, we are requesting Spring to create a GameRunner
		// component and Mario game component
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// Spring can pick up the GameRunner and MarioGame object
		GameRunner runner = context.getBean(GameRunner.class);

		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();
		// GameRunner runner = new GameRunner(game);
		
		runner.runGame();
	}

}
