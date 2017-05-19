package sheet5Classes;

public class Email {
	private String emailAddress;
	private String password;
	private int maxStorageLimit;
	/*default constructor created by the compiler but since it's here, called the no-args constructor
	 * 
	 */
	public Email(){
		/*ASSIGN A DEFAULT VALUE*/
		this.maxStorageLimit = MaxStorage.STORAGE_100GB.getMaxStorage();
	}
	/*
	 * Since we have this constructor we need to define a no-args constructor, which is above*/
	public Email(String emailAddress, String password, MaxStorage maxStorage){
		this();//since we set a default value include this()
		setEmailaddress(emailAddress);
		setPassword(password);
		this.maxStorageLimit = maxStorage.getMaxStorage();
	}
	public void setEmailaddress(String emailAddress){
		if(emailAddress.contains("@")&&emailAddress.contains(".")){
			int indexAt = emailAddress.indexOf('@');
			int indexDot = -1;// countDot=0;
			/*char[] email = emailAddress.toCharArray();
			for(int i = 0; i < email.length; i++){
				if(email[i] == '.')
					countDot++;
				
			}*/
			indexDot = emailAddress.lastIndexOf('.');
			if(indexAt < indexDot){
				/*System.out.println("indexAt"+indexAt);
				System.out.println("indexDot"+indexDot);*/
				this.emailAddress = emailAddress;
			}else{
				System.out.println("\n\nEmail ERROR:: Not foolen me BoyOOOO000.");
			}
		}else{
			System.out.println("\n\nERROR:: not an email address");
		}
	}
	public String getEmailAddress(){
		return this.emailAddress;
	}
	public void setPassword(String password){
		if(password.length()<20)
			this.password = password;
		else
			System.out.println("\n\n\tpassword to long, max 20 characters");
	}
	public String getPassword(){
		return this.password;
	}
	public void setMaxStorageLimit(MaxStorage maxStorage){
			this.maxStorageLimit = maxStorage.getMaxStorage();
	}
	public double getMaxStorageLimit(){
		return this.maxStorageLimit;
	}
	private String getStorageLimit(){
		if(this.maxStorageLimit > 1000)
			return "1TB";
		else
			return this.maxStorageLimit+"GB";
	}
	public String toString(){
		return "Email Address: "+this.emailAddress+"\tPassword: "+this.password+"\tMax Storage Limit: "+((maxStorageLimit > 1000)? "1TB":maxStorageLimit+"GB");
	/*instead of using the method getStorage(), use ((maxStorageLimit == 1024)? "TB":"GB") */
	}
	
}
