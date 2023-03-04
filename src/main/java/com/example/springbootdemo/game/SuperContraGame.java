package com.example.springbootdemo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("Jump up"); 
	}
	
	public void down() {
		System.out.println("Sit down"); 
	}
	
	public void left() {
		System.out.println("Hide"); 
	}
	public void right() {
		System.out.println("Shoot a bulllet"); 
	}
	
}
