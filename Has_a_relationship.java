package program;
import java.util.*;


//To perform Has-a Realtionship?

class Employeee
{
	double salary = 50000;
	
}
class Has_a_relationship extends Employeee
{
	double bonus = 3000;
	public static void main(String args[] ) {
		Employeee obj=new Employeee();
		System.out.println("Salary is "+obj.salary);
	}
}