package com.java.bootcamp.assignment;

import java.util.ArrayList;


public class Application {
	
	public static void main(String[] args){
		FileService fs = new FileService();
		ArrayList<SalesData> salesData = (ArrayList) fs.extractDataFromCSV("model3.csv");
		
		for(SalesData obj:salesData) {
			System.out.println(obj.getDate());
		}
	}
		
}
