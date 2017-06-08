package sheet15Exceptions;

public class SalaryTooHighException extends Exception{

	private static final long serialVersionUID = 1L;

	public SalaryTooHighException(){
		
	}
	public SalaryTooHighException(String message){
		super(message);
	}
}
