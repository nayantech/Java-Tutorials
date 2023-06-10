package program;
import java.util.*;

//To perfrom Construction With Inheritance?

class Maths{
	Maths()
	{
		System.out.println("Base Class Maths Constructor");
	}
}
class Square extends Maths
{
	Square()
	{
		System.out.println("Formula of Square Is side*side");
	}
}
class Rectangle extends Square
{
	Rectangle()
	{
		System.out.println("Formula of rectangle is length*breadth");
	}
}
class Circle extends Rectangle
{
	Circle()
	{
		System.out.println("Formula of circle is 3.14*radius*radius");
	}
}
class Triangle extends Circle
{
	Triangle()
	{
		System.out.println("Formula of Triangle is 0.5*base*height");
	}
}

public class ConstructionWithInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t=new Triangle();
	}

}