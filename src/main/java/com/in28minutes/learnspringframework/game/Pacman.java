package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GamingConsole{

	@Override
	public void up() {
		System.out.println("pacman up!");
	}

	@Override
	public void down() {
		System.out.println("pacman down!");
	}

	@Override
	public void left() {
		System.out.println("left!");
	}

	@Override
	public void right() {
		System.out.println("right!");
	}

}
