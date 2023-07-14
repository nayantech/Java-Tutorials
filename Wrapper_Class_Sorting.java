package program;
import java.util.*;
public class Wrapper_Class_Sorting {

//To Perform Wrapper Class Sorting?
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection of Integer
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(Integer.valueOf(-44));
		al.add(Integer.valueOf(55));
		al.add(Integer.valueOf(33));
		al.add(Integer.valueOf(555));
		al.add(Integer.valueOf(0));
		
		Collections.sort(al);
		System.out.println("Integer class sorted objects are : "+al);
		
		
		
		//Collections of String
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add(String.valueOf("Java"));
		al1.add(String.valueOf("Developer"));
		al1.add(String.valueOf("Kubernate"));
		al1.add(String.valueOf("Nayan"));
		
		Collections.sort(al1);
		System.out.println("String Class Sorted Objects are : "+al1);
		
		
		//Collections of Double
		ArrayList<Double> al2 = new ArrayList<Double>();
		al2.add(Double.valueOf(342.43));
		al2.add(Double.valueOf(-0.0));
		al2.add(Double.valueOf(434.34));
		al2.add(Double.valueOf(-432.223));
		
		Collections.sort(al2);
		System.out.println("Double Class Sorted Objects are : "+al2);
		
		
		
		//Collections of Long 
		ArrayList<Long> al3 = new ArrayList<Long>();
		al3.add(Long.valueOf(24234234));
		al3.add(Long.valueOf(-4234234));
		al3.add(Long.valueOf(423423524));
		
		Collections.sort(al3);
		System.out.println("Logn Class Sorted objects are : "+al3);
	}

}