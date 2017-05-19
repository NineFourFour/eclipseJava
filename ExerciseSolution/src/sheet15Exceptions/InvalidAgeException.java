/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet15Exceptions;

public class InvalidAgeException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	
	String message;
	
	public InvalidAgeException(){
		
	}
	public InvalidAgeException(String message){
		super();
		this.message = message; 
	}
	public InvalidAgeException(Throwable cause) {
	        super(cause);
	}
	
}
