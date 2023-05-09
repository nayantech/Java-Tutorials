package program;
import java.util.*;

//Write a program in java to display mathematical table of any number?
public class MathTable {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your number: ");
		n=obj.nextInt();
		for(i=1;i<=10;i++) {
			sum=n*i;
			System.out.println(n + "*" +i+ "=" +sum);
			}

	}

}
