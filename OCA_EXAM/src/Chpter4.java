import static java.lang.Integer.MAX_VALUE;

public class Chpter4 {
	
	public static void main(String[] args) {
		String s = "name";
		System.out.println(s);
		change(s);
		int x = MAX_VALUE;
		Class4 ch4 = new Class4();
		//ch4.changeCounter();
		System.out.println(s);
		//System.out.println(ch4.counter);
		
	}
	
	public static void change(String s){
		s = s + "end";
		System.out.println(s);
	}
	
	
}

class Class4{
	private int counter;
	
	
	private void changeCounter(){
		counter++;
		System.out.println(counter);
	}
	
}
