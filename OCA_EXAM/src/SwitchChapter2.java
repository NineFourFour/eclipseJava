
public class SwitchChapter2 {

	private int getSorted(String firstName, final String lastName){
		String middleName = "Patricia";
		final String suffix = "JR";
		int id=0;
		switch(firstName){
		case "Test":
			return 52;
		/*case middlename: //does not compile
			id=5;
			break;*/
		case suffix:
			id=0;
			break;
		/*case lastName; //does not compile
			id=8;
			break;
		case 5; //doesn't compile
			id=7;
			break;
		case 'J';// //doesn't compile
			id = 10;
		case java.time.DayOfWeek.SUNDAY: //doesn't compile
			id = 5;
			break;*/
		}
		return id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = new SwitchChapter2().getSorted("James", "nineFour");
		
		
		
	}
	

}
