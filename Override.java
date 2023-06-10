package program;
import java.util.*;

//To Perform Override

class Base{
	public void display() {
		System.out.println("Display Method of Base class");
	}
}

class Derived extends Base{
	public void display() {
		super.display();
		System.out.println("Display Method of Derived Class");
	}
}

class Derived1 extends Derived{
	public void display() {
		super.display();
		System.out.println("Display method of Derived1 Class");
	}
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Derived1 obj = new Derived1();
		obj.display();
		
		
	}

}