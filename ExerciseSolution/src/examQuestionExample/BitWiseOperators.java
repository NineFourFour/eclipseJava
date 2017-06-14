package examQuestionExample;

public class BitWiseOperators {
	
	public static void main(String[] args) {
		
		/*bitwise operators
		Bitwise operator works on bits and performs bit-by-bit operation. 
		Assume if a = 60 and b = 13; now in binary format they will be as follows −

		a = 0011 1100
		b = 0000 1101

		-----------------

		a&b = 0000 1100

		a|b = 0011 1101

		a^b = 0011 0001

		~a  = 1100 00
		
		* 4 = 100
		*~4 = 011
		*
		*/
		
		//~ bitwise compliment does't work on boolean
		//System.out.println(~false);
		System.out.println(~4);//-5
		
		//bitwise | "or"
		System.out.println(true | true);//true
		System.out.println(true | false);//true
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		System.out.println(10 | 40);//42
		
		System.out.println("\n\n");
		
		//bitwise XOR = ^ "exclusive or"
		System.out.println(true ^ true);//false
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false
		System.out.println(10 ^ 40);//34
		System.out.println("\n\n");
		
		//bitwise & "and"
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		
		System.out.println("\n\n");
		//<< shift left
		System.out.println(10 << 2);//10 = 1010 --> 40 = 101000
		
		//>> shift right
		System.out.println(10 >> 2);//10 = 1010 --> 2 = 10
		
		System.out.println("\n\n");
		
		//>>> (zero fill right shift)
		
		//System.out.println(40 >>> 3);//5

		int x = 1;
		/*System.out.println(x++);//1
		System.out.println(x);//2
		System.out.println(++x);//3*/
		/*boolean a = 4>x;
		System.out.println(a);
		boolean b = x++ +2 > 3;
		System.out.println(b);
		System.out.println(a^b);*/
		if((4 > x ) ^ (++x +2 > 3)){
			System.out.println("x inside after if: "+x);
			x++;
		}
		System.out.println("x after if: "+x);
		if((4 > ++x ) ^ !(++x == 5)){
			
			x++;
		}
		System.out.println("x after second if: "+x);
		System.out.println("x: "+x);
		
		short x1 [];
		short [] y;
		short [] z [] [];
		int[] a [] = {{1,2}, {1}};
		
		
	}
}
