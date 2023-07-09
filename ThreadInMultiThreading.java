package program;
import java.util.*;

class ThreadPriority extends Thread{
	public void run() {
		System.out.println("Running Thread Priority is: "+Thread.currentThread().getPriority());
		Thread.yield();   //yield()
	}
}

public class ThreadInMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority m1 = new ThreadPriority();
		ThreadPriority m2 = new ThreadPriority();
		m1.setPriority(Thread.MIN_PRIORITY);  //getPriority() and setPriority()
		m2.setPriority(Thread.MAX_PRIORITY);   
		m1.start();
//		m1.suspend();  //suspend()
		m2.start();
//		m1.resume();  //resume()
		
		
		System.out.println(m1.isAlive());  //isAlive()
		System.out.println(m2.isAlive());
		
		try {
			m1.join();
			m2.join();   //join()
			System.out.println("Run join method");

		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		

}
}