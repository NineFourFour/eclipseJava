package sheet15Exceptions;



public class TestClock {
	public static void main(String[] args){
		
		Clock c1 = new Clock();
		System.out.println(c1);
		try{
			System.out.println("\n\tSet hours to 25");
			c1.setHours(25);
		}catch(InvalidTimeException ite){
			System.out.println("\tERROR: "+ite.getMessage());
		}
		System.out.println("\n\n\tSet new Clock(25,60,68)");
		try{
			Clock c2 = new Clock(25, 60, 68);
			System.out.println(c2);
		}catch(InvalidTimeException ite){
			System.out.println("ERROR: "+ite.getLocalizedMessage());
		}
			
		try{
			Clock c3 = new Clock(13, 43, 5);
			System.out.print("\n\n\tNew Clock C3 13hours 43minutes 55seconds");
			System.out.printf("\n%s",c3);
			System.out.println("\n\tc3.setTime(25, 60, 88)");
			c3.setTime(45, 60, 88);
		}catch(InvalidTimeException ite){
			System.out.println("ERROR: "+ite.getMessage());

		}finally{
			System.out.println("\n\ntry requires either a catch block(one of a more)\nor a finially block"
					+ ". If the final block is there, it always excutes");
		}
		
	}
}
