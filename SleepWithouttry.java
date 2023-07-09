package program;
import java.util.*;

//To perform sleep method without using try and catch block only used by throws?

class Thread5 implements Runnable {
	public void run() {
		System.out.println("Sleep Method is ");
	}
}

public class SleepWithouttry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread5 obj = new Thread5();
		Thread c = new Thread(obj);
		Thread.sleep(3000);
		c.start();
		
	}

}