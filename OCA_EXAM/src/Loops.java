import java.util.concurrent.SynchronousQueue;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 20;
		
		while(j > 10){
			
			System.out.println("In the loop J : "+j);
			
			j--;
			
		}
		
		int i = 0;
		
		while(i < 4){
			
			System.out.println("In the loop i : "+i);
			
			i++;
			
		}
		
		System.out.println("I after the loop: "+i);
		
		i=0;
		do{
			System.out.println("do while I: "+i);
			i++;
		}while(i < 4);
		
		int y=0;
		for(i =20; (i<10 && y-- < 2 )| i==20; i++){
			System.out.println("**************************************");
			System.out.printf("i: %d y: %d\n", i, y);
		}
		
		for(int d=10, e=0; d > 0; d--, e++){
			if(d < e)
				break;
			System.out.println("-------------------");
			System.out.printf("d: %d e: %d\n", d, e);
		}
		for(int d=10, e=0; d > 0; d--, e++){
			if(d < e){
				System.out.printf("continues d: %d e: %d\n", d, e);
				continue;
			}
			System.out.println("*");
			System.out.printf("d: %d e: %d\n", d, e);
		}
		
		
		outer:
			for(int i1 = 0; i1 < 5; i1++){
				
				for(int j1=0; j1< 5; j++){
					System.out.printf("Hello j1:%d\n",j1);
					continue outer;
					
				}
				System.out.println("outer");
			}
		System.out.println("Using break");
		outer:
			for(int i1 = 0; i1 < 5; i1++){
				
				for(int j1=0; j1< 5; j++){
					System.out.printf("Hello j1:%d\n",j1);
					break;
					
				}
				System.out.println("outer");
			}
		
		
		/*	
		 * long is bigger than an int so will not compile
		 * cast x to an int to solve
		 * 
		 * */
		
		long x = 10;
		int y1 = 5;
		y1 = y1 * (int)x;
		y1 = (int)(y1 * x);
		
		y1 *= x;
		
		int m = 15;
		int n = 5;
		int p = 0;
		while(m>n){
			
			m--;
			n+=2;
			
			p += m+n;
		}
		System.out.println("P : "+p);
		
		
		
		
		
		System.out.println("End of the main");
	}

}
/*

In the loop i : 0
In the loop i : 1
In the loop i : 2
In the loop i : 3
I after the loop: 4
*/