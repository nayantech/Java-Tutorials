package program;
import java.util.*;


//Write a Program in java to display student name, roll no , standard , and marks obtain in 3 subject and calculate total marks obtain in 3 subjects and percentage 

public class Student {

	public static void main(String[] args) {
		int roll,marks,stand,marks2,marks3;
		
		String name;
		double per,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Details : ");
		System.out.println("Enter Your Name : ");
		name=sc.nextLine();
		System.out.println("Enter Roll No : ");
		roll=sc.nextInt();
		System.out.println("Enter Your Standard : ");
		stand=sc.nextInt();
		System.out.println("Enter Your English Subject Marks");
		marks=sc.nextInt();
		System.out.println("Enter Your Math Subject Marks");
		marks2=sc.nextInt();
		System.out.println("Enter Your Hindi Subject Marks");
		marks3=sc.nextInt();

		
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + roll);
		
		System.out.println("Standard : " + stand);
		System.out.println("English : " + marks );
		System.out.println("Math : " + marks2 );
		System.out.println("Hindi : " + marks3 );
		sum=marks + marks2 +marks3;
		System.out.println("Total Marks : " + sum );
		per=sum/300 * 100;
		System.out.println("Percentage obtain : " + per);

	}

}