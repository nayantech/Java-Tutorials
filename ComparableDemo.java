package program;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students2 implements Comparable<Students2>{
	int age;
	String name;
	public Students2(int age, String name) {
		this.age=age;
		this.name=name;
		
	}
//	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}
	public int compareTo(Students2 that) {
		if(this.age>that.age)
			return 1;
		else 
			return -1;
	}
}


public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students2> obj=new ArrayList<Students2>();
		obj.add(new Students2 (22,"Nayan"));
		obj.add(new Students2 (21,"Ramesh"));
		Comparator<Students2> c = new Comparator<Students2>()
		{
			public int compare(Students2 i, Students2 j) {
		
			if(i.age>j.age) 
				return 1;
				else
					return -1;
			
		}
	};
	
	Collections.sort(obj,c);
	System.out.println(obj);

}
}