package sheet15Exceptions;

public class InvalidWeekdayException extends Exception {
	private String message;
	
	public InvalidWeekdayException(){
		super();
	}
	public InvalidWeekdayException(String message){
		super();
		this.message = message;
	}
	public String getMessage(){
		return this.message;
	}
}
