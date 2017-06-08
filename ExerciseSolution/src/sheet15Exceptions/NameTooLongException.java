package sheet15Exceptions;

public class NameTooLongException extends Exception{

	private static final long serialVersionUID = 1L;

	public NameTooLongException(){}
	
	public NameTooLongException(String message){
		super(message);
	}
	
}
