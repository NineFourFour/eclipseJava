package shore;

import swan.Swan;

public class Bird {
	protected String text = "floating"; // protected access
	protected void floatInWater() { // protected access
		System.out.println(text);
	} 
	Bird b = new Bird();
	String c = b.text;
	public static void main(String[] args) {
		new Bird().floatInWater();
	}
	
}

class WaterBird{
	
	public void notInThisClass(){
		Bird b = new Bird();
		System.out.println(b.text);
		b.floatInWater();
	}
	public void childInSideParentPackage(){
		Swan s = new Swan();
		s.floatInWater();
	}
}