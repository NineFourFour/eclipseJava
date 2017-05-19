package sheet5Classes;

public enum PcConfigs {

	PC_1(4,128,12,"Windows 10",800.00),
	PC_2(4,128,12,"4.7 Mac OS X 10.5 Leopard",1100.0),
	PC_3(4,128,12,"Ubuntu 16.04.2 LTS", 600.0),
	PC_4(8,256,21,"Windows 10",1050.00),
	PC_5(8,256,21,"4.7 Mac OS X 10.5 Leopard",1300.0),
	PC_6(8,256,21,"Ubuntu 16.04.2 LTS", 7950),
	PC_7(16,512,26,"Windows 10",1400),
	PC_8(16,512,26,"4.7 Mac OS X 10.5 Leopard",1700.0),
	PC_9(16,512,26,"Ubuntu 16.04.2 LTS", 1200.0),
	PC_10(16,1024,12,"Windows 10", 1800);
	
	
	int ram;
	int hardDrive;
	int monitorSize;
	String OS;
	double cost;
	private PcConfigs(int ram, int hardDrive, int monitorSize, String OS, double cost) {
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.monitorSize = monitorSize;
		this.OS = OS;
		this.cost= cost;
	}
	public int getRam(){
		return this.ram;
	}
	public int getHardDrive(){
		return this.hardDrive;
	}
	public int getMonitorSize(){
		return this.monitorSize;
	}
	public String getOS(){
		return this.OS;
	}
	public double getCost(){
		return this.cost;
	}
}
