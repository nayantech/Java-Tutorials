package program;
import java.util.*;

//Write a program in java to check method string is palindrome or not?

public class Palindrom_String {
	String str; // To store original String
	String st=""; //To store a dublicate String
	int i;
	char ch;
	Scanner s = new Scanner(System.in);
	public void get() {
		System.out.println("Enter Any String Name");
		str=s.nextLine();
	}
	public void check() {
		for(i=str.length()-1;i>=0;i--) {
			ch=str.charAt(i);
			st=st+ch;
		}
		if(str.equalsIgnoreCase(st)) {
			System.out.println(str+" Is a Palindrom Number");
		}
		else {
			System.out.println(str+" Is Not a Palindrom Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom_String s = new Palindrom_String();
		s.get();
		s.check();
		
	}

}