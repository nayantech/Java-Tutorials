package program;
import java.util.*;

class Studentses implements Comparable<Studentses>
{
	int age,roll;
	String name;
	Studentses(int age , int roll, String name ){
		this.age=age;
		this.roll=roll;
		this.name=name;
	}
	
	public String toString() {
		return "Studentses [age=" + age + ", roll=" + roll + ", name=" + name + "]";
	}
	
	public int compareTo(Studentses se) {
		return(this.age-se.age);
	}
	
}
public class Comparable_Program {

	public static void main(String args[]) {
		
	Studentses s[] = new Studentses[30];
	s[0]= new Studentses(1,23,"Radha");
	s[1]= new Studentses(2,24,"Radha");
	s[2]= new Studentses(3,34,"Krishna");
	
	Arrays.sort(s);
	System.out.println("Sorted Objects of Studentses are : "+Arrays.toString());
	
}
}
