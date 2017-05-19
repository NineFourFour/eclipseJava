package sheet4AArrays;

public class Ex1TwoDArrays {
	public static void main(String[] args) {
		
		String[][]  Teams = new String[4][];
		Teams[0] = new String[5];
		Teams[1] = new String[5];
		Teams[2] = new String[5];
		Teams[3] = new String[5];	
		
		Teams[0][0] = "Man United";
		Teams[1][0] = "Arsenal   ";
		Teams[2][0] = "Liverpool";
		Teams[3][0] = "West Ham ";
		
		Teams[0][1] = "ManOne  ";
		Teams[0][2] = "ManTwo  ";
		Teams[0][3] = "ManThree";
		Teams[0][4] = "ManFour ";
		
		Teams[1][1] = "ArsenalOne  ";
		Teams[1][2] = "ArsenalTwo  ";
		Teams[1][3] = "ArsenalThree";
		Teams[1][4] = "ArsenalFour ";
		
		Teams[2][1] = "LiverpoolOne  ";
		Teams[2][2] = "LiverpoolTwo  ";
		Teams[2][3] = "LiverpoolThree";
		Teams[2][4] = "LiverpoolFour ";
		
		Teams[3][1] = "WestHamOne  ";
		Teams[3][2] = "WestHamTwo  ";
		Teams[3][3] = "WestHamThree";
		Teams[3][4] = "WestHamFour ";
		System.out.println("\n\n\t\tTeams\t\t\tPlayers\n\t-----------------------------------------------------------------------------------------\n");

		for(int i = 0; i<Teams.length; i++ ){
			System.out.printf("\tTeam: %d",i+1);
			for(int j=0; j< Teams[0].length; j++){
				System.out.printf("\t%s",Teams[i][j]);
			}
			System.out.printf("\n");	
		}
		/**Scanner input = new Scanner(System.in);
		System.out.print("\t\nEnter the Team name : ");
		String name = input.nextLine();
		int x;
		for(int i=0; i<Teams.length; i++){
			//need to the spaces included for the formating
			String trim = Teams[i][0].trim();
			x = name.compareTo(trim);
			//Objects.equals("test", new String("test")) // --> true
			if( x == 0){
				System.out.printf("Team: %s",Teams[i][0]);
				Scanner input2 = new Scanner(System.in);
			
				System.out.print("Enter player number : ");
				int pn = input2.nextInt();
				System.out.print("Enter player name : ");	
	
			}
		}*/
	}
}
