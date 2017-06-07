/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public abstract class Trainee {
	private String name;
	private LocalDate dateOfBirth;
	private String rsiNumber;
	
	public Trainee(){
		
	}
	public Trainee(String name, LocalDate dateOfBirth, String rsiNumber){
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.rsiNumber = rsiNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setDateOfBirth(LocalDate dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	public void setRsiNumber(String rsiNumber){
		this.rsiNumber = rsiNumber;
	}
	
	public String getName(){
		return this.name;
	}
	public LocalDate getDateOfBirth(){
		return this.dateOfBirth;
	}
	public String getRsiNumber(){
		return this.rsiNumber;
	}
	
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return this.getClass().getSimpleName()+"Name: "+this.name+"\nDate of Birth: "+dateOfBirth.format(formatter)+"\nRSI Number: "+this.rsiNumber;
	}
}
