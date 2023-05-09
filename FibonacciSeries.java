package program;
import java.util.*;

//Write a program in java to display nth fibonacci series?
public class FibonacciSeries {

	public static void main(String[] args) {
		int n,i,a=0,b=1,c=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("How many Fibonacci series Enter Number");
		n=obj.nextInt();
		for(i=1;i<n;i++) {
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
