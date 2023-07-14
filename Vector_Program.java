package program;
import java.util.*;


//To perform Vector Class And Method Functions?

public class Vector_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(123);
		v.addElement(234);
		v.addElement(675);
		v.addElement(876);
		System.out.println("Size Of Vector "+v.size());
		v.insertElementAt(500,3);
		v.removeElementAt(2);
		v.removeElement(675);
		System.out.println("First Element Method is "+v.firstElement());
		System.out.println("Last Element Method is "+v.lastElement());
		System.out.println("ElementAt Method is "+v.elementAt(2));
		System.out.println("Element container Method is "+v.contains(123));
		System.out.println("Vector Elements are");
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		Vector <Integer> ve = new Vector<Integer>();
		ve.addElement(232);
		
		
		
//		System.out.println("Coping Method is "+v.copyInto(ve));
		
		System.out.println("Size of Vector v2 is "+ve.size());
		System.out.println(v.equals(ve));

	}

}