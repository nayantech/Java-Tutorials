package program;
import java.util.*;

// Write a  program in java to count occurence of n element in array?

public class Occurence {

	public static void main(String[] args) {
		int a[] = new int[25];
		int i,n,count=0,num;
		Scanner obj = new Scanner(System.in);
		System.out.println("how many elements ?");
		n=obj.nextInt();
		System.out.println("enter " + n + " elements in array ");
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}	
		System.out.println("array elements are as follows ");
		for(i=0;i<n;i++) {
			System.out.print( " " + a[i]);
		}
		System.out.println("Enter an element whose occurence is to be found");
		num = obj.nextInt();
		for(i=0;i<n;i++) {	
			if(num == a[i])
				count++;
		}
		System.out.println(num + " is present " + count + " times in array ");

	}

}