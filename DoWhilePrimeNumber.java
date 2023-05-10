package program;
import java.util.*;

//perfrom Prime Number using do while 
public class DoWhilePrimeNumber {

	public static void main(String[] args) {
		int n,b=2;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		n=obj.nextInt();
		do {
			b++;
		}while(n%b!=0);
		if(n==b) {
			System.out.println(n + " Is a prime Number");
		}
		else {
			System.out.println(n + " Is not a prime Number");
		}
	}

}