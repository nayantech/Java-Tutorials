package program;
import java.util.*;

//Exception
//Write a program in java to demonstrate array store exception?

public class Array_Store_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		double b[]  = {1.3,4.5,3.5};
		
		try {
			 double n = a[7];
		}
		catch(ArrayStoreException e)
		{
			System.out.println("Wrong Data Type");
		}
		
		finally
		{
			int i;
			System.out.println("Elements of Array a of type interger are as follows :");
			for(i=0;i<a.length;i++) {
				System.out.println(" "+a[i]);
			}
			System.out.println("\n Elements of Array b of type double are as follows :");
			for(i=0;i<b.length;i++) {
				System.out.println(" "+b[i]);
			}
		}
	}

}