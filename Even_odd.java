package program;
import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		int a;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter your number : " );
		a = obj.nextInt();
		if( a%2==0 ){
			System.out.println("Your Number is Even " + a);
		}
		else {
			System.out.println("Your Number is Odd " + a);
		}

	}

}