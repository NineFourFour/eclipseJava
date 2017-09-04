
public class Special {
	private StringBuilder s = new StringBuilder("bob"); // our special data
	
	StringBuilder getName() { 
		StringBuilder s1 = new StringBuilder(s);
		return s1; 
	}
	void printName() { 
		System.out.println(s);
	}
}
