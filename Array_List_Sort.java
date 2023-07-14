package program;
import java.util.*;

// To Perform Array List Sort?

public class Array_List_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(345);
		al.add(0);
		al.add(-3);
		al.add(456);
		al.add(-55);
		
//		Iterator<Integer> itr =al.iterator();
//		System.out.println("Elements of array list class are as follows");
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		ListIterator<Integer> itra = al.listIterator();
//		System.out.println("Element of array list class are as follows");
//		while(itra.hasNext()) {
//			System.out.println(itra.next());
//		}
		
		
		Collections.sort(al);
		System.out.println("Elements of collection after sorting are : "+al);
	}

}