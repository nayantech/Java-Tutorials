package program;
import java.util.*;

//To perform Linked List?

public class LinkedList_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Shikha");
		ll.add("Nayan");
		ll.add("khushboo");
		ll.add("Ankush");
		ll.add("Himanshu");
		
		Iterator<String> itr = ll.iterator();
		System.out.println("Elements of Linked List Are as follows ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		//Methods of Collections 
		LinkedList<String> l1 = new LinkedList<String>();
		l1.addAll(ll);
		System.out.println("Element of Linked List Are "+l1);
		l1.remove("Himanshu");
		System.out.println("After Removing Himanshu Elements are "+l1);
		l1.remove("Ankush");
		System.out.println("After Removing Ankush Elements are "+l1);
		ll.retainAll(l1);
		System.out.println("After Retaining elements are "+l1);
		System.out.println("Containes() Method Are "+ll.contains("Sairaj"));
	}

}