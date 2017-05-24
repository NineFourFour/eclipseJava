package sheet15Exceptions;

public class Weekday {
	
	private String weekDay;
	enum dayOfTheWeek{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	dayOfTheWeek day;
	public Weekday(){
		this.weekDay = dayOfTheWeek.FRIDAY.toString();
	}
	public Weekday(String weekDay){
		try{
			setWeekDay(weekDay);
		}catch(InvalidWeekdayException iwe){
			System.out.println("In "+iwe);
		}
		
	}
	public Weekday(dayOfTheWeek day){
		try{
			setWeekDay(day.toString());
		}catch(InvalidWeekdayException iwe){
			System.out.println("In "+iwe);
		}
		
	}
	public String getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(String weekDay)throws InvalidWeekdayException {
		weekDay = weekDay.toLowerCase();
			if(weekDay.equals("sunday")||weekDay.equals("saturday"))
				throw new InvalidWeekdayException("Invalid Weekday"); 
			else
				 
				this.weekDay = weekDay.toUpperCase();
	}
	public void setFriday(dayOfTheWeek day) throws InvalidWeekdayException{
		if(!day.toString().equals("FRIDAY"))
			throw new InvalidWeekdayException("Invalid day, Not a Friday");
		else
			this.weekDay = day.toString();
	}
	public String toString(){
		return "\nDay of the week: "+this.weekDay;
	}
	
}
