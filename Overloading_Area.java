package program;
import java.util.*;

// to perform Method Overloading and find Area of Square,Circle,Rectangle,Triangle

class ShapeDemo{
	int ar;
	double a;
	
	public void area(int s) {
		ar=s*s;
		System.out.println("Area of Square Is : " + ar);
		
	}
	
	public void area(double r) {
		a=3.14*r*r;
		System.out.println("Area of Circle is : " + a);
	}
	
	public void area(int l , int b) {
		ar=l*b;
		System.out.println("Area of rectangle is : " + ar);
	}
	
	public void area(double b , int h) {
		a=0.5*b*h;
		System.out.println("Area of Triangle is : " + a);
	}
}

public class Overloading_Area {

	public static void main(String[] args) {
		
		int side,len,bre,hei;
		double rad,base;
		ShapeDemo s = new ShapeDemo();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Side of Square");
		side=obj.nextInt();
		s.area(side);
		System.out.println("Enter Radius of Circle ");
		rad=obj.nextDouble();
		s.area(rad);
		System.out.println("Enter Length and Breadth of rectangle : ");
		len=obj.nextInt();
		bre=obj.nextInt();
		s.area(len,bre);
		System.out.println("Enter Base and Height of Triangle : ");
		base=obj.nextDouble();
		hei=obj.nextInt();
		s.area(base,hei);
	}

}