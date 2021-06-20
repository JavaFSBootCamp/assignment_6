package com.java.bootcamp.assignment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesDataService {

	public static String fetchBestMonthSalesData(List<SalesData> salesData) {
		String maxData = salesData
							.stream()
							.max((a, b) -> a.getSales().compareTo(b.getSales()))
							.get().getDate().toString();
		
		return maxData;
	}
	

	public static String fetchWorstMonthSalesData(List<SalesData> salesData) {
		String minData = salesData
							.stream()
							.min((a, b) -> a.getSales().compareTo(b.getSales()))
							.get().getDate().toString();
	
		return minData;
	}
	

	public static String fetchReportData(List<SalesData> salesData) {
		Map<Integer, List<SalesData>> getYearMonthWiseSalesData = salesData
								.stream()
								.collect(Collectors.groupingBy(Y -> Y.getDate().getYear()));
	
		String generatedSalesData = getYearMonthWiseSalesData
								.entrySet()
								.stream()
								.map(Y -> Y.getKey() + " -> " + Y.getValue().stream().mapToInt(SalesData::getSales).sum())
								.collect(Collectors.joining("\n"));
	
		return generatedSalesData;
	}

}
