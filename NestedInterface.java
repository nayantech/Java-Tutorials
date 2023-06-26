package program;
import java.util.*;

// Write a program to demonstrate nested interface?

class Myclasss{
	public void display() {
		System.out.println("Display Method Call");
	}
	interface abc{
		final static int a = 3;
		abstract public void show();
	}
}
public class NestedInterface implements Myclasss.abc {
	public void show() {
		System.out.println("Nested Interface Show Method"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterface c = new NestedInterface();
		c.show();
		Myclasss obj = new Myclasss();
		obj.display();
	}

}