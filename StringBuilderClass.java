package program;
import java.util.*;

//To perform String Builder Class?

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("javaprogramming");
		System.out.println("String is "+sb);
		System.out.println("Length Method is "+sb.length());
		System.out.println("Append Method is "+sb.append("quastech"));
		System.out.println("Insert Method is "+sb.insert(5, "abcd"));
		System.out.println("Replace Method is "+sb.replace(2,5,"axyz"));
		System.out.println("Delete Method is "+sb.delete(3,7));
		System.out.println("Reverse Method is "+sb.reverse());
		System.out.println("Capacity Method is "+sb.capacity());
		System.out.println("CharAt Method is "+sb.charAt(6));
		System.out.println("Substring Method is "+sb.substring(4));
		System.out.println("Substring with limit Method is "+sb.substring(3,9));
	}

}