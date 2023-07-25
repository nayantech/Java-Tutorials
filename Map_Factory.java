package program;
import java.util.*;

//To perform Map Factory?


public class Map_Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=Map.of(1,"Nayan",2,"Are",3,"Java",4,"Developer");
		System.out.println("map key and value are as follows");
		for(Map.Entry<Integer, String> me:m.entrySet())
		{
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

}