package com.example.springbootdemo.examples.a6;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springbootdemo.game.GameRunner;



public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For xml configuration context
		try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println); 
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			context.getBean(GameRunner.class).run();
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
