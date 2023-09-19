package program;

class Employees2{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//By toString()
//	@Override
//	public String toString() {
//		return "Employees [age=" + age + ", name=" + name + "]";
//	}
	
	
}
public class Encapsulation_pojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees2 e = new Employees2();
		e.setAge(22);
		e.setName("Nayan");
		
		//by object "e" call method by default
//		System.out.println(e);
		
		System.out.println("Employees Name is "+e.getName());
		System.out.println("Employees Age is "+e.getAge());
	}

}