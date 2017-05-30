package sheet10IneritanceShape;

import sheet10IneritanceShape.Shape.Color;
/*
 * extends means IS-A
 * 
 * Polymorphism - many forms of a shape
 * 
 * Shape[] shapes = {circle, triangle, rectangle};
 * The shape array can contain any object that passes the IS-A test, all object must extend Shape.
 * 
 * Polymorphism means many forms, the shape array contains many different types of shapes. Parent data type 
 * with child objects.
 * 
 * 
 * */
public class TestShape {
	
	public static void main(String[] args) {
		
		
		Rectangle r1 = new Rectangle(Color.BLUE, 10, 5);
		System.out.println(r1);
		Circle c1 = new Circle(Color.GREEN, 10);
		System.out.println(c1);
		Triangle t1 = new Triangle(Color.RED);
		System.out.println(t1);
		
		Shape[] shapeArray = {r1,c1,t1};
		for(Shape s: shapeArray)
			System.out.println("For Loop s:"+s);
		
		for(int i=0; i< shapeArray.length; i++){
			
			if(shapeArray[i] instanceof Rectangle)
				System.out.println("\nArea of rectangle: "+((Rectangle)shapeArray[i]).getArea());
			if(shapeArray[i] instanceof Triangle)
				System.out.println((Triangle)shapeArray[i]);
			if(shapeArray[i] instanceof Circle)
				System.out.println("\nRadius of Circle: "+ ((Circle)shapeArray[i]).getRadius());
		}
		
	}
}
