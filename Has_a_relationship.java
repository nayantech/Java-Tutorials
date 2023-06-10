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
		Has_a_relationship obj=new Has_a_relationship();
		System.out.println("Salary is "+obj.salary);
	}
}