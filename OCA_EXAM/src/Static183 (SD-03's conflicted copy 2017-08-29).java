
public class Static183 {
		private String name = "Static class";
		public static void first() { 
			//name = "class";// can't make a static reference to an non-static reference
			//Static183.name = "Change Class";// can't make a static reference to an non-static reference
			Static183 s183 = new Static183();
			s183.name = "NineFour";
		}
		public static void second() { }
		public void third() { System.out.println(name); }
		
		public static void main(String args[]) {
			first();
			second();
			//third(); // DOES NOT COMPILE
		} 
}
