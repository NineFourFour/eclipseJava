package examQuestionExample;
/*if the error in Puma then the next line will cause an error because 
 * it's implementing an invalid version of an overloaded method  */
public class Cougar extends Puma {
	
	public static void main(String[] args) {
		/*puma is abstract class, it can't be instaniated
		 * Puma puma = new Puma();
		System.out.println(puma.getTailLength());*/
	}
	public int getTailLength(int length){
		return 2;
	}
}
