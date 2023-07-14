package program;
import java.util.*;

//To perform Linked Hash Map

public class Linked_Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(1, "Nayan");
		lhm.put(2, "Khushboo");
		lhm.put(3, "Burger");
		lhm.put(4, "Samosa");
		lhm.put(5, "panipuri");
		
		System.out.println("Enteries Of map are as follows");
		for(Map.Entry<Integer, String> m:lhm.entrySet())
		{
			System.out.println(m.getKey()+ " " + m.getValue());
		}
	}

}