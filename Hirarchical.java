package program;
import java.util.*;

//To perform Hirarchical in java?

class Companyyy{
	String cname,ho;
	int est;
	
	Scanner sc = new Scanner(System.in);
	
	public void get() {
		System.out.println("Enter Compnay Name , Head Office  and Established Year");
		cname=sc.next();
		ho=sc.next();
		est=sc.nextInt();
	}
	
	public void display() {
		System.out.println("Company name is : "+cname);
		System.out.println("Head Office is : "+ho);
		System.out.println("Eastblished Year is :"+est);
	}
}

class Employe extends Companyyy{
	String ename,quli;
	int id;
	
	public void get() {
		super.get();
		System.out.println("Enter Employee Name , Qualification and id");
		ename=sc.next();
		quli=sc.next();
		id=sc.nextInt();
		
	}
	
	public void display() {
		super.display();
		System.out.println("Employee name is :"+ename);
		System.out.println("Qualification is :"+quli);
		System.out.println("Id is :"+id);
	}
}

class Departmentt extends Companyyy{
	String depart;
	int sal,exp;
	
	public void get() {
		System.out.println("Enter Department , Salary and Experience Year");
		
		depart=sc.next();
		sal=sc.nextInt();
		exp=sc.nextInt();
		
	}
	
	public void display() {
		System.out.println("Department is :"+depart);
		System.out.println("Salary is :"+sal);
		System.out.println("Experience Year is "+exp);
	}
}

public class Hirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe e = new Employe();
		e.get();
		e.display();
		
		Departmentt d = new Departmentt();
		d.get();
		d.display();

	}

}