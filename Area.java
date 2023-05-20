package program;
import java.util.*;


//Write a program in java to calculate area of square, area of rectangle , area of cirle using contructor ?
class CalculateArea
{
	int area;
	double ar;
	CalculateArea(){
		System.out.println("Default Constructor");
	}
	CalculateArea(int s){
		area = s*s;
		System.out.println("Area of Square is : " + area);
	}
	CalculateArea(int l, int b){
		area = l*b;
		System.out.println("Area of Rectangle is : " + area );
	}
	CalculateArea(double r){
		ar=3.14*r*r;
		System.out.println("Area of circle is : " + ar);
	}
	CalculateArea(CalculateArea ca){
		System.out.println("Copy Constructor ");
	}
	
}

//here we are making second class for call object 
//class CalculateArea2{
//	CalculateArea2(CalculateArea ca){
//		System.out.println("Copy Constructor ");
//	}
//}

public class Area {

	public static void main(String[] args) {
		int side,len,bre;
		double rad;
		Scanner s = new Scanner(System.in);
		CalculateArea obj = new CalculateArea();
		System.out.println("Enter Side of square :");
		side=s.nextInt();
		CalculateArea obj2 = new CalculateArea(side);
		System.out.println("Enter length and Breadth of rectangle");
		len = s.nextInt();
		bre = s.nextInt();
		CalculateArea obj3 = new CalculateArea(len,bre);
		System.out.println("Enter Radius of circle");
		rad=s.nextDouble();
		CalculateArea obj4 = new CalculateArea(rad);
		CalculateArea obj5 = new CalculateArea(obj);

	}

}