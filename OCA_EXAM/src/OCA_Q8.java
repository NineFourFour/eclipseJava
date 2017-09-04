
	class x {
	
	    x() { }

	    protected void one() { }
	}

	public class  OCA_Q8 extends  x {
		 OCA_Q8() { }

	    private void two() { one(); }

	    public static void main(String[] args) {
	        new  OCA_Q8().two();
	    }
	}


