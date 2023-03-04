package com.example.springbootdemo.examples.a0;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	
	//Field injection 
	Dependency1 dependency1;
	Dependency1 dependency2; 
	
	//Constructor Based Injection - Autowired not mandatory 
	public YourBusinessClass(Dependency1 dependency1,Dependency1 dependency2) {
		super(); 
		System.out.println("Using constructor dependency injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2; 
	}
	
//	//Setter-Based Dependency Injection 
//	@Autowired 
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Using setter dependency injection - setDependency1"); 
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency1 dependency2) {
//		System.out.println("Using setter dependency injection - setDependency2"); 
//		this.dependency2 = dependency2;
//	}


	public String toString() {
		return "Using " + dependency1 + " and " + dependency2; 
	}
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}


@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println); 
			System.out.println(context.getBean(YourBusinessClass.class)); 
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
