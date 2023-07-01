package program;
import java.util.*;

//Write a program in java to demonstrate multithreading by implementing runnable interface and display in sum intervel of time?

class Threading3 implements Runnable{
	public void run() {
		try {
			int i;
			for(i=1;i<=5;i++) {
				System.out.println("Threading Class Thread"+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
public class MultithreadingSleep_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading3 obj = new Threading3();
		Thread s = new Thread(obj);
		s.start();
		try {
			int i;
			for(i=1;i<=5;i++) {
				System.out.println("Main Class Thread Executed"+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}