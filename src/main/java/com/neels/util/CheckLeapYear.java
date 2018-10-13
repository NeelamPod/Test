package com.neels.util;

import com.neels.CustomDate;

public class CheckLeapYear {

	int year;
	CustomDate date;
	public CheckLeapYear() {
			}
	
	public CheckLeapYear(int year) {
		this.year=year;
		//year=date.getYear();
		System.out.println(year);
	}
	
	public boolean isLeap() {
		//year=date.getYear();
		
		System.out.println("inside method");
		
			if (year<=0)
				System.out.println("Please provide correct year format : YYYY");
			
			if((year%4 )== 0) {
				System.out.println("The given year," +year+" is Leap");
			return true;
			}
			else {
				System.out.println("The given year," +year+" is not Leap");
			
				return false;
			}
		}
	
}
