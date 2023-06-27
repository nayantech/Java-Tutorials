package program;
import java.util.*;

class Thread1 extends Thread
{
	public void run() {
		System.out.println("Thread1 class Thread");
	}
}

public class Thread_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 obj = new Thread1();
		obj.start();
		System.out.println("Main class Thread");
	}

}