package program;
import java.util.*;

//to calculate Volume of sphere and take input from user?
class Sphere{
	int r;
	double vol;

	Scanner sc = new Scanner(System.in);
	public void get(){
		{
			System.out.println("Enter Volume of Sphere radius is : ");
			r = sc.nextInt();

			
		}
		
		
	}
	
	public void display()
	{
		vol=1.333*3.14*r*r*r;
		System.out.println("Volume of Sphere Is: " + vol);
	}
}


public class Volume_sphere {

	public static void main(String[] args) {
		
		Sphere obj = new Sphere();  
		obj.get();
		obj.display();

	}

}
