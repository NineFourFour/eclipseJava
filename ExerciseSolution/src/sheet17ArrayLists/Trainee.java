package sheet17ArrayLists;

import java.time.LocalDate;

public class Trainee {
	
	private String name;
	private String address;
	private LocalDate birthday;
	
	public Trainee(String name, String address, LocalDate birthday) {
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	/*overriding methods in object class*/
	public boolean equals(Object obj){
		Trainee other = (Trainee) obj;
		if(this.name.equals(other.name) && this.address.equals(other.address) && this.birthday.equals(other.birthday))
			return true;
		else 
			return false;
	}
	
	public String toString(){
		return "\nName: "+this.name+", Address: "+this.address+", Birthday: "+this.birthday;
	}
}
