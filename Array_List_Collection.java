package program;
import java.util.*;

//Write a program to demonstrate ArrayList Collection?

public final class Array_List_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(123);
		al.add(246);
		al.add(300);
		al.add(500);
		al.add(600);
		
		Iterator<Integer> itr=al.iterator();
		System.out.println("Element of array list class area as follows ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//List Iterator performed form here
		ListIterator<Integer> li = al.listIterator();
		System.out.println("Elements of array list in forward directions are ");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Elements of array list in backward directions are ");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}