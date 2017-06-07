package sheet15Exceptions;



public class TestClock {
	public static void main(String[] args){
		
		Clock c1 = new Clock();
		System.out.println(c1);
		try{
			c1.setHours(25);
		}catch(InvalidTimeException ite){
			System.out.println("\tERROR: "+ite.getMessage());
		}
		Clock c2 = new Clock(25, 60, 68);
		System.out.println(c2);
		c2.getTime();
		Clock c3 = new Clock(13, 43, 55);
		System.out.print("\n\n\tNew Clock C3 13hours 43minutes 55seconds");
		System.out.printf("\n%s",c3);
		try{
			System.out.println("\n\tc3.setTime(5, 45, 88)");
			c3.setTime(5, 45, 88);
			
		}catch(InvalidTimeException ite){
			System.out.println("\n\tERROR: "+ite.getMessage());
		}finally{
			System.out.println("\n\nIn the final block which always prints");
		}
		
	}
}
