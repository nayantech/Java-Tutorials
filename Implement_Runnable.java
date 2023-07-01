package program;
import java.util.*;

//Write a program to demonstrate multithreading by implemneting runnable interface?

class ThreadD implements Runnable
{
	public void run()
	{
		System.out.println("ThreadD Class Thread Executed");
	}
}

public class Implement_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadD obj = new ThreadD();
		Thread t = new Thread(obj);
		t.start();
		System.out.println("Main Class Thread Executed");
	}

}