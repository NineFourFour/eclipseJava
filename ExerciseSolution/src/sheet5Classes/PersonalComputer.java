package sheet5Classes;

public class PersonalComputer {
	
	private static int number;
	private int ram;
	private int hardDrive;
	private String OS;
	private int monitorSize;
	private double cost;
	private int pcNumber;
	private PcConfigs pcConfig;
	
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;

	public static final int HardDrive_128_GB = 128;
	public static final int HardDrive_256_GB = 256;
	public static final int HardDrive_512_GB = 512;
	
	public static final int MonitorSize_12 = 12;
	public static final int MonitorSize_21 = 21;
	public static final int MonitorSize_26 = 26;
	
	public static final String OS_Microsoft = "Windows 10";
	public static final String OS_Mac = "4.7 Mac OS X 10.5 Leopard";
	public static final String OS_Ubuntu = "Ubuntu 16.04.2 LTS";
	
	/*	POSSIBLE EXAM QUESTION
	 * 
	 * static initialization block, can be use to initialize the variables
	 *  static variables belong to the class not the object, they exist before the member variables
	 *  
	 *  A class is the template for an object so must exist before the object is created
	 *  
	 *  A final variable must be initialized, i.e. it must be given a value on the same line or in
	 *  a static block.
	 *  it can't be given a value in a constructor. 
	 *  
	 *  A static block will execute before anything else in the class.  
	 *  static{
	 *  	OS_Microsoft = "Windows 10";
	 *		OS_Mac = "4.7 Mac OS X 10.5 Leopard";
	 *		OS_Ubuntu = "Ubuntu 16.04.2 LTS";
	 *  }
	 *  
	 */
	/*is this the default constructor or a zero parameter constructor, with default values*/
	public PersonalComputer(){
		this.pcNumber = number++;
		this.ram = RAM_4_GB;
		this.hardDrive = HardDrive_128_GB;
		this.OS = OS_Microsoft;
		this.monitorSize = MonitorSize_12;
		this.cost = 500;
	}
	public PersonalComputer(PcConfigs pcConFig){
		this();
		this.ram = pcConFig.getRam();
		this.hardDrive = pcConFig.getHardDrive();
		this.OS = pcConFig.getOS();
		this.monitorSize = pcConFig.getMonitorSize();
		this.cost = pcConFig.getCost();
	}
	/*Constructor with a single parmeter, including the zero constructor this(), which has to 
	come first statement or it will get the following compile error:
			PersonalComputer.java:35: error: call to this must be first statement in constructor
						this();*/
	public PersonalComputer(int ram){
		this();
		this.ram = ram;
	}
	public PersonalComputer(int ram, int hardDrive, String OS, int monitorSize){
		/*update the pc number every time the class is instantiated. this.number=number++ doesn't work, 
		probably because it's static? Change it to non-static variable, still will not increment. Use
		another variable this.no = number++???
		*/
		this();
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.OS = OS;
		this.monitorSize = monitorSize;
	}
	
	public void setPcConfig(PcConfigs pcConfig){
		this.pcConfig = pcConfig;
	}
	public PcConfigs getPcConfig(){
		return this.pcConfig;
	}
	public void setRam(int ram){
		this.ram = ram;
	}
	public void setHardDrive(int hardDrive){
		this.hardDrive = hardDrive;
	}
	public void setOS(String os){
		this.OS = os;
	}
	public void setMonitorSize(int monitorSize){
		this.monitorSize = monitorSize;
	}
	public void setCost(double cost){
		this.cost = cost;
	}
	public double getCost(){
		return this.cost;
	}
	public int getRam(){
		return this.ram;
	}
	public int getHardDrive(){
		return this.hardDrive;
	}
	public String getOS(){
		return this.OS;
	}
	public int getMonitorSize(){
		return this.monitorSize;
	}
	/**/
	public void getCostOne(){
		double calCost = this.ram*this.hardDrive*this.monitorSize / 140;
		switch(this.OS){
			case "Windows 10": calCost = calCost/2;
								//System.out.printf("\nSwitch calCost : %.2f\n",calCost);
				break;
			case "4.7 Mac OS X 10.5 Leopard": calCost += 500;
										//	System.out.printf("\nSwitch calCost : %.2f\n",calCost);
				break;
			case "Ubuntu 16.04.2 LTS": calCost = calCost/4;
										//System.out.printf("\nSwitch calCost : %.2f\n",calCost);
				break;
			default:
				calCost += 100;
				break;
		}
		cost = calCost;
		System.out.printf("\n\t\tCost of PC%d with Ram: %dGB, Hard Drive: %dGB, OS: %s, Monitor Size: %dinch is %.2f \n\n",this.pcNumber, this.ram, this.hardDrive, this.OS, this.monitorSize, calCost);
	}
	public void calculateCost(int ram, int hardDrive, int monitorSize){
		double cost = ram*hardDrive*monitorSize / 140;
		switch(this.OS){
			case "Windows 10": cost = cost/2;
								//System.out.printf("\nSwitch calCost : %.2f\n",calCost);
				break;
			case "4.7 Mac OS X 10.5 Leopard": cost += 500;
										//	System.out.printf("\nSwitch calCost : %.2f\n",calCost);
				break;
			case "Ubuntu 16.04.2 LTS": cost = cost/4;
										//System.out.printf("\nSwitch calCost : %.2f\n",calCost);
				break;
			default:
				cost += 100;
				break;
		}
		System.out.printf("\n\t\tCost of PC with Ram %dGB, Hard Drive %dGB, %s, Monitor Size %dinch is %.2f \n\n",ram, hardDrive,this.OS, monitorSize, cost);
	}
	public String toString(){
		return String.format("\n\t\tPC No: %d\n\t\tRam: %s\n\t\tHard Drive: %s\n\t\tOS: %s\n\t\tMonitor Size: %s\n\t\tCost: €%.2f",this.pcNumber,this.ram,this.hardDrive,this.OS, this.monitorSize, this.cost);
	}
}
