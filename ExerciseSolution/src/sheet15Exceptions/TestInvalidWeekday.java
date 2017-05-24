package sheet15Exceptions;

import sheet15Exceptions.Weekday.dayOfTheWeek;

public class TestInvalidWeekday {
	public static void main(String[] args) {
		Weekday w = new Weekday();
		System.out.println(w);
		try{
			w.setWeekDay(dayOfTheWeek.MONDAY.toString());
		}catch(InvalidWeekdayException iwe){
			System.out.println("Error: "+iwe.getMessage());
		}
		System.out.println(w);
		try{
			w.setFriday(dayOfTheWeek.SATURDAY);
		}catch(InvalidWeekdayException iwe){
			System.out.println("Error: "+iwe.getMessage());
		}
		System.out.println(w);
	}
}
