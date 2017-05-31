package sheet17ArrayLists;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		
		Trainee t = new Trainee("NineFour", "94 main ", LocalDate.now());
		Trainee t1 = new Trainee("NineFour", "94 main st", LocalDate.now());
		
		
		if (t.equals(t1))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
