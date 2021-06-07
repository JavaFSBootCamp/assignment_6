package com.java.bootcamp.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class FileService {

	public List<SalesData> extractDataFromCSV(String fileName) {
		BufferedReader bufferedReader = null;
		List<SalesData> listOfSalesData = new ArrayList<> ();
		try {
			bufferedReader = new BufferedReader(new  FileReader(fileName));
			String line;
			line=bufferedReader.readLine(); //Just to avoid the Headers
			while((line=bufferedReader.readLine()) != null) {
				String[] values = line.split(",");
				listOfSalesData.add(new SalesData(values[0], Integer.parseInt(values[1])));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return listOfSalesData;
	}
}
