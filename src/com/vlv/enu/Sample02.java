package com.vlv.enu;

public class Sample02 {
	
	public static void main (String[] args) {

		Sample02 obj = new Sample02();
		System.out.println("Monday is weekend? " + obj.isWeekEnd(DaysOftheWeekEnum.MONDAY));
	
	}

	public boolean isWeekEnd(final DaysOftheWeekEnum day) {
		return (day == DaysOftheWeekEnum.SATURDAY || day == DaysOftheWeekEnum.SUNDAY);
	}
}


enum DaysOftheWeekEnum {
	MONDAY ,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY ,
	SATURDAY,
	SUNDAY 	
}