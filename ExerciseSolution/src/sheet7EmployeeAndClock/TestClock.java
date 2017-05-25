package sheet7EmployeeAndClock;

public class TestClock {
	public static void main(String[] args){
		Clock c1 = new Clock();
		System.out.printf("\n\n\tNew Clock C%d",Clock.number);
		c1.getTime();
		c1.setMinutes(25);
		c1.setSeconds(1);
		System.out.printf("\n\n\tset minutes to 25, set seconds to 1");
		c1.getTime();
		c1.incrementHours(12);
		System.out.print("\n\n\tincrement time by 12 hours");
		c1.getTime();
		c1.incrementMinutes(6003);
		System.out.print("\n\n\tincrement time by 6003 minutes");
		c1.getTime();
		System.out.print("\n\n\tincrement time by 6063 seconds");
		c1.incrementSeconds(6063);
		c1.getTime();
		System.out.println(c1);
		
		Clock c2 = new Clock();
		System.out.printf("\n\n\tNew Clock C%d",Clock.number);
		c2.getTime();
		System.out.printf("\n\n\tIncrement C%d by 789543 seconds.\n",Clock.number);
		c2.incrementSeconds(789543);
		c2.getTime();
		Clock c3 = new Clock(13, 43, 55);
		System.out.print("\n\n\tNew Clock C3 13hours 43minutes 55seconds");
		System.out.printf("\n%s",c3);
	}
}
