//package program;
//import java.util.*;
//  Nayan bhai ya sir abhi sepetember me karenga nayan se
////To perform Comparable Program?
//
//class Studentss implements Comparable<Studentss>
//{
//	int rno,age;
//	String name;
//	Studentss(int rno, String name, int age){
//		this.rno=rno;
//		this.name=name;
//		this.age=age;
//	}
////	public int getRno(int rno) {
////		return rno;
////	}
////	public int getAge(int age)
////	{
////		return age;
////	}
////	public String getName(String name)
////	{
////		return name;
////	}
//	
//	public String toString() {
//		return "Students4 [rno=" + rno + ", age=" + age + ", name=" + name + "]";
//	}
//	
//	
//	public int compareTo(Studentss st) {
//		return(this.age-st.age);   //here we write age so that's why sorting done by age
//	}
//}
//
//public class Comaratable_Program {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Studentss s[] = new Studentss[3];
//		s[0]=new Studentss(1,"Nayan",23);
//		s[1]=new Studentss(2,"Kushboo",44);
//		s[2]=new Studentss(3,"armstrong",3);
//		Arrays.sort(s);
//		System.out.println("Sorted Objects of Students Are : "+Arrays.toString(s));
//	}
//
//
//}