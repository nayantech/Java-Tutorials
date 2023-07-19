package program;

//To perform Dafault And Static?

interface MyInterface{
	default void display() {
		System.out.println("Interface Default Method ");
	}
	public static void show() {
		System.out.println("Interface Static Method ");
	}
}

public class DefaultAndStatic implements MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface.show();
		MyInterface ref = new DefaultAndStatic();
		ref.display();
	}

}