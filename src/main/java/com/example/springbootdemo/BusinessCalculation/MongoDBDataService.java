package com.example.springbootdemo.BusinessCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDBDataService implements DataService {
	public int[] retrieveData() {
		System.out.println("Retrieving data from MongoDBdataservice"); 
		int[] num = new int[3]; 
		for(int i=0;i<3;i++)
			num[i]=i+1; 
		return num; 
	}
}
