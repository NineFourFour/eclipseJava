package sheet5Classes;

public class TestEmail {
	public static void main(String[] args){
		Email email1 = new Email();
		System.out.printf("\n\nEmail Account\n\n\tDefault Constructor\n");
		System.out.printf("\n\tSet email address to james.hickey@webelevate.ie:\n");
		email1.setEmailaddress("james.hickey@webelevate.ie");
		System.out.printf("\n\tSet password to FTS123456\n");
		email1.setPassword("FTS123456");
		System.out.printf("\n\tSet Max Storage to MaxStorage._100GB\n");
		email1.setMaxStorageLimit(MaxStorage.STORAGE_100GB);
		System.out.println("\nFirst email: "+email1);
		System.out.println("\n\n\tEmail email2 = new Email(\"hickey.jp@tcdie\", \"qwertyuiopasdfghickeyjp\", MaxStorage._1TB)");
		Email email2 = new Email("hickey.jp@tcdie", "qwertyuiopasdfghickeyjp", MaxStorage.STORAGE_1TB);
		System.out.println("\nSecond Email: "+email2);
		Email email3 = new Email("hickey.jptcd.ie", "123",MaxStorage.STORAGE_500GB);
		System.out.println("\nThird Email: "+email3);
	}
}
