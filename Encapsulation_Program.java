package program;
import java.util.*;

class Person{
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Encapsulation_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Person p = new Person();
		p.setAge(22);
		System.out.println("Person Age is "+p.getAge());
	}

}