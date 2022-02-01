package com.vlv.enu;

public class Sample03 {

	public static void main(String[] args) {

		Sample03 obj = new Sample03();
		System.out.println("is Monday weekend? " + DaysOfTheWeekFields.MONDAY.isWeekend());
		System.out.println("is Saturday weekend? " + obj.isWeekend(DaysOfTheWeekFields.SATURDAY));
	}
	
	public boolean isWeekend (DaysOfTheWeekFields day) {
		return day.isWeekend();
	}
}

enum DaysOfTheWeekFields {

	MONDAY(false), TUSEDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);

	private final boolean isWeekend;

	private DaysOfTheWeekFields(final boolean isWeekend) {
		this.isWeekend = isWeekend;
	}

	public boolean isWeekend() {
		return this.isWeekend;
	}
}
