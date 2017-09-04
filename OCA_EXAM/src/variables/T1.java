package variables;

public class T1 {
	
	String name;
	
	public static void main(String[] args) {
		/*note: draw a diagram in the exam for this type of question*/
		
		
		T1 tOne = new T1();
		System.out.println("\ntOne.name is null as it is assigned a default value: "+tOne.name);
		tOne.name = "TED";
		System.out.println("\nAssign Ted to tOne.name: "+tOne.name);
		System.out.println("\nDeclare a new reference variable tTwo, make it equal to tOne");
		
		T1 tTwo = tOne;
		System.out.println("tTwo.name: "+tTwo.name);
		
		System.out.println("\nchange tTwo.name to Fred");
		tTwo.name = "Fred";
		System.out.println("So tOne.name is equal to: "+tOne.name);
		System.out.println("tTwo.name = "+tTwo.name);
		
		T1 tThree = new T1();
		tThree.name = "James";
		System.out.println("tThree.name:"+tThree.name);
		tThree = tOne;
		System.out.println("\ntThree ---> tOne, tThree.name: "+tThree.name);
		System.out.println("\nthe object that was assigned to tThree containing the varaible 'james' is no longer accessible,\nso eligible for garbage collection");
		int i=1;
		System.out.println(i);
		i = i++;
		System.out.println(i);
	}
}
