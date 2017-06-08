package sheet15Exceptions;

import sheet15Exceptions.Weekday.dayOfTheWeek;

public class TestInvalidWeekday {
	public static void main(String[] args) {
		Weekday w = new Weekday();
		System.out.println("Weekday : "+w);
		try{
			w.setWeekDay(dayOfTheWeek.MONDAY.toString());
			System.out.println(w);
			w.setWeekDay(dayOfTheWeek.SATURDAY);
		}catch(InvalidWeekdayException iwe){
			System.out.println("\nError: "+iwe.getMessage());
		}
		System.out.println(w);
		try{
			w.setFriday(dayOfTheWeek.SATURDAY);
		}catch(InvalidWeekdayException iwe){
			System.out.println("\nError: "+iwe.getMessage());
		}
		System.out.println(w);
	}
}
