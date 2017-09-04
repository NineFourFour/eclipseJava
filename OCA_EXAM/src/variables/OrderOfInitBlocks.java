/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/OrderOfInitBlocks.java
 */ 

package variables;

class OrderOfInitBlocks {
	public static void main(String[] args) {
		new Parent();
		System.out.println(Parent.i);
		new Init();
		System.out.println(Parent.i);
		//Init i2 = new Init();
	}
}

class Init extends Parent{
	
	A a = new A();		//step 9 second print of A
	
	{	/*initalization block*/				// step 10
		A a1 = new A();
		System.out.println("6. Init block 1");
	}
	
	public Init() {//start here step 1 up to step2 the parent construct
		//super();
		System.out.println("8. In the Constructor");	//step 12
	}
	
	{					// step 11
		System.out.println("7. Init block 2");
	}
	static{
		System.out.println("Static block");
		i = 999999;
	}

}

class A {
	A() {// step 4
		System.out.println("1. In A"); //step 5 print
	}
}
class Parent{
	static int i = 0;
	A a = new A();	// step three
	Object obj = new Object();
	
	{					// step 6
		System.out.println("2. Parent block 1");
	}
	
	public Parent() {//step two, first up to member variables 
		System.out.println("4. In the Parent Constructor");	// step 8 print out
	}
	
	{					// step 7
		System.out.println("3. Parent block 2");
	}
	/*static is set up first, it belongs to the class not the objects instantiated from that class
	 * 
	 * */
	static{
		System.out.println("Static block 2");
	}
}


/*static or class variable
 * order of output, Init extends Parent
 * new Init();
 * First it goes to set up the Parent class.
 * 1. start with the member variables---> set up a print In A
 * 2. parent block one
 * 3. parent block two
 * 4. parent constructor
 * Then inside Init;
 * 5. start with the member variables---> set up a print In A
 * 6. child block one
 * 7. child block two
 * 8. child constructor * 
 * 	In A
	Parent block 1
	Parent block 2
	In the Parent Constructor
	In A
	Init block 1
	Init block 2
	In the Constructor
 * 
 * Init i2 = new Init();
 * 	In A
	Parent block 1
	Parent block 2
	In the Parent Constructor
	In A
	Init block 1
	Init block 2
	In the Constructor 
 * 
 * 
 * */
 