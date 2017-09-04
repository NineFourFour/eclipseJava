

public class Static extends SuperClass{
	Member m = new Member();
	static int counter;
	
	private int memberNumber = 2345;
	
	public Static(){
		System.out.println("Static constructor counter: "+counter++);
	}
	static{
		System.out.println("Static Block Counter: "+counter++);
	}
	{
		System.out.println("Initialization Block memberNumber: "+memberNumber+" Counter: "+counter++);
	}
	public String toString(){
		return "Objects String counter: "+counter++;
	}

	public static void main(String[] args) {
		Static st = new Static();
		System.out.println(st);
	
	}
}


class SuperClass{
	
	SuperClass(){
		System.out.println("superClass");
	}

}

class Member{
	public Member() {
		// TODO Auto-generated constructor stub
		System.out.println("Member Class counter: ");
	}
}
/*
 * 
 * 	Order or access, for the creating of an instance of the class
 * 	  
 * 	1. static variables
 * 	2. static block
 * 	3. super class
 * 	4. member variables
 * 	5. initialization blocks: order they appear in
 *  6. constructor
 *  7. methods
 * 	
 * 	OutPut 
 * 	
 * 	static block----------Static Counter1222222222
 *	super()---------------superClass
 *	member variable-------Member Class
 *	initialization block--MemberNumber1444444444
 *	constructor-----------Static constructor
 *	methods---------------Objects string
 * 
 *  Static Block Counter: 0
 *	superClass
 *	Member Class counter: 
 *	Initialization Block memberNumber: 2345 Counter: 1
 *	Static constructor counter: 2
 *	Objects String counter: 3
 *
 */

