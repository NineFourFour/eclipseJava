package sheet5Classes;

public enum MaxStorage {
	
	STORAGE_100GB(100),
	STORAGE_500GB(500),
	STORAGE_1TB(1024);
	
	int maxStorage;
	private MaxStorage(int maxStorage) {
		this.maxStorage = maxStorage;
	}
	
	public int getMaxStorage(){
		return this.maxStorage;
	}
	
}
