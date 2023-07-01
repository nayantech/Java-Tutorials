package program;
import java.util.*;

//Write a program in java to demonstrate multitherading by extending thread class?

class Thread2 extends Thread{
	public void run(){
		int i; 
		try
		{
			for(i=0;i<=5;i++) {
				System.out.println("Thread2 class Thread "+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class Thread2_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 obj = new Thread2();
		obj.start();
		try {
			int i;
			for(i=0;i<=5;i++) {
				System.out.println("Main class thread "+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}

}