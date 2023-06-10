package program;
import java.util.*;

//Final keyword at class level

final class C{
	public void display() {
		System.out.println("Base Class Display Method ");
	}
}

class D {
	public void show() {
//		super.display();	//cannot inherite class because here you used final keyword
		System.out.println("Derived class show method");
		System.out.println("Cannot Inherit or extends final class ");
	}
}

public class FinalClassLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.show();
		
//		C obj1 = new C();
//		obj1.display();
	}

}