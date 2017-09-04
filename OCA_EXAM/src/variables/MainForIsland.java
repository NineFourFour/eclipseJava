package variables;

public class MainForIsland {
	
	
	
	public static void main(String[] args) {
		Island i2 = new Island();
		Island i3 = new Island();
		Island i4 = new Island();
		System.out.println("i2.toString: "+i2.toString());
		i2.i = i3;
		i3.i = i4;
		i4.i = i2;
		i2 = null;
		i3 =null;
		i4 = null;
		//System.out.println("After i2 is set to null, i2: "+i2);
		System.out.println("i2.i "+i2.i.toString());
		
	}
}
class Island{
	Island i;
	
	public String toString(){
		return "Island i: "+ i;
	}
}