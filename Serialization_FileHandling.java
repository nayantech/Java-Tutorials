package program;
import java.io.*;

//To perform Serialization file Handling?

class Students5 implements Serializable{
	transient String name;
	int roll;
	transient int age;
	Students5(int roll, String name,int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
		
	}
	public void display() {
		System.out.println("Roll No. is "+this.roll);
		System.out.println("Name Of Students is "+this.name);
		System.out.println("Age is "+this.age);
	}
}

public class Serialization_FileHandling  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Students5 obj = new Students5(1,"Nayan",22);
		obj.display();
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("student.txt file is created Succssfully");
		oos.writeObject(obj);
		System.out.println("Object file is converted in Byte code");
		fos.close();
		oos.close();
	}

}
