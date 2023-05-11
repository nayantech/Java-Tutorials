package program;
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		int i,n,sum=0;
		double avg;
		int a[] = new int[50];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter limit of array : ");
		n=obj.nextInt();
		System.out.println("Enter " + n + " Elements in array");
		for(i=0;i<n;i++) {
			a[i] = obj.nextInt();
		}
		System.out.println("Element of array are as follows : ");
		for(i=0;i<n;i++) {
			System.out.print(" " + a[i]);
		}
		for(i=0;i<n;i++) {
			sum=sum+a[i];
		}
		avg=sum/n;
		
		System.out.println("\nSum of Arrays is :" +sum);
		System.out.println("Average of Arrays is : " + avg);
		
	}

}