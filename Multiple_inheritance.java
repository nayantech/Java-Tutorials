package program;
import java.util.*;


//To perform Multiple Inheritance and Interface

class Companye{
	String cname,ho;
	int esty;
	Scanner s = new Scanner(System.in);
	public void get() {
		System.out.println("Enter Company name,Established Year and Head Offices");
		cname=s.next();
		esty=s.nextInt();
		ho=s.next();
	}
	
	public void display() {
		System.out.println("Company name is "+cname);
		System.out.println("Established Year"+esty);
		System.out.println("Head Office is at"+ho);
	}
}

interface Employees{
	final static int id=101;
	final static String name="Nayan";
	abstract public void  displayemp();
}

class Departmentss extends Companye implements Employees
{
	String dept,desg;
	int exp;
	long sal;
	public void get() {
		super.get();
		System.out.println("Enter Employee Department , Designation, Experience and Salary");
		dept=s.next();
		desg=s.next();
		exp=s.nextInt();
		sal=s.nextLong();
	}
	public void display() {
		super.display();
		System.out.println("Department is "+dept);
		System.out.println("Designation is "+desg);
		System.out.println("Experience is "+exp);
		System.out.println("Salary is "+sal);
	}
	public void displayemp() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
	}
}


public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departmentss d = new Departmentss();
		d.displayemp();
		d.get();
		d.display();

	}

}
