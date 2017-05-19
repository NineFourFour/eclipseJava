package sheet5Classes;

public enum FrequencyMembership {
	
	WEEKLY(52,10),
	MONTHLY(12,30),
	YEARLY(1,300),
	PAY_AS_YOU_GO(34, 7);
	
	int frequency;
	int cost;
	
	FrequencyMembership(int frequency, int cost){
		this.frequency = frequency;
		this.cost = cost;
	}
	
	public int getFrequency(){
		return this.frequency;
	}
	public int getCost(){
		return this.cost;
	}
}
