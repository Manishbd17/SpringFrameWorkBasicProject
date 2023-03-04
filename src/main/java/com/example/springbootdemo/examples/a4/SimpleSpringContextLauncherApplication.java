package com.example.springbootdemo.examples.a4;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady(); 
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

//Spring autowires the dependencies. After autowiring is done, 

@Component
class SomeDependency {

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Using some dependency");
	}
	
}


@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println); 
			
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
