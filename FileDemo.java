package program;
import java.io.*;

//To perform File Handling ?

public class FileDemo  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("first.txt");
		System.out.println("first.txt File created Successfully");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("I am Learning Java Programming ");
		dos.writeInt(123);
		dos.writeChar('N');
		dos.writeLong(1234567890);
		dos.writeBoolean(true);
		System.out.println("Message Written in first.txt File Successfully ");
		dos.close();
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String msg=dis.readUTF();
		int num=dis.readInt();
		char c=dis.readChar();
		long l=dis.readLong();
		boolean b=dis.readBoolean();
		dis.close();
		System.out.println("Message in first.txt file is "+msg);
		System.out.println("Integer Value in file is "+num);
		System.out.println("Character Value in file is "+c);
		System.out.println("Long Value in file is "+l);
		System.out.println("Boolean Value in file is "+b);
	}

}