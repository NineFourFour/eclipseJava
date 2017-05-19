package sheet11InheritancePayroll;

public class PieceWorker extends Employee {

	double wagePerPiece;
	int quantity;
	
	public PieceWorker(){
		super();
	}
	public PieceWorker(String firstName, String lastName, double wagePerPiece, int quantity){
		super(firstName, lastName);
		this.wagePerPiece = wagePerPiece;
		this.quantity = quantity;
	}
	public void setWagePerPiece(double wagePerPiece){
		this.wagePerPiece = wagePerPiece;
	}
	public double getWagePerPiece(){
		return this.wagePerPiece;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public double getEarnings(){
		return getWagePerPiece()*getQuantity();
	}
	public String toString(){
		return "Piece Worker\nName: "+getFirstName()+" "+getLastName()+"\nEarnings: "+getEarnings();
	}
}
