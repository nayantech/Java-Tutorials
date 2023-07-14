package program;
import java.util.*;

//To perform Hash Set?

//Iterator interface not possible backword direction
//Iterator interface Possible Both Directions?
public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Nayan");
		hs.add("Satyam");
		
		
		Iterator<String> li= hs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}