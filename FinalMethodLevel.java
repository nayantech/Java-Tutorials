package program;
import java.util.*;

// Final at method level

class A{
	public void display() {
		System.out.println("Base Class Display Method ");
	}
	final public void info() {
		System.out.println("Base Class INfo final method ");
	}
	
}

class B extends A{
	
//	public void info() {
//		System.out.print("cannot override final method of base class");
//	}
	public void display() {
		super.display();
		System.out.println("Derived class overriden method of base class");
	}
}


public class FinalMethodLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		
		obj.display();
		obj.info();
		}

}