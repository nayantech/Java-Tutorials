package program;
import java.util.*;

// To Perform Hash Table?

public class Hash_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "Nayan");
		ht.put(2, "Khusboo");
		ht.put(3, "Java");
		ht.put(4, "Developer");
		ht.put(5, "Coder");
		
		System.out.println("Enteries are map as follows");
		for(Map.Entry<Integer,String> m:ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
