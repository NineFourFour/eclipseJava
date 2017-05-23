package sheet7EmployeeAndClock;

public class test {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";
		String s4 = s3;
		String s5 = "he"+"llo";
		System.out.println(s5 == s3);
		System.out.println(s4 == s1);
		System.out.println(s5 == s2);
	}
}
