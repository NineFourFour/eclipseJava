package sheet15Exceptions;

public class InvalidTimeException extends Exception{
	private String message;
	
	public InvalidTimeException(){
		super();
	}
	public InvalidTimeException(String message){
		super();
		this.message = message;
	}

	public String getMessage(){
		return this.message;
	}

}
