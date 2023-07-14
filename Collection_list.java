package program;
import java.util.*;

//To perfrom Collection list?

public class Collection_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here is Arraylist 
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(123);
		l1.add(456);
		l1.add(789);
		
		Iterator<Integer> itr=l1.iterator();
		System.out.println("Elements of Array List are as follows ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//her is LinkedList
		List<String> l2 = new LinkedList<String>();
		l2.add("Nayan");
		l2.add("Baghat");
		l2.add("Chandragupta");
		
		Iterator<String> itra = l2.iterator();
		System.out.println("\nElements of Linked List are as follows ");
		while(itra.hasNext()) {
			System.out.println(itra.next());
		}
	}

}