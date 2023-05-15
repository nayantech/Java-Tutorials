package program;
import java.util.*;

//Write a program in java to check Whether n element present in array of not 
public class Search {

	public static void main(String[] args) {
		int i,n,num,flag=0;
		int a[] = new int[50];
		Scanner obj = new Scanner(System.in);
		System.out.println("How Many Elements ? ");
		n=obj.nextInt();
		System.out.println("Enter "  + n + " Elements in Array");
		for(i=0;i<n;i++) {
			a[i] = obj.nextInt();
		}
		System.out.println("Element of array are as follows");
		for(i=0;i<n;i++) {
			System.out.print(" " +a[i]);
			
		}
		System.out.println("\nEnter an element to be searched in array ");
		num=obj.nextInt();
		for(i=0;i<n;i++) {
			if(num == a[i]) {
				flag = 1;
			}
			
			
		}
		if(flag==0)
			System.out.println(num + " is not present in array");
		else
			System.out.println(num + " is present in array");
	}

}