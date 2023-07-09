package program;
import java.util.*;
import java.io.*;

//To perform File Writer and Reader Program?

public class FileWriterandReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("second.txt");
		System.out.println("second.txt file created successfully");
		fw.write("I am learning file handling in java");
		fw.close();
		
		FileReader fr = new FileReader("second.txt");
		int msg;
		System.out.println("Content of file is ");
		while((msg=fr.read())!=-1) {
			System.out.print((char)msg);
		}
	}

}