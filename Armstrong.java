package program;
import java.util.*;

//Write a program in java to check whether number is armstrong number or not
public class Armstrong {

	public static void main(String[] args) {
		int n,num,t,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any Number");
		n=obj.nextInt();
		num=n;
		while(n!=0) {
			t=n%10;
			sum=sum+(t*t*t);
			n=n/10;
		}
		if(num==sum) {
			System.out.println(num + " is a Aramstrong Number");
			
		}
		else {
			System.out.println(num + " it is not a Aramstrong Number");
		}

	}

}