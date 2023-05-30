package program;
import java.util.*;


//To perform ThisKeyword

public class ThisKeyword {

	int a;  //class variable
	public void display(int a)   //argument variable
	{
		this.a=a;
	}
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.display(10);
		System.out.println(obj.a);

	}

}