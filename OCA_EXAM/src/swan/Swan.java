package swan;

import shore.Bird;

public class Swan extends Bird{
	 public void swim() {
		floatInWater(); // package access to superclass
		System.out.println(text); // package access to superclass
	 }
	 public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater(); // package access to superclass
		System.out.println(other.text);// package access to superclass
		Bird b = new Swan();
		//b.floatInWater(); All about the reference type here, 
		//bird reference will not be visible.
		//not overridden in the swam class
	 }
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		//other.floatInWater(); // DOES NOT COMPILE
		//System.out.println(other.text); // DOES NOT COMPILE
	}

}

class AnotherSwan{
	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		//other.floatInWater(); // not visible
		//System.out.println(other.text);// not visible
	}
}
