package program;
import java.util.*;

//To Perform Collections Factory?

public class Collections_Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> l = List.of(1,2,3,4,5,6,7,8,9,10);    //By Integer Type
		List<String> l = List.of("Nayan","are","Java","Developer");
		
		
//		Iterator for only do but not use iterator here for iterate
//		Iterator<Integer> itr=l.iterator();
//		Iterator<String> itr=l.iterator();
//		System.out.println("Element of List are");
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		for(String st:l) {
			System.out.println(st);
		}
	}

}