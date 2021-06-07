package com.java.bootcamp.assignment;

public class SalesData {

	private String date;
	private int sales;
	
	
	
	public SalesData(String date, int sales) {
		this.date = date;
		this.sales = sales;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSales() {
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
