package example;

public class Test {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p);
		p.setName("NineFour");
		System.out.println(p);
		
		Child c = new Child();
		System.out.println(c);
		c.setName("James");
		System.out.println(c);
		c.setSchoolAddress("Finglas");
		System.out.println(c);
		
		Parent p1 = new Child("Finglas");
		//can do
		p1.setName("String");

		System.out.println(p1);
		System.out.println(p1.toString());
		/*Child c1 = new Parent();
		can assign a child to a parent but can assign a parent to a child
		p*/
	}
}
