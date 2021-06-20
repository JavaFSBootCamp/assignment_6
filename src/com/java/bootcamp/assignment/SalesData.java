package com.java.bootcamp.assignment;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class SalesData {

	private YearMonth date;
	private Integer sales;
	
	
	public SalesData(String date, Integer sales) {
		this.date = YearMonth.parse(date, DateTimeFormatter.ofPattern("MMM-yy"));
		//System.out.println("input date " + date + "===" + "Formatted Date " + this.date);
		this.sales = sales;
	}
	

	public YearMonth getDate() {
		return date;
	}
	public void setDate(YearMonth date) {
		this.date = date;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	
	@Override
	public String toString() {
		return "SalesData [date=" + date + ", sales=" + sales + "]";
	}
	
	
	
}
