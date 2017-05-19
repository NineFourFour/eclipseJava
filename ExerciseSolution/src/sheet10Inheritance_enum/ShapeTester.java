package sheet10Inheritance_enum;



public class ShapeTester {
	public static void main(String[] args) {
		/*Shape[] shapeElements = new Shape[4];
		
		shapeElements[0] = new Shape();
		shapeElements[1] = new Rectangle();
		shapeElements[2] = new Circle();
		shapeElements[3] = new Triangle();
		System.out.println("\n\tshapeElements Array");
		for(int i=0; i<shapeElements.length; i++){
			System.out.printf("\n\tColor of shape is: %s", shapeElements[i].getColor());
		}*/
		/*declare a new object of type shape*/
		Shape shape =new Shape();
		shape.code = Shape.Color.BLACK;
		shape.setColor(shape.code);
		
		Shape shape1 = new Shape();
		shape1.code = Shape.Color.BLUE;
		/*declare a new object of type rectangle which is a subclass of type shape 
		 *with the color blue
		 *height of 3.4 and width of 4.5*/
		Rectangle rectangleOne = new Rectangle(shape.code, 3.4, 4.5);
		rectangleOne.setColor(shape1.code);
		
		Shape shape2 = new Shape();
		shape2.code = Shape.Color.GREEN;
		/*new circle objec color green and 0 radius*/
		Circle circleOne = new Circle(shape2.code, 0);
		/*set the radius to 20*/
		circleOne.setRadius(20);
		/*object of type triangle*/
		Triangle triangleOne = new Triangle(shape.code);
		
		Shape[] shapeArrayOne = {shape, rectangleOne, circleOne, triangleOne};
		System.out.println("\n\tshapeArrayOne");
		/*
		 * loop through the array and find the instance of each type
		 * */
		for(int i=0; i<shapeArrayOne.length; i++){
			
			if(shapeArrayOne[i] instanceof Circle){
				System.out.printf("\n\tCircle\n");
				/*if a Circle then, cast shape object to circle object
				 * and print out the radius and color*/
				Circle CircleOne = (Circle)shapeArrayOne[i];
				System.out.printf("\n\tRadius of the circle is %d", CircleOne.getRadius());
				System.out.printf("\n\tColor of the Circle is: %s\n", CircleOne.getColor());
			}
			if(shapeArrayOne[i] instanceof Rectangle){
				System.out.printf("\n\tRectangle\n");
				/*cast shape to rectangle
				 * print out the area and color*/
				Rectangle RectangleOne = (Rectangle)shapeArrayOne[i];
				System.out.printf("\n\tArea of the rectangle is %.2f", RectangleOne.getArea());
				System.out.printf("\n\tColor of the rectangle is %s\n", RectangleOne.getColor());
			}
			if(shapeArrayOne[i] instanceof Triangle){
				System.out.printf("\n\tTriAngle\n");
				/*cast shape to triangle
				 * print out color*/
				Triangle TriangleOne = (Triangle)shapeArrayOne[i];
				System.out.printf("\n\tColor of the Triangle is %s\n", TriangleOne.getColor());
			}
		}
	}
}
