package program;

//To perform Lambda Expressions?

@FunctionalInterface
interface Drawable{
	abstract public void draw();
}
public class Lambda_Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=()->
		{
			System.out.println("Drawing Shape");
		};
		d.draw();
	}

}