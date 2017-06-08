package sheet15Exceptions;

public class InvalidWeekdayException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidWeekdayException(){
	}
	public InvalidWeekdayException(String message){
		super(message);
		
	}
	
}
