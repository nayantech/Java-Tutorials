package program;
import java.util.*;

//To Perform Priority Queue

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> obj = new PriorityQueue<Integer>();
		obj.add(123);
		obj.add(1234);
		obj.add(454);
		obj.add(345);
		obj.add(678);
		obj.add(554);
		
		Iterator<Integer> itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Methods of Priority Queue?
		System.out.println("Peek Method is "+obj.peek());
		System.out.println("Offer Method is "+obj.offer(600));
		System.out.println("Poll Method is "+obj.poll());
		System.out.println("Remove Method is "+obj.remove());
		System.out.println("Element Method is "+obj.element());
	}

}