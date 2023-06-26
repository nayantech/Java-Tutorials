package program;
import java.util.*;

// Write a program in java to count total number of characters, Digit, blackspaces and special symbol in given string?

public class String_Practical {
	
	String str;
	int i,alpha=0,digits=0,ss=0,bs=0;
	char ch;
	Scanner s = new Scanner(System.in);
	
	public void get() {
		System.out.println("Enter Any String");
		str=s.nextLine();
	}
	
	public void count() {
		for(i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if((ch>='a' && ch<='z')  || (ch>='A' && ch<='Z')) {
				alpha++;
			}
				
				else if(ch>='0' && ch<='9') {
					digits++;
				}
				else if(ch== ' ') {
					bs++;
				}
				else {
					ss++;
				}
			}
		
	}
	
	public void display() {
		System.out.println("String is "+str);
		System.out.println("Total Number of Alphabets is "+alpha);
		System.out.println("Total Number of Digits is "+digits);
		System.out.println("Total Number of Blank Space is "+bs);
		System.out.println("Total Number of Special Symbol is "+ss);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Practical s = new String_Practical();
		s.get();
		s.count();
		s.display();
	}

}