package sheet13OwnerWithPetArray;

public enum MicroChipped {
	
	IS_MICRO_CHIPPED(true),
	IS_NOT_MICRO_CHIPPED(false);
	
	private boolean chipped;
	
	MicroChipped(boolean microChipped){
		this.chipped = microChipped;
	}
	public boolean getMicroChipped(){
		return this.chipped;
	}
}
