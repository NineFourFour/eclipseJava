package variables;

public class Stats {
	String color;
	public void getColor(String color){
		System.out.println(color);
		color = "Red";
		System.out.println(color);
	}
	public static void main(String[] args) {
		
		Stats s = new Stats();
		
		s.getColor("blue");
		for(int j=0; j< 10; j++){
			;
		}
		//mightn't
		//System.out.println(j);
		/*output for line above, line 19
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			j cannot be resolved to a variable
		
			at variables.Stats.main(Stats.java:18)
		 * 
		 * 
		 * 
		 * */
	}
}
