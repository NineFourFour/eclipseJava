package sheet7EmployeeAndClock;

public class Clock {
	static int number = 0;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	/*is this the default constructor or a zero parameter constructor*/
	public Clock(){
		number++;
		this.hours = 12;
	}

	public Clock(int hours,int minutes, int seconds){
		this();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public void setHours(int hours){
		this.hours = hours;
	}
	public void setMinutes(int minutes){
		this.minutes = minutes;
	}
	public void setSeconds(int seconds){
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
	public void setTime(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public void getTime(){
		/*String hours = null, minutes = null, seconds = null;
		
		if(this.hours < 10)
			hours = "0"+this.hours;
		else
			hours = Integer.toString(this.hours);
		if(this.minutes < 10)
			minutes = "0"+this.minutes;
		else
			minutes = Integer.toString(this.minutes);
		if(this.seconds < 10)
			seconds = "0"+this.seconds;
		else
			seconds = Integer.toString(this.seconds);
		System.out.printf("\n\t%s:%s:%s",hours, minutes, seconds);*/
		
		System.out.println("\t"+(this.hours < 10 ? "0"+this.hours : ""+this.hours)+":"+(this.minutes < 10 ? "0"+this.minutes : ""+this.minutes)+":"+(this.seconds < 10 ? "0"+this.seconds : ""+this.seconds));
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
		return "\t"+(this.hours < 10 ? "0"+this.hours : ""+this.hours)+":"+(this.minutes < 10 ? "0"+this.minutes : ""+this.minutes)+":"+(this.seconds < 10 ? "0"+this.seconds : ""+this.seconds);
	}
	
	
}
