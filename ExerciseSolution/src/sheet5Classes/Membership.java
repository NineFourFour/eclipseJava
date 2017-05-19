package sheet5Classes;

public class Membership {
		private String name;
		private int memberShipNumber;
		private int frequency;
		private double cost;
		private FrequencyMembership frequencyType;//enum class
		private static int defaultMembership = 949494;
		/*SINCE IT'S FINAL IT NEEDS TO BE INITIALIZED*/
		//public static final int PAY_AS_YOU_GO = 1;
		public static final int MONTLY = 2;
		public static final int YEARLY = 3; 
		
		public Membership(){
			/*to increment the this.memberShipNumber each time an object is created,
			need to use a static int, in this case defaultMembership*/
			this.memberShipNumber = defaultMembership++;
			this.frequencyType = FrequencyMembership.WEEKLY;
		}
		//constructor using the no-args constructor first -> this(); no-args constructor
		public Membership(FrequencyMembership frequencyType){
			this();
			setPaymentFrequency(frequencyType);
		}
		public Membership(String name, int membershipNumber, FrequencyMembership frequency){
			this.name = name;
			this.memberShipNumber = membershipNumber;
			setPaymentFrequency(frequency);
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
		public void setFrequency(int frequency){
			
				this.frequency = frequency;
			
		}
		public int getFrequency(){
			return this.frequency;
		}
		public void setCost(double cost){
			this.cost = cost;
		}
		public double getCost(){
			return this.cost;
		}
		public void setMemNum(int num){
			this.memberShipNumber = num;
		}
		public int getMemNum(){
			return this.memberShipNumber;
		}
		public void setPaymentFrequency(FrequencyMembership frequency){
			switch(frequency.getFrequency()){
				case 1:
				case 12:
				case 52:
					this.frequencyType = frequency;
					break;
				default:
					this.frequencyType.frequency=32;
			}
		}
		public FrequencyMembership getMembershipFrequency(){
			return this.frequencyType;
		}
		public String getPaymentAsString(){
			System.out.println("\n\t------"+frequencyType.frequency);
			switch(frequencyType.getFrequency()){
				case 52:
					return "Weekly";
				case 12:
					return "Montly";
				case 1:
					return "Yearly";
				default:
					return "not recgonized";
						
			}
		}
		public String toString(){
			return "Member Name: "+this.name+"\nMembership Number: "+
									this.memberShipNumber+"\nFrequency: "+getPaymentAsString()+
									"\nCost: €"+this.frequencyType.getCost();
		}
}

