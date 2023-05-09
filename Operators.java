package program;
import java.util.*;

//Operators perform
public class Operators {

	public static void main(String[] args) {
		int n1,n2,add,sub,mul,div;
		double mod;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("First Number is " + n1);
		System.out.println("Second Number is " + n2);
		add=0;
		mul=1;
		add=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		div=n1/n2;
		mod=n1%n2;
		System.out.println("addition is " + add);
		System.out.println("subtraction is " + sub);
		System.out.println("multiplication is " + mul);
		System.out.println("division is " + div);
		System.out.println("moduls is " + mod);
		
		System.out.println("Addition is " + ( n1 + n2));
		

	}

}