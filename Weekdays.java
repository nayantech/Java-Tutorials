package program;
import java.util.*;
public class Weekdays {

	public static void main(String[] args) {
		int day;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Day Number");
		day=obj.nextInt();
		if(day  ==  1) {
			System.out.println("today is monday");
		}
		else if(day == 2) {
			System.out.println("today is tuesday");
		}
		else if(day == 3) {
			System.out.println("today is Wednesday");
		}
		else if(day == 4) {
			System.out.println("today is thursday");
		}
		else if(day == 5) {
			System.out.println("today is friday");
		}
		else if(day == 6) {
			System.out.println("today is saturday");
		}
		else if(day == 7) {
			System.out.println("today is sunday");
		}
		else {
			System.out.println("invalid weekday number (: ");
		}

	}

}