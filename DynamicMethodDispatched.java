package program;
import java.util.*;

//To perform Dynamic Method Dispatched?

class Mathss
{
	public void area()
	{
		System.out.println("Base Class maths area method");
	}
}
class Squaree extends Mathss
{
	public void area() {
		System.out.println("Derived class square area method");
	}
}
class Rectanglee extends Mathss
{
	public void area()
	{
		System.out.println("Derived class Rectangle area method");
	}
}
class Circlee extends Mathss{
	public void area() {
		System.out.println("Derived class Circle area Method");
	}
}

class Trianglee extends Mathss{
	public void area() {
		System.out.println("Derived class Triangle area method");
	}
}

public class DynamicMethodDispatched {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathss ref;
		ref=new Mathss();
		ref.area();
		ref=new Squaree();
		ref.area();
		ref=new Rectanglee();
		ref.area();
		ref=new Circlee();
		ref.area();
		ref=new Trianglee();
		ref.area();
	}

}