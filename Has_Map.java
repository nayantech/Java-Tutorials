package program;
import java.util.*;

//To perform Has Map

public class Has_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Rajesh");
		hm.put(2, "Nayan");
		hm.put(3, "Kushboo");
		hm.put(4, "Lion");
		hm.put(5, "King");
		
		System.out.println("Enteries Of map are as follows");
		for(Map.Entry<Integer,String> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}