import java.util.List;
import java.time.LocalDate;
import java.util.Arrays;

public class Chapter3 {
	static int[][] game = new int[6][6];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AniMal		";
		s=s.trim().toLowerCase().replace('a', 'A');
		System.out.println(s);
		System.out.println(s.toString());
		
		StringBuilder one = new StringBuilder("a");
		one.append('d');
		one.insert(2, '&');
		System.out.println("\nOne :"+one);
		
		String g = "GetIt";
		System.out.println(g.contains("e"));
		
		String x = "Hello World";
		String y = "	Hello World";
		System.out.println("\n\nx==y: "+(x==y)+"\n\n");
		
		
		
		//String... colour = args; will not compile
		game[3][3] = 6;
		for(int[] j: game)
			for(int jx: j)
				System.out.println(jx);
			
			
			
		Object[] obj = game;// will compile but dangerous
		//obj[3] = "X";
		System.out.println("\nobj.length: "+obj.length);
		for(Object i: obj){
			if( i instanceof int[]){
				int[] k = (int[])i;
				System.out.println("\nInt[].length: "+k.length);
				for(int z=0; z<k.length; z++ )
				System.out.print(k[z]);
			}
			System.out.println("\n");
		}
		
		
		
		
		
		int[] test;
		test = new int[4];
		int[] test1;
		test1 = new int[]{1,2,3,4};
		
		//new int[]{3,4,5,6};
		arrayA(new int[]{3,4,5,6,});
		System.out.println("Array: "+Arrays.toString(test1));
		System.out.println("Search Array for 5: "+Arrays.binarySearch(test1,5));
		System.out.println("Search Array for 2: "+Arrays.binarySearch(test1,2));
		
		String[] nums = new String[] { "1","a", "A2", "Ag","3A","4","34","9", "10","5","3","45","56","3a","4A","FF" };
		//[1, 10, 3, 34, 3A, 3a, 4, 45, 4A, 5, 56, 9, A2, Ag, FF]
		//see page 125
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int a = 97;
		char b = (char) a;
		Character c = b;
		System.out.println("\nchar c:"+c);
		
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> listOne = Arrays.asList(23,34,45);
		
		Integer ax= 23;
		ax.intValue();
		//ax.intValue();
		System.out.println(ax);
		
		
		
		int [][] args1 = new int[4][];
		args1[0] = new int[5];
		args1[1] = new int[3];
		Arrays.toString(args1[1]);
		for(int i = 0; i<args1[0].length; i++)
			System.out.print(args1[0][i]);
		
		System.out.println("\n--------------------");
		int[]array1 = new int[]{2};
		System.out.println(Arrays.toString(array1));
		Honda[] hondaArray = new Honda[5];
		Car[] carArray;
		carArray = hondaArray;
		
		
		LocalDate date = LocalDate.of(2014, 5, 21);
		
		
	}
	class Car{
		
	}
	class Honda extends Car{
		
	}
	public static void arrayA(int [] array){
		
	}
}
