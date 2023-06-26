package program;
import java.util.*;

//To perform String Buffer Method?

public class StringBufferPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("quastechinstitute");
		
		System.out.println("String is "+sb);
		System.out.println("Length Method is "+sb.length());
		System.out.println("Capacity Method is "+sb.capacity());
		System.out.println("chatAt Method is "+sb.charAt(5));
		System.out.println("Append Method is "+sb.append("borivali"));
		System.out.println("Reverse Method is "+sb.reverse());
		System.out.println("Delete Method is "+sb.delete(2, 9));
		System.out.println("Insert Method is "+sb.insert(7, 'm'));
		System.out.println("Replace Method is "+sb.replace(2, 9, "abcdefgh"));
		System.out.println("ToString Method is "+sb.toString());

	}

}