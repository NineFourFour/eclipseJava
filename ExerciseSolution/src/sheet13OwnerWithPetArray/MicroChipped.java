package sheet13OwnerWithPetArray;

public enum MicroChipped {
	
	IS_MICRO_CHIPPED(true),
	IS_NOT_MICRO_CHIPPED(false);
	
	boolean chipped;
	
	MicroChipped(boolean microChipped){
		this.chipped = microChipped;
	}
	public void setMicroChipped(boolean microChipped){
		this.chipped = microChipped;
	}
	public boolean getMicroChipped(){
		return this.chipped;
	}
}
