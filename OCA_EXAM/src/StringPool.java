
public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		
		final String s2 = "Hel";
		final   String s3 = "lo";
		String s4 = s2+s3;
		String s5 = new String(s2+s3);
		
		System.out.println(s1==s4);
		System.out.println(s1==s5);
	}

}
