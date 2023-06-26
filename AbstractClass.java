package program;
import java.util.*;

//TO perform abstract Class?

abstract class  Shapess{
	abstract public void area();
	
	public void shape1() {
		System.out.println("Abstract class Shapes Method");
	}
}

class Squares extends Shapess{
	int side,a;
	Squares(int s){
		side=s;
	}
	public void area() {
		super.shape1();
		a=side*side;
		System.out.println("Area of Square is "+a);
	}
}

class Rectangl1 extends Shapess{
	int length,breadth,a;
	Rectangl1(int l,int b){
		length=l;
		breadth=b;
	}
	public void area() {
		a=length*breadth;
		System.out.println("Area of Rectangle is "+a);
	}
}

class Circle1 extends Shapess{
	double radius,a;
	Circle1(double r){
		radius=r;
	}
	public void area() {
		a=3.14*radius*radius;
		System.out.println("Area of Circle is "+a);
	}
}

class Triangle1 extends Shapess{
	double base,height,a;
	Triangle1(double b,double h ){
		base=b;
		height=h;
	}
	public void area() {
		a=0.5*base*height;
		System.out.println("Area of Triangle is"+a);
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		
		//by giving value
//		Shapess ref;
//		ref=new Squares(3);
//		ref.area();
//		ref=new Rectangl1(2,8);
//		ref.area();
//		ref=new Circle1(3.5);
//		ref.area();
//		ref=new Triangle1(3,8);
//		ref.area();
		
		//by taking user input
		int s,l,b;
		double r,b1,h;
		Scanner sc = new Scanner(System.in);
		Shapess ref;
		System.out.println("Enter Side of Square is ");
		s=sc.nextInt();
		ref=new Squares(s);
		ref.area();
		
		System.out.println("Enter Length and breadth of Rectangle is ");
		l=sc.nextInt();
		b=sc.nextInt();
		ref=new Rectangl1(l,b);
		ref.area();
		
		System.out.println("Enter Radius of Circle is ");
		r=sc.nextDouble();
	
		ref=new Circle1(r);
		ref.area();
		
		System.out.println("Enter Base and Height of Triangle is ");
		b1=sc.nextDouble();
		h=sc.nextDouble();
		ref=new Triangle1(b1,h);
		ref.area();
	}

}