package sheet15Exceptions;



public class Clock {
	
	static int number = 0;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	/*is this the default constructor or a zero parameter constructor*/
	public Clock(){
		number++;
		this.hours = 12;
		this.minutes = 0;
		this.seconds = 0;
	}
	/*added in the exceptions to the constructor*/
	public Clock(int hours,int minutes, int seconds){
		this();
		try{
			setHours(hours);
		}catch(InvalidTimeException ite){
			System.out.println("ERROR: "+ite.getMessage());
		}
		try{
			setMinutes(minutes);
		}catch(InvalidTimeException ite){
			System.out.println("ERROR: "+ite.getMessage());
		}
		try{
			setSeconds(seconds);	
		}catch(InvalidTimeException ite){
			System.out.println("ERROR: "+ite.getMessage());
		}
	}
	/*getters and setters*/
	public void setHours (int hours)throws InvalidTimeException{
		if(hours > 23)
			throw new InvalidTimeException("Hours must be less than 24");
		this.hours = hours;
	}
	public void setMinutes(int minutes)throws InvalidTimeException{
		if(minutes > 59)
			throw new InvalidTimeException("Minutes must be less than 60");
		this.minutes = minutes;
	}
	public void setSeconds(int seconds)throws InvalidTimeException{
		if(seconds > 59)
			throw new InvalidTimeException("Seconds must be less than 60");
		this.seconds = seconds;
	}
	public int getHours(){
		return this.hours;
	}
	public int getMinutes(){
		return this.minutes;
	}
	public int getSeconds(){
		return this.seconds;
	}
	public void setTime(int hours, int minutes, int seconds)throws InvalidTimeException{
		if(hours > 24)
			throw new InvalidTimeException("Hours greater than 24");
		else if(minutes > 60)
			throw new InvalidTimeException("Minutes greater than 60");
		else if(seconds > 60)
			throw new InvalidTimeException("Seconds greater than 60");
		else{
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
			
	}
	public void getTime(){	
		String s = "\n\tString s = "+(this.hours < 10 ? "0"+this.hours : ""+this.hours)+":"+(this.minutes < 10 ? "0"+this.minutes : ""+this.minutes)+":"+(this.seconds < 10 ? "0"+this.seconds : ""+this.seconds);
		System.out.println(s);
	}
	public void incrementHours(int hours){
		this.hours +=hours;
		if(this.hours >= 24)
			this.hours = this.hours - 24;
	}
	public void incrementMinutes(int minutes){
		this.minutes +=minutes;
		/*while mintutes is above 60, increase hours by 1 for every 60 in minutew*/
		while(minutes > 60){
			this.minutes = this.minutes - 60;
			this.hours += 1;
			minutes = minutes-60;
		}
		/*if hours is above 24, keep reducing till below 24*/
		while(this.hours > 24){
			this.hours = this.hours - 24;	
		}
	}
	public void incrementSeconds(int seconds){
		/*if seconds is above 60, need to increase minutes by 1 for every 60 seconds
		also if there end up being more than 60 minutes then hour also need to be increased 
		by 1 for every 60 minutes*/
		this.seconds +=seconds;
		while(seconds > 60){
			this.seconds = this.seconds - 60;
			this.minutes += 1;
			seconds = seconds-60;
		}
		while(this.minutes > 60){
			this.minutes = this.minutes - 60;
			this.hours += 1;
		}
		/*if hours is above 24, keep reducing till below 24*/
		while(this.hours > 24){
			this.hours = this.hours - 24;
		}		
	}
	public String toString(){
		return "\tClock C"+Clock.number+" "+this.hours+":"+(this.minutes < 10? this.minutes+"0": this.minutes)+":"+(this.seconds<10? this.seconds+"0":this.seconds);
	}
}
