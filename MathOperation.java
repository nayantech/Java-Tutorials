package program;
import java.util.*;

//To perform math operations Addition,substraction,multiplication,modulus,division
public class MathOperation {

	// Switch case
	public static void main(String[] args) {
		int n1,n2,choice;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter your two Numbers : ");
		n1 = obj.nextInt();
		n2 = obj.nextInt();
		System.out.println("1. For Addition ");
		System.out.println("2. For Subtraction ");
		System.out.println("3. For Multiplication ");
		System.out.println("4. For Division ");
		System.out.println("5. For Modulus ");
		choice=obj.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition is " +(n1 + n2));
			break;
		case 2:
			System.out.println("Subtraction is " +(n1 - n2));
			break;
		case 3:
			System.out.println("Multiplication is " +(n1 * n2));
			break;
		case 4:
			System.out.println("Division is " +(n1 / n2));
			break;
		case 5:
			System.out.println("Modulus is " +(n1 % n2));
			break;
		}
	}

}