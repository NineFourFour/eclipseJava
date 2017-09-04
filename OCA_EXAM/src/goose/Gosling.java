package goose;

import shore.Bird;
import swan.Swan;

public class Gosling {
	public void swim() {
		Bird b = new Bird();
		//b.text; not visible
		//b.floatInWater; not visible
	}
	public void childInSideDifferentPackage(){
		Swan s = new Swan();
		//s.floatInWater(); not visible
	}

}
