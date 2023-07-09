package program;
import java.util.*;

//Write a program in java to demonstrate arraylist class of classionframework?

public final class Array_List {

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
	}

}