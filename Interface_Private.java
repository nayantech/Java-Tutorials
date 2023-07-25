package program;
import java.util.*;


//To perform Private Interface?

interface Intf {
	abstract public void add(int a,int b);
	default void sub(int a ,int b)
	{
		mul(a,b);
		div(a,b);
		System.out.println("Subtraction is "+(a-b));
	}
	private void mul(int a,int b) {
		mod(a,b);
		System.out.println("Multiplication is "+(a*b));
	}
	private static void div(int a, int b) {
		System.out.println("Division is "+(a/b));
	}
	private static void mod(int a, int b) {
		System.out.println("Modulus is "+(a%b));
	}
	
}
public class Interface_Private implements Intf {

	public void add(int a, int b) {
		System.out.println("Addition is "+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf ref = new Interface_Private();
		ref.add(5, 3);
		ref.sub(3, 2);
	}

}