package sheet5Classes;

public class TestPersonalComputer {
	
	public static void main(String[] args) {
		System.out.println("\n\tPersonal computer: no-args constructor\n\tPersonalComputer pc = new PersonalComputer();");
		PersonalComputer pc = new PersonalComputer();
		System.out.println(pc);
		System.out.println("\n\tPersonal computer: constant parameter\n\tPersonalComputer pc1 = new PersonalComputer(PersonalComputer.RAM_16_GB);");
		PersonalComputer pc1 = new PersonalComputer(PersonalComputer.RAM_16_GB);
		System.out.println(pc1);
		System.out.println("\n\tPersonal computer: enum parameter\n\tPersonalComputer pc2 = new PersonalComputer(PcConfigs.PC_1);");
		PersonalComputer pc2 = new PersonalComputer(PcConfigs.PC_1);
		System.out.println(pc2);
		
		PersonalComputer pc3 = new PersonalComputer(PcConfigs.PC_3);
		System.out.println(pc3);
		
		PersonalComputer pc4 = new PersonalComputer(PcConfigs.PC_10);
		System.out.println(pc4);
		System.out.println("\n\tPersonal computer: four constant parameters\n\tPersonalComputer pc5 = new PersonalComputer(PersonalComputer.RAM_4_GB, PersonalComputer.HardDrive_512_GB, PersonalComputer.OS_Microsoft,PersonalComputer.MonitorSize_12)");
		PersonalComputer pc5 = new PersonalComputer(PersonalComputer.RAM_4_GB, PersonalComputer.HardDrive_512_GB, PersonalComputer.OS_Microsoft,PersonalComputer.MonitorSize_12);
		pc5.getCost();
		System.out.println(pc5);
		
		PersonalComputer pc6 = new PersonalComputer(PersonalComputer.RAM_8_GB, PersonalComputer.HardDrive_256_GB, PersonalComputer.OS_Ubuntu,PersonalComputer.MonitorSize_12);
		pc6.getCost();
		System.out.println(pc6);
		
		PersonalComputer pc7 = new PersonalComputer(PersonalComputer.RAM_16_GB, PersonalComputer.HardDrive_512_GB, PersonalComputer.OS_Mac,PersonalComputer.MonitorSize_26);
		pc7.getCost();
		System.out.println(pc7);
		System.out.println("\n\tPersonal computer: four parmeters\n\tPersonalComputer pc8 = new PersonalComputer(32, 1024,PersonalComputer.OS_Ubuntu,30);");
		PersonalComputer pc8 = new PersonalComputer(32, 1024,PersonalComputer.OS_Ubuntu,30);
		int ram = pc8.getRam();
		int hardDrive = pc8.getHardDrive();
		int monitorSize = pc8.getMonitorSize();
		pc8.getCostOne();
		pc8.calculateCost(ram, hardDrive, monitorSize);
	}
}
