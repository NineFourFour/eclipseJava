package camel;


public class Camel implements Rideable {
	
	int weight = 2;
	public String getGait(){
		return " mph, lope";
	}
	 void go(int speed) {
		 System.out.println(speed);
		 ++speed; weight++;
		 System.out.println(speed);
		 int walkrate = speed * weight;
		 System.out.print(walkrate + getGait());
	 }
	 public static void main(String[] args) {
		 new Camel().go(8);
		 //float x = 10.2F ;
		 long x1 = 3;
		 int y = 0;
		 System.out.println("\nArray int");
		 int [] index = new int [5];
		 for (int x: index)
			 System.out.println(x);
		 
		 System.out.println("\nY: "+y);
		 System.out.println("result: "+(y= getSortOrder("Test", null, 3)));
		 
	
	 }

	 public static int getSortOrder(String firstName, String lastName, int x){

		 //String middleName = "James";
		 final String suffix = "JR";
		 int id = 0;
		 System.out.println("id: "+id);
		 labname:
		 switch(firstName){
		 case "Test":
			 //System.out.println("Case 'Test' id: "+id);
			 return 52;
		 /*case middleName:
			 id =5;
			 break;
		 case lastName:
			 id = 8;
			 break;*/
		 case suffix:
			 id = 0;
			 break labname;
		 /*case 5:
			 id=7;
			 break;
		 case 'J': 
			 id = 10;
			 break;
		 case java.time.DayOfWeek.SUNDAY:
			 id=15;
			 break;*/
		 }
		 return id;
	 }
}
