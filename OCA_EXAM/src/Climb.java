	interface Climber {
		boolean isTooHigh(int height, int limit);
	}
	
	public class Climb {
	public static void main(String[] args) {
		check((h, l) -> h.append(l).isEmpty(), 5);
	}
	private static void check(Climb climb, int height) {
		 if (climb.isTooHigh(height, 10))
			 System.out.println("too high");
		 else
		 System.out.println("ok");
			}
	 }
