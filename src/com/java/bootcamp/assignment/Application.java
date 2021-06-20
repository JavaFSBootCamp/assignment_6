package com.java.bootcamp.assignment;

import java.util.ArrayList;
import java.util.List;



public class Application {
	
	public static void main(String[] args){
		FileService fileService = new FileService();
		ArrayList<SalesData> model3Data = (ArrayList<SalesData>) fileService.extractDataFromCSV("model3.csv");
		ArrayList<SalesData> modelSData = (ArrayList<SalesData>) fileService.extractDataFromCSV("modelS.csv");
		ArrayList<SalesData> modelXData = (ArrayList<SalesData>) fileService.extractDataFromCSV("modelX.csv");
		
		printSalesReport(model3Data, "Model 3");
		printSalesReport(modelSData, "Model S");
		printSalesReport(modelXData, "Model X");
	}
	
	
	private static void printSalesReport(List<SalesData> salesData, String type) {
		System.out.println(type + " Yearly Sales Report");
		System.out.println("---------------------------");
		System.out.println(SalesDataService.fetchReportData(salesData) + "\n");
		System.out.println("The best month for "+ type + " was: " + SalesDataService.fetchBestMonthSalesData(salesData));
		System.out.println("The worst month for "+ type + " was: " + SalesDataService.fetchWorstMonthSalesData(salesData)+ "\n");
	}
}
