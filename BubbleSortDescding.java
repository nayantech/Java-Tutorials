package program;
import java.util.*;

//Write a program in java to sort element of array in descending order?
public class BubbleSortDescding {

	public static void main(String[] args) {
		int a[] = new int[25];
		int i,n,j,t;
		Scanner obj = new Scanner(System.in);
		System.out.println("how many elements ?");
		n=obj.nextInt();
		System.out.println("enter " + n + " elements in array ");
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}	
		System.out.println("array elements are as follows ");
		for(i=0;i<n;i++) {
			System.out.print( " " +a[i]);
		}
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-1;j++) {
				if(a[j]<a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}

		System.out.println("/nElements of array in ascending order are as follows");
		for(i=0;i<n;i++) {
			System.out.print( " " +a[i]);
		}
	}

}