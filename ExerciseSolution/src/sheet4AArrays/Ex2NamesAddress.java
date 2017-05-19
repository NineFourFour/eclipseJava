package sheet4AArrays;

import java.util.Scanner;

public class Ex2NamesAddress {
	public static void main(String[] args) {
		/*String[][] namesBrackets = {
				{"Joe Murphy", "12 Main Street", "Finglas", "Dublin 11"},
				{"Mary Jones", "36 Ameins Street", "Dublin 1"},
				{"Pat Flynn", "26 South Main Street","Wexford", "Co Wexford"}
		};*/
		
		String[][]  Names = new String[3][4];
		Names[0][0] = "Joe Murphy";
		Names[1][0] = "Mary Jones   ";
		Names[2][0] = "Pat Flynn";
		
		Names[0][1] = "12 Main Street     ";
		Names[0][2] = "Finglas    ";
		Names[0][3] = "Dublin 11";
		
		Names[1][1] = "36 Amiens Street";
		Names[1][2] = "Dublin 1   ";
		
		Names[2][1] = "26 South Main Street";
		Names[2][2] = "Wexford    ";
		Names[2][3] = "Co. Wexford";
	
		System.out.println("\n\n\t\tNames And Addresses\n\t-----------------------------------------------------------------------------------------\n");
		//print out the two-d array
		for(int i = 0; i<Names.length; i++ ){
			System.out.printf("\tName: %d",i+1);
			for(int j=0; j< Names[0].length; j++){
				//If entry is null don't print it
				if(Names[i][j] == null){
					System.out.printf("");
				}else{
					System.out.printf("\t%s",Names[i][j]);
				}
			}
			System.out.printf("\n");	
		}
		Scanner input = new Scanner(System.in);
		System.out.print("\n\tFind the address of name entered");
		System.out.print("\n\n\tEnter Name : ");
		String name = input.nextLine();
		name=name.toLowerCase();
		//System.out.println("name:"+name);
		// x is for the compareTo result, y is for not found in the array 
		int x, y=-1,i=0;
		for(; i<Names.length; i++){
			//get rid of the spaces included for the formating
			String trim = Names[i][0].trim();
			trim = trim.toLowerCase();
			//System.out.println(trim);
			x = name.compareTo(trim);//better to use name.equalsIgnoreCase(trim), returns a boolean;
			if( x == 0){
				System.out.printf("\tName: %s\n\tAddress:",Names[i][0]);
				for(int j =1; j<Names[i].length; j++){
					if(Names[i][j] == null){
						System.out.printf("");
					}else{
						System.out.printf("\t%s",Names[i][j]);
					}
					//y -> if name not found in the array
					y++;
				}
				/*find a match break, more than one match remove the break*/
				break;
			}
		
		}
		//System.out.printf("\tx : %d\ti : %d\ty : %d",x,i, y);
		//if name doesn't exist y will be -1 && if at end of array
		if (y < 0){
			System.out.print("\tThe name you have entered does not exist\n\tor you haven't entered the name correctly");
		}
		System.out.print("\n\n");
		input.close();
	}
}
