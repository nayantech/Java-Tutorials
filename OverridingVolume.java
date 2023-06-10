package program;
import java.util.*;

//To perform override with constructor?

class Shapes{
	public void calculate() {
		System.out.println("Base class Calculate method");
	}
}
class Cubee extends Shapes
{
	int side,vol;
	Cubee(int s)
	{
		side=s;
	}
	public void calculate() {
		vol=side*side*side;
		System.out.println("Volume of cube is "+vol);
	}
}
class Cylinderr extends Shapes
{
	int height;
	double radius,vol;
	Cylinderr(double r, int h)
	{
		radius=r;
		height=h;
	}
	public void calculate() {
		vol=3.14*radius*radius*height;
		System.out.println("Volume of cylinder is "+vol);
	}
}

class Conee extends Shapes{
	double radius,vol;
	int height;
	Conee(double r,int h)
	{
		radius=r;
		height=h;
	}
	public void calculate()
	{
		vol=0.333*3.14*radius*radius*height;
		System.out.println("Volume of cone is "+vol);
	}
	
}

class Spheree extends Shapes{
	double radius,vol;
	Spheree(double r)
	{
		radius=r;
	}
	public void calculate()
	{
		vol=1.333*3.14*radius*radius*radius;
		System.out.println("Volume of sphere is"+vol);
	}
}
class Cuboid extends Shapes{
	int length,width,height,vol;
	Cuboid(int l,int w, int h)
	{
		length=l;
		width=w;
		height=h;
	}
	public void calculate()
	{
		vol=length*width*height;
		System.out.println("Volume of cuboid is"+vol);
	}
}

public class OverridingVolume {

	public static void main(String[] args) {
		//Variable Declaration
		//Scanner Class
		//Accept input from user
		Cubee c = new Cubee(3);
		c.calculate();
		Cylinderr cy = new Cylinderr(2.5,10);
		cy.calculate();
		Conee ce=new Conee(3.5,75);
		ce.calculate();
		Spheree s = new Spheree(5.5);
		s.calculate();
		Cuboid cd=new Cuboid(2,3,4);
		cd.calculate();
	}

}