package sheet15Exceptions;

public class Weekday {
	
	private String weekDay;
	
	enum dayOfTheWeek{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	dayOfTheWeek day;
	
	
	public Weekday(){
		this.weekDay = dayOfTheWeek.FRIDAY.toString();
	}
	public Weekday(String weekDay)throws InvalidWeekdayException{
			setWeekDay(weekDay);
	}
	public Weekday(dayOfTheWeek day)throws InvalidWeekdayException{
			setWeekDay(day.toString());
	}
	
	
	public String getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(String weekDay)throws InvalidWeekdayException {
		weekDay = weekDay.toLowerCase();
			if(weekDay.equals("sunday")||weekDay.equals("saturday"))
				throw new InvalidWeekdayException("setWeekDay(String): Invalid Weekday"); 
			else
				 
				this.weekDay = weekDay.toUpperCase();
	}
	public void setWeekDay(dayOfTheWeek day)throws InvalidWeekdayException {
		
			if(day.toString().toLowerCase().equals("sunday")||day.toString().toLowerCase().equals("saturday"))
				throw new InvalidWeekdayException("setweekDay(enum): Invalid Weekday"); 
			else
				 
				this.weekDay = day.toString();
	}
	public void setFriday(dayOfTheWeek day) throws InvalidWeekdayException{
		if(!day.toString().equals("FRIDAY"))
			throw new InvalidWeekdayException("setFriday(enum): Invalid day, Not a Friday");
		else
			this.weekDay = day.toString();
	}
	public String toString(){
		return "\nDay of the week: "+this.weekDay;
	}
	
}
