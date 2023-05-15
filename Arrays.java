package program;
import java.util.*;

//Write a program in java to except elements in array and display all the elements of array
public class Arrays {

	public static void main(String[] args) {
		int i,n;
		int a[] = new int[25];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Limit of array");
		n=obj.nextInt();
		System.out.println("Enter " + n + " Elements in array");
		for(i=0;i<n;i++) 
		{
			a[i] = obj.nextInt();
		}
		System.out.println("Elements of Array are as follows : ");
		for(i=0;i<n;i++) {
			System.out.print(" " +a[i]);
		}

	}

}