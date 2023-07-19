package program;
import java.util.*;

//Write a program in java to check whether number is prime number or not
public class PrimeNumber {

	public static void main(String[] args) {
		int n,b=2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=obj.nextInt();
		while(n%b!=0) {
			b++;
		}
		if(n==b) {
			System.out.println(n + " Is a prime Number");
		}
		else {
			System.out.println(n + " Is not a prime Number");
		} 
		
//		if(n%b==0) {
//		System.out.println(n+" Number is Even ");
//		}
//		else {
//			System.out.println(n+" Number is Prime ");
//		}

	}

}