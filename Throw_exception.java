package program;
import java.util.*;

//Write a program in java to demonstrate user defined exception?

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
	
}

public class Throw_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=1000;
		try {
			double z = (double) x / (double) y;
			if(z<0.01) {
				throw new MyException("Number is too small");
			}
		}
		
		catch(MyException e) {
			System.out.println("Caught an exception");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("This is throw Exception ");
		}
	}

}