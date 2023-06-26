package program;
import java.util.*;

//Write a program in java to create user defined exception if a person is not eligible for voting? 


class Less18Exception extends Exception
{
	
//	private static final long serialVersionUID = 1L;
	String st;
	Less18Exception(String s){
		st=s;
	}
	public String toString() {
		return st;
	}
}

class Demo{
	public void check(int a) throws Less18Exception
	{
	if(a<18) 
	{
		throw new Less18Exception("You are not Eligible for voting");
	}
	else {
		System.out.println("Your are eligible for Voting");
	}
}
}
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int age;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Your Age");
			age=s.nextInt();
			Demo obj = new Demo();
			obj.check(age);
		}
		
		catch(Less18Exception le) {
			System.out.println(le.toString());
		}
	}

}