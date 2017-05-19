package sheet4AArrays;

public class Ex4Calender {
	public static void main(String[] args) {
		
		//String array containing each month of the year
		String[] month = {"January", "Februay", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		//String[] containing each day
		String[] day ={"M", "T", "W", "T", "F", "S", "S"};
		//where each month starts
		int[] startDay = {2,5,5,1,3,6,1,4,0,2,5,0};
		//number of days for each month
		int[][] dayOfTheMonth = {{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
								{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}};		
		System.out.print("\n\n\t  Calender for 2014\n\n");
		int start;
		for(start=0; start<month.length; start++){
			//prnt out each month string
			System.out.printf("\n\t    %s\n\t",month[start]);
			for(int j=0; j<day.length; j++){
				//print out each day char
				System.out.printf(" %s ",day[j]);
			}
			//newline and tab in, on to printing out the numbers for each month
			System.out.print("\n\t");
			//k is where the month starts : startDay[0] = 2 which means the month January starts on a Wednesday
			int k = startDay[start];
			//use count for a \n for every 7 days in the month, the first row will be - where the month starts -> k
			int count = 7 - k;
			// k spaces for the start day of the month
			for(int i=0; i<k; i++){
				System.out.print("   ");
			}
			System.out.print(" ");
			//print out the no. of days in the month 
			for(int j=0;j<dayOfTheMonth[start].length;j++){
				System.out.printf("%d",dayOfTheMonth[start][j]);
				/*formatting : numbers less than 10 get 2 spaces after the number
				 Numbers larger than 9 get 1 space after the number*/
				if(dayOfTheMonth[start][j] < 10){
					System.out.print("  ");
				}else{
					System.out.print(" ");
				}
				count--;
				//formatting for every 7 days in the month
				if(count == 0){
					System.out.print("\n\t ");
				//put count back to 7
					count = 7;
				}
			}
			System.out.print("\n");	
		}
	}
}
