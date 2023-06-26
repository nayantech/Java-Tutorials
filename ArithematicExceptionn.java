package program;
import java.util.*;

//Exceptoin
//Write a program in java to demonstrate arithematic exception?

public class ArithematicExceptionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int c = 5;
		int x,y;
		
		try {
			x=a/(b-c);
		}
		
		catch(Exception e)
//		catch(ArithmeticException e)
		{
			System.out.println(e);
//			System.out.println("Division by zero");
		}
		finally {
			y=a/(b+c);
			System.out.println("Value of Y is "+y);
		}
	}

}