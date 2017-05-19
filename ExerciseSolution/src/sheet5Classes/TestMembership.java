package sheet5Classes;

public class TestMembership {
	
	public static void main(String[] args) {
		Membership m1 = new Membership();
		//System.out.println(m1);
		//m1.setFrequency(FrequencyMembership.MONTHLY);
		System.out.println(m1);
		Membership m2 = new Membership(FrequencyMembership.MONTHLY);
		System.out.println(m2);
		Membership m3 = new Membership("NineFour",12345,FrequencyMembership.YEARLY);
		System.out.println(m3);
		Membership m4 = new Membership();
		System.out.println(m4);
		Membership m5 = new Membership(FrequencyMembership.PAY_AS_YOU_GO);
		System.out.println(m5);
		m5.setName("Ninefour");
		
		/*our highest priority is to satisfy the customer through continuous early delivery of valuable software*/
		
		Membership[] members = {m1,m2,m3,m4,m5};
		System.out.println("---------------------------------------------------------");
		System.out.println("\t\tArray of members");
		for(int i=0; i< members.length; i++){
			System.out.println("cost: €"+members[i].getMembershipFrequency().cost);
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("\t\tenhanced for loop");
		for(Membership m :members)
			System.out.println(m);
	}
}
