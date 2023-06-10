package program;
import java.util.*;


//To perform multilevel?


class Company{
	String cname,ho;
	int est;
	
	Scanner obj = new Scanner(System.in);
	
	public void get() {
		System.out.println("Enter Compnay name , Established year ,Head Office");
		cname=obj.next();
		ho=obj.next();
		est=obj.nextInt();
		
		
	}
	
	public void display() {
		System.out.println("Compnay Name is : "+cname);
		System.out.println("Head Office : "+ho);
		System.out.println("Eastablished Year : "+est);
	}
	
	
}

class Employee extends Company{
	
	String ename,qualification;
	int id;
	
	public void get() {
		super.get();
		System.out.println("Enter Employee Name  ,id , Qualification ");
		
		ename=obj.next();
		id=obj.nextInt();
		qualification=obj.next();
	}
	
	public void display() {
		super.display();
		
		System.out.println("Enter Employee Name : " +ename);
		System.out.println("Enter Employee Qualification : " +qualification);
		System.out.println("Enter Id :" +id);
	}
	
	
}

class Department extends Employee{
	
	String dpt;
	int salary,exp;
	
	public void get() {

		super.get();
		
		System.out.println("Enter Employee Department , Salary and Experiance year");
		dpt=obj.next();
		salary=obj.nextInt();
		exp=obj.nextInt();
		
		
		
	}
	
	public void display() {
		super.display();
		
		System.out.println("Department is " +dpt);
		System.out.println("Salary is " +salary);
		System.out.println("Experience Year is " +exp);
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Department c = new Department();
		c.get();
		c.display();

	}

}





