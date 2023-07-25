package program;
import java.util.*;

// To find Array of maximum number and minimum Number?
public class ArrayMax {

	public static void main(String[] args) {
		int a[] = new int[50];
		int i,n,max,min;
		Scanner obj = new Scanner(System.in);
		System.out.println("how many elmements ?");
		n=obj.nextInt();
		max=a[0];			
		System.out.println("enter " + n + "element in array ");
		for(i=0;i<n;i++)
		{
		a[i]=obj.nextInt();
		}
		System.out.println("array elemetns are as follows: ");

		for(i=0;i<n;i++)
		{
		System.out.print(" " +a [i]);
		}
		
		for(i=0;i<n;i++)
		{
		if(max < a[i])
		max=a[i];		
		}
		min=a[0];
		for(i=0;i<n;i++)
		{
		if(min>a[i])
		min=a[i];
		}
		System.out.println("\n maximum number is " + max);
		System.out.println(" minimum number is " + min);
		}
		

	}