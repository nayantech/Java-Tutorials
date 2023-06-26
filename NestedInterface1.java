package program;
import java.util.*;

//Write a program to demonstrate nested interface?
//here we call by making class object

interface abc{
	final static int a=10;
	abstract public void info();
	
	interface def{
		final static double b= 3.4;
		abstract public void show();
	}
}
public class NestedInterface1 implements abc.def{
	
	public void info(){
		System.out.println("Outer Interface into method");
	}
	public void show(){
		System.out.println("Nested Interface show method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterface1 obj = new NestedInterface1();
		obj.info();
		obj.show();
	}

}