
interface Jumpable{
	void jump();
}

class Mammal1{
	void eat(){
		
	}
}
class Dog1 extends Mammal1 implements Jumpable{
	public void jump(){
		System.out.println("Dog is jumping");
	}
}
class Cat1 extends Mammal1 implements Jumpable{
	public void jump(){
		
	}
}
class Whale extends Mammal1 {
	
}

public class Casting {

	public static void main(String[] args) {
		
		Mammal1 w1 = new Whale();
		//((Jumpable).w1).
		((Whale)w1).eat();
		Mammal1 d = new Dog1();
		((Dog1)d).jump();
	}
	
}
