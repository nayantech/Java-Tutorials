package program;
import java.util.*;

//Write a program to demonstrate extended interface?

interface Myintf1{
	final static int a=3;
	abstract public void show();
}

interface Myintf2{
	final static double b=5.4;
	abstract public void display();
}

interface Myintf3 extends Myintf1, Myintf2{
	final static long p=123456789;
	abstract public void info();
}
public class ExtendedInterface implements Myintf3 {
	public void show() {
		System.out.println("Myintf1 ="+a);
	}
	public void display() {
		System.out.println("Myintf2 ="+b);
		
	}
	public void info() {
		System.out.println("Myintf3 ="+p);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myintf3 c = new ExtendedInterface();
		c.show();
		c.display();
		c.info();
	}


}