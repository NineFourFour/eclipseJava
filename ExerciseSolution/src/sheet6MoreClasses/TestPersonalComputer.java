package sheet6MoreClasses;



public class TestPersonalComputer {
	public static void main(String[] args) {
		
		PersonalComputer pc = new PersonalComputer();
		PersonalComputer pc1 = new PersonalComputer(PersonalComputer.RAM_16_GB);
		pc1.getCostOne();
		PersonalComputer pc2 = new PersonalComputer(PcConfigs.PC_1);
		pc2.getCostOne();
		PersonalComputer pc3 = new PersonalComputer(PcConfigs.PC_3);
		PersonalComputer pc4 = new PersonalComputer(PcConfigs.PC_10);
		PersonalComputer pc5 = new PersonalComputer(PersonalComputer.RAM_4_GB, PersonalComputer.HardDrive_512_GB, PersonalComputer.OS_Microsoft,PersonalComputer.MonitorSize_12);
		pc5.getCostOne();
		pc5.getCost();
		//System.out.println(pc5);
		
		PersonalComputer pc6 = new PersonalComputer(PersonalComputer.RAM_8_GB, PersonalComputer.HardDrive_256_GB, PersonalComputer.OS_Ubuntu,PersonalComputer.MonitorSize_12);
		pc6.getCostOne();
		pc6.getCost();
		//System.out.println(pc6);
		
		PersonalComputer pc7 = new PersonalComputer(PersonalComputer.RAM_16_GB, PersonalComputer.HardDrive_512_GB, PersonalComputer.OS_Mac,PersonalComputer.MonitorSize_26);
		pc7.getCostOne();
		pc7.getCost();
		//System.out.println(pc7);
	
		PersonalComputer pc8 = new PersonalComputer(32, 1024,PersonalComputer.OS_Ubuntu,30);
		int ram = pc8.getRam();
		int hardDrive = pc8.getHardDrive();
		int monitorSize = pc8.getMonitorSize();
		pc8.calculateCost(ram, hardDrive, monitorSize);
		/*System.out.println(pc8.getCost());
		System.out.println(pc7.getCost());
		System.out.println(pc6.getCost());
		System.out.println(pc5.getCost());
		System.out.println(pc4.getCost());*/
		PersonalComputer[] pcArray = {pc, pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8};
		
		System.out.println("\n\n\tNumber of items in PcArray = "+pcArray.length);
		
		printPCArray(pcArray);
		
	}
	public static void printPCArray(PersonalComputer[] pcArray){
		
		for(PersonalComputer pc:pcArray){
			
			if(pc.getCost()>400)
				System.out.println(pc);
			
		}
	}
	
}
