package program;
import java.util.*;

//Write a program in java to display reverse of a number
public class Reverse {

	public static void main(String[] args) {
		int n,t;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any number");
		n=s.nextInt();
		System.out.println("Reverse of " + n + " is :)");
		while(n!=0) {
			t=n%10;
			System.out.print(t);
			n=n/10;
		}

	}

}