package program;
import java.util.*;

//To perform String class Method?

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two String ");
		str1=s.next();
		str2=s.next();
		
		System.out.println("First String is "+str1);
		System.out.println("Second String is "+str2);
		System.out.println("Length Method is "+str1.length());
		System.out.println("toLowercase Method is "+str1.toLowerCase());
		System.out.println("toUpperCase Method is "+str1.toUpperCase());
		System.out.println("Replace Method is"+str1.replace('a', 'p'));
		System.out.println("Trim Method is "+str1.trim());
		System.out.println("Equals Method is "+str1.equals(str2));
		System.out.println("Equals IgnoreCase Method "+str1.equalsIgnoreCase(str2));
		System.out.println("CharAt Method is "+str1.charAt(4));
		System.out.println("CompareTo Method is "+str1.compareTo(str2));
		System.out.println("Concat Method is "+ str1.concat(str2));
		System.out.println("Substring Method is "+str1.substring(2));
		System.out.println("Substring With Limit Methos is "+str1.substring(2,4));
		System.out.println("indexOf is "+str1.indexOf('n'));
		System.out.println("lastindexOf Method is "+str1.lastIndexOf('n'));
		
		System.out.println("");
		
		System.out.println("Length Method is "+str2.length());
		System.out.println("toLowerCase Method is "+str2.toLowerCase());
		System.out.println("toUpperCase Method is "+str2.toUpperCase());
		System.out.println("Replace Method is"+str2.replace('k','n'));
		System.out.println("Trim Method is "+str2.trim());
		System.out.println("Equals Method is "+str1.equals(str2));
		System.out.println("Equlas IgnoreCase Methos is "+str2.equalsIgnoreCase(str1));
		System.out.println("CharAt Method is "+str2.charAt(2));
		System.out.println("CompareTo Method is "+str2.compareTo(str1));
		System.out.println("Concat Methos is "+str2.concat(str1));
		System.out.println("Substring Method is "+str2.substring(3));
		System.out.println("Substring With Liimit Method is "+str2.substring(2,3));
		System.out.println("indexOf is "+str2.indexOf('k'));
		System.out.println("lastindexOf is "+str2.lastIndexOf('u'));
		

	}

}