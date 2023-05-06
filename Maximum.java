package program;
import java.util.*;

public class Maximum {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		n1=obj.nextInt();
		n2=obj.nextInt();
		n3=obj.nextInt();
		System.out.println("First Number Is: " +n1);
		System.out.println("Second Number Is: " +n2);
		System.out.println("Third Number Is: " +n3);
		
		if(n1>n2 && n1>n2) {
			System.out.println("Greatest number among 3 numbers is" + n1);
		}
		if(n2>n1 && n2>n3) {
			System.out.println("Greatest number among 3 numbers is" + n2);
		}
		if(n3>n1 && n3>n2) {
			System.out.println("Greatest number among 3 numbers is" + n3);
		}
	}

}