package program;
import java.util.*;

//To perform Single Level Inheritance

class College{
	String name;
	int esty;
	Scanner s = new Scanner(System.in);
	
	public void get() {
		System.out.println("Enter College Name and Established year ");
		name=s.nextLine();
		esty=s.nextInt();
	}
	
	public void display() {
		System.out.println("College name is " + name);
		System.out.println("COllege Established Year Is " + esty);
	}
}

class CollgStudents extends College{
	int phy,chem,maths,eng,bio,it,total=0;
	double per;
	public void get() {
		super.get();
		System.out.println("Marks obtained in 6 subject is : ");
		eng=s.nextInt();
		phy=s.nextInt();
		chem=s.nextInt();
		maths=s.nextInt();
		bio=s.nextInt();
		it=s.nextInt();
		
	}
	
	public void display() {
		super.display();
		System.out.println("English Marks is : " +eng);
		System.out.println("Physics Marks is : " +phy);
		System.out.println("Chemistry Marks is : " +chem);
		System.out.println("Mathematics Marks is : " +maths);
		System.out.println("Biology Marks is : " +bio);
		System.out.println("Information Technology Marks is : " +it);
		total=eng+phy+chem+maths+bio+it;
		System.out.println("Totoal Marks is : " +total);
		per=total/6.0;
		System.out.println("Percentage is : " + per);
	}
}


public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		
		CollgStudents obj = new CollgStudents();
		
		obj.get();
		obj.display();
		

	}

}