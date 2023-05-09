package program;
import java.util.*;

//To using while loop find any number factorial?
public class WhileDisplayNumbers {

	public static void main(String[] args) {
		int n,sum=0,i=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		n=obj.nextInt();
		System.out.println("Your Enter Number is : " +n);
		while(i<=n) {
			sum = sum+i;
			i++;
		}

		System.out.println(sum);
	}

}
