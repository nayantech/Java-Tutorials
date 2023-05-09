package program;
import java.util.*;

//Swapping two number
public class Swapping {

	public static void main(String[] args) {
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swapping values are " + a + " and " +b );
//		t=a;
//		a=b;
//		b=t;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping values are " + a + " and " + b);
		
		
	
	}

}