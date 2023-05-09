package program;
import java.util.*;


//Write a program in java to calculate sum of series on n numbers?
public class SumOfSeries {

	public static void main(String[] args) {
		int i,n,sum=0;   //where ever you declare sum,total first declare sum=0,total=0
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter limit of series");
		n=obj.nextInt();
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of series of " + n + " Number of sum is  " + sum);
		
	}

}
