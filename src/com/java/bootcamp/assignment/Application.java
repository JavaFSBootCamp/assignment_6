package com.java.bootcamp.assignment;

import java.util.ArrayList;


public class Application {
	
	public static void main(String[] args){
		FileService fileService = new FileService();
		ArrayList<SalesData> model3Data = (ArrayList<SalesData>) fileService.extractDataFromCSV("model3.csv");
		ArrayList<SalesData> modelSData = (ArrayList<SalesData>) fileService.extractDataFromCSV("modelS.csv");
		ArrayList<SalesData> modelXData = (ArrayList<SalesData>) fileService.extractDataFromCSV("modelX.csv");
		
		
		
		
//		for(SalesData obj:model3Data) {
//			System.out.println(obj.getDate() + "====" + obj.getSales());
//		}
//		System.out.println("==================================================================");
//		for(SalesData obj:modelSData) {
//			System.out.println(obj.getDate() + "====" + obj.getSales());
//		}
//		System.out.println("==================================================================");
//		for(SalesData obj:modelSData) {
//			System.out.println(obj.getDate() + "====" + obj.getSales());
//		}
//		System.out.println("==================================================================");
	}
		
}
