package program;
import java.util.*;
public class Month {

	public static void main(String[] args) {
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Month Nubmer ");
		num=obj.nextInt();
		if(num == 1) {
			System.out.println("Month is January");
		}
		else if(num == 2) {
			System.out.println("Month is Feburary");
		}
		else if(num == 3) {
			System.out.println("Month is March");
		}
		else if(num == 4) {
			System.out.println("Month is Aprail");
		}
		else if(num == 5) {
			System.out.println("Month is May");
		}
		else if(num == 6) {
			System.out.println("Month is June");
		}
		else if(num == 7) {
			System.out.println("Month is July");
		}
		else if(num == 8) {
			System.out.println("Month is August");
		}
		else if(num == 9) {
			System.out.println("Month is September");
		}
		else if(num == 10) {
			System.out.println("Month is Octobar");
		}
		else if(num == 11) {
			System.out.println("Month is Novembar");
		}
		else if(num == 12) {
			System.out.println("Month is Decembar");
		}
		else {
			System.out.println("Invalid number for Month");
		}

	}

}