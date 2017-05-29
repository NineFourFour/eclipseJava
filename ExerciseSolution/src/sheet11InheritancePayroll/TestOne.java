package sheet11InheritancePayroll;

public class TestOne {

	/*public static long main(String[] args){
	     System.out.println("Hello");
	     return 10L;
	}
	public class TestClass{
		  
	}*/




    static final double percent = 0; //1
    int offset = 10, base= 50; //2
    public static double calc(double value) {
        int coupon, offset, base; //3
        if(percent <10){ //4
            coupon = 15;
            offset = 20;
            base = 10;
        }
        return coupon*offset*base*value/100; //5
    }

    public static void testInts(Integer obj, int var){
    	System.out.println("obj inside: "+obj);
    	System.out.println("var inside: "+var);
        obj = var++;
        System.out.println("obj= var inside: "+obj);
        obj++;
    }
          
	
	  static boolean b;
	  static int[] ia = new int[1];
	  static char ch;
	  static boolean[] ba = new boolean[1];
	 
	
  


	public static void main(String[] args) {
	    System.out.println(calc(100));
	    System.out.println(new Boolean(false));
	    System.out.println(Boolean.parseBoolean("True"));
	    
	    Integer val1 = new Integer(5);
	    int val2 = 9;
	    testInts(val1++, ++val2);
	    System.out.println(val1+" "+val2);
	System.out.println("b: "+b);
	System.out.println("ch: "+ch);
	System.out.println("ba[0]: "+ba[ch]);
	    boolean x = false;
	    if( b ){
	      x = ( ch == ia[ch]);
	    }
	    else x = ( ba[ch] = b );
	    System.out.println(x+" "+ba[ch]);
	    System.out.println(( ch == ia[ch]));
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	

}
