package Shape;

public class MainShape {
	public static void main (String[] args){
		//Test untuk class Circle
		Circle c = new Circle();
		System.out.println("Circle :\n"
				+ "radius= " + c.getRadius()
				+ " perimeter= " + c.getPerimeter()
				+ " area= " + c.getArea()
				+ "\nnote= " +c.toString());
		
		//Test untuk class Rectangle
		Rectangle r = new Rectangle();
		System.out.println("\nRectangle :\n"
				+ "length= " + r.getLength()
				+ " width= " + r.getWidth()
				+ " perimeter= " + r.getPerimeter()
				+ " area= " + r.getArea()
				+ "\nnote= " + r.toString());
		
		//Test untuk class Square
		Square s = new Square();
		System.out.println("\nSquare :\n"
				+ "side= " + s.getSide()
				+ " perimeter= " + s.getPerimeter()
				+ " area= " + s.getArea()
				+ "\nnote= " + s.toString());
		
	}
}
