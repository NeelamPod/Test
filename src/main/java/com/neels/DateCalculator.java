package com.neels;

public class DateCalculator {

	private static String[] MONTH = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV",
			"DEC" };
	private static Integer[] MONTH_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMonthNo(CustomDate date) {
		String m = date.getMonth();
		for (int i = 0; i < MONTH.length; i++) {
			if (MONTH[i].equals(m)) {
				return i + 1;
			}
		}
		return -1;
	}

	public static int getDaydiffrence(CustomDate date1, CustomDate date2) {
		return date2.getDay() - date1.getDay();
	}

	public static int getDaydiffrence(String date1, String date2) {
		CustomDate d1 = new CustomDate(date1);
		CustomDate d2 = new CustomDate(date2);
		return getDaydiffrence(d1, d2);
	}

	public static CustomDate findEarlierDate(CustomDate date1, CustomDate date2) {
		CustomDate earlierdate = findEarlierDateByYear(date1, date2);
		if (earlierdate == null) {
			earlierdate = findEarlierDateByMonth(date1, date2);
			if (earlierdate == null) {
				earlierdate = findEarlierDateByDay(date1, date2);
			}
		}
		return earlierdate;
	}

	private static CustomDate findEarlierDateByDay(CustomDate date1, CustomDate date2) {
		int daydiffrence = getDaydiffrence(date1, date2);
		if (daydiffrence == 0) {
			return date1;
		} else if (daydiffrence > 0) {
			return date1;
		} else {
			return date2;
		}
	}

	private static CustomDate findEarlierDateByMonth(CustomDate date1, CustomDate date2) {
		int monthNo1 = getMonthNo(date1);
		int monthNo2 = getMonthNo(date2);
		if (monthNo1 == monthNo2) {
			return null;
		}
		if (monthNo1 > monthNo2) {
			return date2;
		} else {
			return date1;
		}
	}

	private static CustomDate findEarlierDateByYear(CustomDate date1, CustomDate date2) {
		if (date1.getYear() == date2.getYear()) {
			return null;
		}
		if (date1.getYear() > date2.getYear()) {
			return date2;
		} else {
			return date1;
		}
	}
}
