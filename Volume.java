package program;
import java.util.*;

//Write a program in java to calculate Volume of cube, Volume of Cylinder , Volume of Sphere and Volume of Reactangular Box ?
class CalculateVolume{
	
	int cube;
	double volume;
	double pi=3.14,sp=1.33;
	
	
	CalculateVolume(int s){
		cube = s * s * s;
		System.out.println("Volume of cube is : " + cube);
	}
	CalculateVolume(double radius , double height){
		volume = pi * radius * radius * height;
		System.out.println("Volume of Cylinder is : " + volume);
		
	}
	CalculateVolume(double radius){
		volume = sp * pi * radius * radius * radius ;
		System.out.println("Volume of Sphere is : " + volume);
	}
	CalculateVolume(double length ,double width , double height){
		volume = length * width * height;
		System.out.println("Volume of Rectangular Box is :" + volume);
	}
	public void finalize()  //Garbage Collection or destruction of objects
	{
		System.out.println("Objects are Destroyed in reverse order of creation ");
	}
}


public class Volume {

	public static void main(String[] args) {
		int side;
		double r,h,w,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square :");
		side = sc.nextInt();
		CalculateVolume obj = new CalculateVolume(side);
		
		System.out.println("Enter radius and height : ");
		r=sc.nextDouble();
		h=sc.nextDouble();
		CalculateVolume obj2 = new CalculateVolume(r,h);
		
		System.out.println("Enter radius");
		r=sc.nextDouble();
		CalculateVolume obj3 = new CalculateVolume(r);
		
		System.out.println("Enter Length , Width , Height");
		l=sc.nextDouble();
		w=sc.nextDouble();
		h=sc.nextDouble();
		CalculateVolume obj4  = new CalculateVolume(l,w,h );
		
		
		System.gc();   // to call finalize() method

	}

}