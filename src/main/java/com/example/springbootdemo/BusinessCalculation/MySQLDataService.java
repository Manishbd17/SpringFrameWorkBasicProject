package com.example.springbootdemo.BusinessCalculation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService {
	public int[] retrieveData() {
		System.out.println("Retrieving data from MySQLdataservice"); 
		int[] arr = new int[3]; 
		for(int i=0;i<3;i++)
			arr[i]=i; 
		return arr; 
	}
}
