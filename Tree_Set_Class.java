package program;
import java.util.*;

//To Perform Tree set class

public class Tree_Set_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> obj = new TreeSet<String>();
		obj.add("Sunday");
		obj.add("Monday");
		obj.add("Tuesday");
		obj.add("Wednesday");
		obj.add("Tursaday");
		obj.add("Friday");
		obj.add("Saturday");
		
		Iterator<String> itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}