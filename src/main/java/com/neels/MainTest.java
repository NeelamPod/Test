package com.neels;

import com.neels.util.CheckLeapYear;

public class MainTest {

	public static String date1 = "01-02-2018";
	public static String date2 = "01-04-2018";

	public static void main(String[] args) {

		int daydiffrence = DateCalculator.getDaydiffrence(date1, date2);
		System.out.println(date2 + " - " + date1 + " = " + daydiffrence);
		
		//CheckLeapYear chkleap=new CheckLeapYear();
	}

}
