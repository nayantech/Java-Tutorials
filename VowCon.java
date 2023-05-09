package program;
import java.util.*;

//write a program in java to calculate volume of cone  take input from user?
public class VowCon {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Character " );
		while(true) {
			String ch1 = obj.nextLine();
			if(ch1.equalsIgnoreCase("a") || ch1.equalsIgnoreCase("e") || ch1.equalsIgnoreCase("i") || ch1.equalsIgnoreCase("o") || ch1.equalsIgnoreCase("u"))

//			if(ch1.equals("a") || ch1.equals("e") || ch1.equals("i") || ch1.equals("o") || ch1.equals("u"))

			{
				System.out.println(ch1 + " is a vowel");
			}
			else
			{
				System.out.println(ch1 + " is a consonenet");
			}
		}
	}

}


