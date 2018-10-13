package com.neels;

import com.neels.util.CheckLeapYear;

public class CustomDate {

	String dateString = null;
	public CheckLeapYear leapyear;

	public CustomDate(String dateString) {
		this.dateString = dateString;
		leapyear = new CheckLeapYear();
	}

	public int getDay() {
		return Integer.parseInt(dateString.split("-")[0]);
	}

	public String getMonth() {
		return dateString.split("-")[1];
	}

	public int getYear() {
		return Integer.parseInt(dateString.split("-")[2]);
	}

	@Override
	public String toString() {
		return dateString;
	}
}
