package program;
import java.util.*;

// To perform ToString()


class QuastechStudents{
	
	String name;
	int rno,std;
	QuastechStudents(String na,int rn, int st)
	{
		name = na;
		rno = rn;
		std = st;
		
	}
	public String toString() {
		return(name + " " + rno + " " + std);
	}
}

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Demonstration of to String() method ");
		QuastechStudents s1 = new QuastechStudents("Rakesh" , 3 ,12);
		System.out.println(s1);
		QuastechStudents s2 = new QuastechStudents("Nayan" , 07 , 15);
		System.out.println(s2);
				
	}

}