package program;
import java.util.*;

// To perform hirarchical inheritance?

class Collegee{
	String cname,location;
	int esty;
	Scanner sc = new Scanner(System.in);
	public void calculate() {
		System.out.println("Enter College Name, Established Year, and location");
		cname=sc.next();
		esty=sc.nextInt();
		location=sc.next();
	}
	public void display() {
		System.out.println("College Name is:"+cname);
		System.out.println("Location is"+location);
		System.out.println("Established is"+esty);
	}
	
}

class Students extends Collegee{
	String name;
	int rnoll,age,fees,std,mr1,mr2,mr3;
	Scanner sc=new Scanner(System.in);
	public void calculate() {
		super.calculate();
		System.out.println("Enter Studends Name,roll no,Age,standard,Fess,marks of hindi, maths and science");
		name=sc.next();
		rnoll=sc.nextInt();
		age=sc.nextInt();
		fees=sc.nextInt();
		std=sc.nextInt();
		
		
		mr1=sc.nextInt();
		
		mr2=sc.nextInt(); 
		
		mr3=sc.nextInt();
	}
	public void display() {
		super.display();
		System.out.println("Studens Name is"+rnoll);
		System.out.println("Age is"+age);
		System.out.println("Fees is"+fees);
		System.out.println("Standard is"+std);
		System.out.println("Hindi is"+mr1);
		System.out.println("Maths is"+mr2);
		System.out.println("Science is"+mr3);
	}
}

interface Sports {
//	final static String choice="yes";
	abstract public void cal();
	
	
}

class Result extends Students implements Sports{
	String choice;
	double total;
	double per;
	public void cal() {
		super.calculate();
		super.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you in Sports Write 'yess' or 'no' "+choice);
		choice=sc.next();
		if(choice=="yes") {
			total=mr1+mr2+mr3+50;
			per=total/300*100;
			System.out.println("Total marks is:"+total);
			System.out.println("Percentage is:"+per);
		}
		else {
			total=mr1+mr2+mr3;
			per=total/300*100;
			System.out.println("Total marks is"+total);
			System.out.println("PErcentage is:"+per);
		}
		
	}
}

public class Hirarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result s = new Result();
		s.cal();
//		s.display();
	}

}