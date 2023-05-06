package program;
import java.util.*;


//write to find out volume of cyclinder by taking user input and showon on output

class Cylinder{
	int r,h;
	double vol;
	double pi=3.14;
	Scanner sc = new Scanner(System.in);
	public void get(){
		{
			System.out.println("Enter Volumne of Cylinder radius is : ");
			r = sc.nextInt();
			System.out.println("Enter Volumne of Cylinder height is : ");
			h = sc.nextInt();
			
		}
		
		
	}
	
	public void display()
	{
		vol=pi*r*r*h;
		System.out.println("Volume of Cylinder Is: " + vol);
	}
}




public class Volume_cylinder {

	public static void main(String[] args) {
		
		
			Cylinder obj = new Cylinder();  //instantialtion
			obj.get();
			obj.display();

		
		
		
	}

}