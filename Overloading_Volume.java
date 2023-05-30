package program;
import java.util.*;

//To Perform Method Overloading to find Volume of Cube,Cylinder,Spehere,Rectangular Box

class VolumeDemo{
	int a;
	double ar;
	
	public void calc(int s){
		a=s*s*s;
		System.out.println("Volume of Cube is " +a );
	}
	public void calc(double r, int h) {
		ar=3.14*r*r*h;
		System.out.println("Volume of Cylinder is " +ar);
	}
	public void calc(double r) {
		ar=1.333*3.14*r*r*r;
		System.out.println("Volume of Sphere is " +ar);
	}
	public void calc(int l, int b, int h) {
		a=l*b*h;
		System.out.println("Volume of Rectangular Box is " +a);
	}
	
}

public class Overloading_Volume {

	public static void main(String[] args) {
		int side,height,len,bre;
		double radius;
		VolumeDemo c = new VolumeDemo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Side of Cube is : ");
		side=sc.nextInt();
		c.calc(side);
		
		
		System.out.println("Enter Radius and Height for Cylinder is :");
		radius=sc.nextDouble();
		height=sc.nextInt();
		c.calc(radius,height);
		
		System.out.println("Enter radius of sphere is : ");
		radius=sc.nextDouble();
		c.calc(radius);
		
		System.out.println("Enter Length and Breadth and Height for Rectangular Box is : ");
		len=sc.nextInt();
		bre=sc.nextInt();
		height=sc.nextInt();
		c.calc(len,bre,height);
	}

}