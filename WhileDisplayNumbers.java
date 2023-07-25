package program;
import java.util.*;

//To using while loop Display Number 1 to 10?
public class WhileDisplayNumbers {

	public static void main(String[] args) {
		int n,sum=1,i=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		n=obj.nextInt();
		System.out.println("Your Enter Number is : " +n);
		while(i<=n) {
			sum = sum*i;
			i++;
		}

		System.out.println(sum);
	}

}
