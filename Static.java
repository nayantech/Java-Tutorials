package program;
import java.util.*;

//To Perform Static Keyword

public class Static {
	
//	static {
//		System.out.println("First Static Block ");
//	}
//	static {
//		System.out.println("Second Static Block ");    //in code when static is present in code they first execute before main method
//	}
	
	static public void fun() {
		System.out.println("Static Method Statements ");
	}
	public void display() {
		System.out.println("Non Static method Statements ");
	}

	public static void main(String[] args) {
		
		
		Static obj =  new Static();
		obj.display();   //call by object to display()
		fun();			//call by method name
		Static.fun();   //call by classname.method name
		obj.fun();   //call by object as well method name
	}

}