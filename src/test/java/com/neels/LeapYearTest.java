package com.neels;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.neels.util.CheckLeapYear;

public class LeapYearTest {

	CheckLeapYear chkleap;
	@Test
	
	public void leapTest() {
		int year=2018;
		chkleap=new CheckLeapYear(year);
		chkleap.isLeap();
		
	}
	
}
