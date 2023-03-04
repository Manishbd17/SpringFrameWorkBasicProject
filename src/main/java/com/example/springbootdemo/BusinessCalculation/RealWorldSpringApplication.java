package com.example.springbootdemo.BusinessCalculation;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(RealWorldSpringApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax()); 
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		
	}

}
