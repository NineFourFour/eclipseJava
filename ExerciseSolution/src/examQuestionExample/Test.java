package examQuestionExample;

public class Test {
	
	public static void main(String[] args) {
		
		String s1="Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
		
		int count = 0;
		int x = 3;
		System.out.printf("\nOutside while loop count: %d x: %d ",count,x);
		while(count++ < 3){
			
			int y = (1+2*count)%3;
			System.out.printf("\ny: %d ",y);
			switch(y){
				default:
					System.out.println("Default");
				case 0:
					System.out.println("\ncase 0: x: "+x+"");
					x -=1;
					System.out.println("\ncx -=1 : "+x+"\n");
				break;
				
				case 1: System.out.println("\ncase 1: x: "+x+"");
						x+=5;
			}
			System.out.printf("\nBottom of loop count: %d x: %d\n ",count,x);
		}
		System.out.println("\n"+x);
		
		try{
			System.out.println("Try A");
			throw new IllegalArgumentException();
			
		}catch(RuntimeException e){
			System.out.println("TRY b");
			
		}finally{
			System.out.println("Try c");
		}
		
		
	}
}
