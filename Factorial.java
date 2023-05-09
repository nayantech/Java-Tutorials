package program;
import java.util.*;

// Write a program in java to calculate factorial of a number?
public class Factorial {

	public static void main(String[] args) {
		int n,i,fact=1; //if you multiplyaing any number first store in variable=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any Number");
		n=obj.nextInt();
		for(i=1;i<=n;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is " + n + " is " +fact);

	}

}
