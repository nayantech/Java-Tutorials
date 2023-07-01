package program;
import java.util.*;

//To performed Synchronized Thread?

class MyThread extends Thread
{
	String msg[] = {"I","Am","Learning","Java"};
	public void run() {
		display();
	}
	public synchronized void display() {
		int i;
		for(i=0;i<msg.length;i++) {
			System.out.println(Thread.currentThread().getName()+" "+msg[i]);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class Synchronized_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.start();
		t2.start();	
		
	}
}

