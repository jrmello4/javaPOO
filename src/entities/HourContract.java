package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private double valuePerHours;
	private int hours;
	
	public HourContract() {
	}

	public HourContract(Date date, double valuePerHours, int hours) {
		this.date = date;
		this.valuePerHours = valuePerHours;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	public double totalValue() {
		return valuePerHours * hours;
	}
	
	
}
