import java.util.ArrayList;

public class TestArrayListWrapper {
	public int num;
	
	public TestArrayListWrapper(){
		num = 4;
	
	}
	public static void main(String[] args) {
		ArrayList<Integer> listOfArray = new ArrayList<>();
		int j = 45 + new Integer("456");
		System.out.println(j);
		System.out.println(listOfArray.add(10));
		Character letter = new Character('c');
		int l = Integer.valueOf(letter);
		System.out.println(l);
		
		Float f = new Float("12.34");
		Boolean b1 = true;
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf("TRue");
		Boolean b4 = Boolean.valueOf("false");
		System.out.println("b1 == b4 = "+(b1==b3));
	}
}
