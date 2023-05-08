package program;
import java.util.*;
public class VowCon {

	public static void main(String[] args) {
		String ch;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Character " );
		ch = obj.nextLine();
		if(ch=="a" || ch=="e" || ch=="i" || ch=="o" || ch=="u")
		{
			System.out.println(ch + "is a vowel");
		}
		else
		{
			System.out.println(ch + "is a consonenet");
		}

	}

}