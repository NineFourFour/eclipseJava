package variables;

public class Var {
	public static void main(String[] args) {
		String a = "";
		
		a += 2;
		a += 'C';
		a += false;
		
		/*System.out.println("\n\t"+a);
		
		int num = 0127;
		System.out.println("\n\tb)"+num);
		int num2 = 0x100;
		System.out.println("\n\tb)"+num2);
		char letter = 42;
		System.out.println("\n\tb)"+letter);
		
		
		for(int i=33; i<128; i++){
			letter =(char) i;
			System.out.println("\n"+i+"\t"+letter);
			
		}
		
		byte b3;
		for(int i=100; i<164; i++){
			b3 =(byte) i;
			System.out.println("\n"+i+"\t"+b3);
			
		}*/
		System.out.println("******");
		int [] nums= {};
		for(int i=0; i<nums.length; i++){
			System.out.println("\ti: \t"+nums[i]);
			
		}
		
		int [] nums1= new int[5];
		for(int i=0; i<nums1.length; i++){
			System.out.println("\t*******"+i+": \t"+nums1[i]);
			
		}
		int num3;
		boolean isTrue = false;
		if(isTrue){
			num3 = 12;
		}
		//System.out.println(num3);
		
		if(isTrue){
			num3 = 12;
		}else{
			num3= 14;
		}
		System.out.println(num3);
		
		int a1 =10;
		System.out.println("a: "+a1);
		int b = a1;
		System.out.println("b=a: "+b);
		b=12;
		System.out.println("b: "+b+" a:  "+a1);
		
		
	}
}
