package program;
import java.util.*;
import java.io.*;

//To perform Try Resource?

public class Try_Resource {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("tryres.txt");
		try(fos)
		{
			String msg = "Nayan Are Java Coder";
			byte b[] = msg.getBytes();
			fos.write(b);
			System.out.println("Data Written in File");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}