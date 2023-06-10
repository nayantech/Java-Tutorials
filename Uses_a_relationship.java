package program;
import java.util.*;

//To perform Uses-a Relationship?

class Employeeee{
	double sal=30000;
	
}

class Salary extends Employeee{
	public void display() {
		double bonus=2000;
		Employeeee obj = new Employeeee();
		double total = obj.sal+bonus;
		System.out.println("Total salary is " + total);
	}
}
class Uses_a_relationship extends Employeeee {

	public static void main(String[] args) {
		Salary s = new Salary();
		s.display();

	}

}