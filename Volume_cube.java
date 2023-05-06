package program;
import java.util.*;

//write a program in java to calculate volume of cube?

class Cube  // user defined class
{
	int side,vol;
	Scanner sc = new Scanner(System.in);   //in-built class
	public void get()//method
	{
		System.out.println("enter side of cube ");
		side = sc.nextInt();
	}
	public void display()
	{
		vol=side*side*side;
		System.out.println("Volume of cube is " + vol);
	}
}


public class Volume_cube {

	public static void main(String[] args) {
		Cube obj = new Cube();                   //instantiation
		obj.get();
		obj.display();

	}

}