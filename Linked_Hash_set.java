package program;
import java.util.*;

//To perform Linked Hash Set

public class Linked_Hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Nayan");
		lhs.add("Rock");
		lhs.add("Roman");
		lhs.add("HHH");
		lhs.add("Jordan");
		
		Iterator<String> li = lhs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		
		//Methods of Collection
		LinkedHashSet lhs1 = new LinkedHashSet<String>();
		lhs1.addAll(lhs);
		System.out.println("Elemenets of Linked list are "+lhs1);
		lhs1.remove("Roman");
		System.out.println("After removing Roman are "+lhs1);
		lhs.retainAll(lhs1);
		System.out.println("After Retaining Element are "+lhs1);
		System.out.println("Container Method are "+lhs.contains("pinku"));
		
		
	}

}
