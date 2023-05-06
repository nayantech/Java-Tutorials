package program;
import java.util.*;

class Cone{
	int r,h;
	double vol;

	Scanner sc = new Scanner(System.in);
	public void get(){
		{
			System.out.println("Enter Volume of Cone radius is : ");
			r = sc.nextInt();
			System.out.println("Enter Volume of Cone Height is : ");
			h = sc.nextInt();

			
		}
		
		
	}
	
	public void display()
	{
		vol=0.333*3.14*r*r*h;
		System.out.println("Volume of Cone Is: " + vol);
	}
}


public class Volume_cone {

	public static void main(String[] args) {
		
		Cone obj = new Cone();  
		obj.get();
		obj.display();

	}

}
