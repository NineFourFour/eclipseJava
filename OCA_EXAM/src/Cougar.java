	
	class Feline {
		 public String type = "f ";
		 public Feline() {
			 System.out.print("feline ");
		 }
	}
	public class Cougar extends Feline {
		 public Cougar() {
			 System.out.print("cougar ");
		 }
		 void go() {
			 type = "c ";
			 System.out.print(this.type + super.type);
		 }
		 public static void main(String[] args) {
			 new Cougar().go();
			 boolean b = false;
			 System.out.println(!b);
			 if(!b)
				 System.out.println("b is true: "+ b);
			 
			 int x = 5;
			 
			 if(x< 6)
				 System.out.println("x < 6");
			 else if( x < 10)
				 System.out.println("x < 10");
			 else
				 System.out.println(" x is x");
			 
			 
			 if(x< 6){
				 System.out.println("x < 6");
			 	if( x < 10)
				 System.out.println("x < 10");
			 }else
				 System.out.println(" x is x");
			 
			 
			 
			 x = 89;
			 
			 double profit = x > 80 && x < 90? 0.2 : x > 90? 0.5: 0;
			 System.out.println(profit);
			 
		 }
	
		 
	}