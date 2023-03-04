package com.example.springbootdemo.examples.a2;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		//Initialization logic 
		System.out.println("Some initialization logic"); 
		this.classA = classA; 
	}
	
	public void doSomething() {
		System.out.println("Do Something"); 
	}
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
			System.out.println("Inside lazy application"); 
			context.getBean(ClassB.class).doSomething();
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
