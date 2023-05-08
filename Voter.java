package program;
import java.util.*;

public class Voter {

	public static void main(String[] args) {
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		age = obj.nextInt();
		System.out.println("Your Age is : " + age );
		if(age >= 18) {
			System.out.println("You are eligible for Voting ");
			
		}
		else
		{
			System.out.println("You are Not eligible for Voting");
		}

	}

}