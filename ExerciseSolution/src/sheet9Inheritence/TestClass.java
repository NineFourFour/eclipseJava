package sheet9Inheritence;

public class TestClass {
	public static void main(String[] args) {
		
		System.out.printf("\n\tInheritence: Furniture, parent class; Bed, Chair, Table are the subclasses\n\n\n");
		/*Furniture parent class*/
		Furniture one = new Furniture();
		System.out.printf("\n\tFurniture one : %s\n", one);
		
		
		
		
		/*Table subclass*/
		Table myTable = new Table();
		System.out.printf("\n\tNew table myTable.toString() : %s",myTable);
		System.out.printf("\n\tmyTable.setColor(red) : ");
		myTable.setColour("red");
		System.out.printf("\n\tmyTable.getColor(): %s",myTable.getColour());
		System.out.printf("\n\tmyTable.setMaterialType(\"wood\") :");
		myTable.setMaterialType("wood");
		System.out.printf("\n\tmyTable.getMaterialType() : %s",myTable.getMaterialType());
		System.out.printf("\n\tmyTable.setExpandable: ");
		myTable.setExpanable(true);
		System.out.printf("\n\tmyTable.isExpandable(): %s",myTable.isExpandable());
		System.out.printf("\n\tmyTable.setShape(\"round\") :");
		myTable.setShape("round");
		System.out.printf("\n\tmyTable.getShape() : %s",myTable.getShape());
		System.out.printf("\n\n\tmyTable.toString():%s\n\n",myTable);
		
		
		
		
		/*Chair subclass*/
		Chair officeChair = new Chair();
		System.out.printf("\n\tNew Chair officeChair.toString() : %s",officeChair.toString());
		System.out.printf("\n\tofficeChair.setColor(\"black\") : ");
		officeChair.setColour("black");
		System.out.printf("\n\tofficeChair.getColor(): %s",officeChair.getColour());
		System.out.printf("\n\tofficeChair.setMaterialType(\"steel\") :");
		officeChair.setMaterialType("Steel");
		System.out.printf("\n\tofficeChair.getMaterialType() : %s",officeChair.getMaterialType());
		System.out.printf("\n\tofficeChair.setHasGasLift(true): ");
		officeChair.setHasGasLift(true);
		System.out.printf("\n\tofficeChair.hasGasLift(): %s",officeChair.hasGasLift());
		System.out.printf("\n\tofficeChair.setType(\"office\") :");
		officeChair.setType("office");
		System.out.printf("\n\tofficeChair.getType() : %s",officeChair.getType());
		System.out.printf("\n\n\tofficeChair.toString(): %s\n\n",officeChair);
		
		
		
		/*Bed SubClass*/
		Bed myBed = new Bed();
		System.out.printf("\n\tNew Bed myBed.toString() : %s", myBed.toString());
		System.out.printf("\n\n\tmyBed.setColor(\"White\")");
		myBed.setColour("White");
		System.out.printf("\n\tmyBed.getColor(): %s",myBed.getColour());
		System.out.printf("\n\tmyBed.setMaterialType(\"steel\")");
		myBed.setMaterialType("Steel");
		System.out.printf("\n\tmyBed.getMaterialType() : %s",myBed.getMaterialType());
		System.out.printf("\n\tmyBed.setHasHeadboard(true)");
		myBed.setHasHeadboard(true);;
		System.out.printf("\n\tmyBed.hasHeadboard(): %s",myBed.hasHeadboard());
		System.out.printf("\n\tmyBed.setSize(\"14 ft X 7 ft\")");
		myBed.setSize("14 ft X 7 ft");
		System.out.printf("\n\tmyBed.getSize() : %s",myBed.getSize());
		System.out.printf("\n\n\tmyBed.toString(): %s",myBed);
		
		
		
	}
}
