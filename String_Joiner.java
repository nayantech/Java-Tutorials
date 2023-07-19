package program;
import java.util.*;

//To perform String Joiner?

public class String_Joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner("@ ","[","]");
		sj.add("Nayan");
		sj.add("Satyam");
		sj.add("Shiv");
		sj.add("ShivShankar");
		sj.add("Paravind");
		
		System.out.println("Elements are "+sj);
	}

}