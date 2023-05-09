package program;
import java.util.*;


// to check number is positive,negative or zero
public class Numbers {

	public static void main(String[] args) {
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any Number");
		num=obj.nextInt();
		System.out.println("number is: " + num);
		if(num > 0) {
			System.out.println(num + " is positive number ");
		}
		if(num < 0) {
			System.out.println(num + " is negative number ");
		}
		if( num==0 ) {
			System.out.println("It is Zero");
		}

	}

}