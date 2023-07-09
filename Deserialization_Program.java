package program;
import java.io.*;

//To perform Deserialization program in file handling?

public class Deserialization_Program {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Students5 s = (Students5)ois.readObject();
		
		System.out.println("Roll Number of Students is "+s.roll);
		System.out.println("Name of Students is "+s.name);
		System.out.println("Age of Students is "+s.age);
		System.out.println("Deserialization Done");
		
	}

}