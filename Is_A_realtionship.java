package program;
import java.util.*;

//TO perform Is-a Relationship?

class Faculty{
	double salary=100000;
}

public class Is_A_realtionship extends Faculty {
	double bonus=2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Is_A_realtionship obj = new Is_A_realtionship();
		System.out.println("Salary is "+obj.salary);
		System.out.println("Bonus is "+obj.bonus);
	}

}