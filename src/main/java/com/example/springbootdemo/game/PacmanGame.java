package com.example.springbootdemo.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
	public void up() {
		System.out.println("Pacman wake up"); 
	}
	
	public void down() {
		System.out.println("Pacman sleeps"); 
	}
	
	public void left() {
		System.out.println("Pacman goes left"); 
	}
	public void right() {
		System.out.println("Pacman Accelerate"); 
	}

}
