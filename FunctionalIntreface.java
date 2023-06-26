package program;
import java.util.*;


@FunctionalInterface  //annotation

// Write a program to demonstrate functional interface?


interface MyIntfac
{
	abstract public void display();
}
public class FunctionalIntreface implements MyIntfac {

	public void display() {
		System.out.println("Method Of functional Interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyIntfac c = new FunctionalIntreface();
		c.display();
	}

}