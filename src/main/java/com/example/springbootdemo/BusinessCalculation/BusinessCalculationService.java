package com.example.springbootdemo.BusinessCalculation;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {
	
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super(); 
		this.dataService = dataService; 
	}

	public int findMax() {
		// TODO Auto-generated method stub
		return Arrays.stream(dataService.retrieveData()).max().orElse(0); 
	}
}

