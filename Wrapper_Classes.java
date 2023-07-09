package program;
import java.lang.*;
import java.util.*;

//Write a program in java to demonstrate wrapper classes

public class Wrapper_Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		char c;

		boolean b;
		float f;
		double d;
		long l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Interger Value ");
		i=sc.nextInt();
		
		c='N';
		System.out.println("Enter Boolean Value ");
		b=sc.nextBoolean();
		System.out.println("Enter Float Value ");
		f=sc.nextFloat();
		System.out.println("Enter Double Value ");
		d=sc.nextDouble();
		System.out.println("Enter Long Value ");
		l=sc.nextLong();
		
		Integer objint = new Integer(i);
		Character objchar = new Character(c);
		Boolean objbool = new Boolean(b);
		Float objfloat = new Float(f);
		Double objdoub = new Double(d);
		Long objlong = new Long(l);
		
		System.out.println("Interger Value is "+objint);
		System.out.println("Character Value is "+objchar);
		System.out.println("Float Value is "+objfloat);
		System.out.println("Double value is "+objdoub);
		System.out.println("Long value is "+objlong);
		System.out.println("Boolean Value is "+objbool);
	}

}