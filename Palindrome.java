package program;
import java.util.*;

//write a program in java to check whether number is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		int n,num,t,rev=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any number ");
		n=obj.nextInt();
		num=n;
		while(n!=0) {
			t=n%10;
			rev=(rev*10) + t;
			n=n/10;
		}
		if(num == rev) {
			System.out.println(num + " is Palindrome number ");
		}
		else {
			System.out.println(num + " it is not an palindrome");
		}

	}

}