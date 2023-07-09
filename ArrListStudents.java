package program;
import java.util.*;

//Write a program in java to demonstrate user defined class object of arraylist class?

class ArrayListStudents{
	String name;
	int rno,age;
	ArrayListStudents(int rno, String name, int age){
		this.name=name;
		this.rno=rno;
		this.age=age;
	}
}
public class ArrListStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayListStudents> al =new ArrayList<ArrayListStudents>();
		ArrayListStudents s1 = new ArrayListStudents(1,"Nayan",22);
		ArrayListStudents s2 = new ArrayListStudents(2,"Pankaj",24);
		ArrayListStudents s3 = new ArrayListStudents(3,"Satyam",26);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator<ArrayListStudents> itr = al.iterator();
		System.out.println("Elements are as follows ");
		while(itr.hasNext())
		{
			ArrayListStudents s=(ArrayListStudents)itr.next();
			System.out.println(s.rno+" "+s.name+" "+s.age);
		}
	}

}