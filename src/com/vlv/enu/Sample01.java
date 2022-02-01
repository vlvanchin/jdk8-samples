package com.vlv.enu;

public class Sample01 {

	public boolean isWeekEnd (final int day) {
		return( day == DaysOftheWeek.SATURDAY || day == DaysOftheWeek.SUNDAY );
//		if (day >= DaysOftheWeek.SATURDAY) 
//			return true;
//		else 
//			return false;
	}
	
	public static void main (String[] args) {
		Sample01 obj = new Sample01();
		System.out.println("Monday is weekend? " + obj.isWeekEnd(DaysOftheWeek.MONDAY));
		System.out.println("Sunday is weekend? " + obj.isWeekEnd(DaysOftheWeek.SATURDAY));
		
	}
	
}


class DaysOftheWeek {
	public static final int MONDAY = 0;
	public static final int TUESDAY = 1;
	public static final int WEDNESDAY =2;
	public static final int THRUSDAY = 3;
	public static final int FRIDAY = 4;
	public static final int SATURDAY = 5;
	public static final int SUNDAY = 6;
}
