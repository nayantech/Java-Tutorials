package program;
import java.util.*;


//Exception
//Write a program in java to demostrate arrayindexoutofboundsException?

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int num;
		try
		{
			num=a[7];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index Number");
		}
		finally
		{
			int i;
			System.out.println(("Array of Elements are as follows:"));
			for(i=0;i<5;i++) {
//			for(i=0;i<a.length;i++) {
				System.out.print(" "+a[i]);
			}
		}
	}

}