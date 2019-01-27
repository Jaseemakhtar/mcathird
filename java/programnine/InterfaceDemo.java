/**
 *
 * @author jaseem
 */

public class InterfaceDemo{
	public static void main(String[] args){
		Square s = new Square(10.0);
		Rectangle r = new Rectangle(9.0, 4.0);
		System.out.println("Area of square: " + s.calculateArea());
		System.out.println("Area of rectangle: " + r.calculateArea());
	}
}

interface Shape{
	double calculateArea();
}

class Square implements Shape{
	double side;

	public Square(double s){
		side = s;
	}

	public double calculateArea(){
		return side * side;
	}
}

class Rectangle implements Shape{
	double length, breadth;

	public Rectangle(double l, double b){
		length = l;
		breadth = b;
	}
	public double calculateArea(){
		return length * breadth;
	}
}