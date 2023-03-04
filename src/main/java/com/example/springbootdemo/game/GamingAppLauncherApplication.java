package com.example.springbootdemo.game;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springbootdemo.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up(); 
			context.getBean(GameRunner.class).run();
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
