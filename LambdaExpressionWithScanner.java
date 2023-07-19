package program;
import java.util.*;

//Lambda Expression taking user input with two parameter?

interface Additionn{
	abstract public  void add(int a,int b);
}
interface Subtractionn{
	abstract public  void sub(int a, int b);
}
interface Multiplication{
	abstract public  void mul(int a, int b);
}
interface Division{
	abstract public  void div(int a, int b);
}
interface Modulus{
	abstract public  void mod(int a, int b);
}
public class LambdaExpressionWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Two Number ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		Additionn a=(n1,n2)->{
			System.out.println("Addition is "+(n1+n2));
		};
		a.add(num1,num2);
		Subtractionn sb=(n1,n2)->{
			System.out.println("Subtraction is "+(n1-n2));
		};
		sb.sub(num1, num2);
		Multiplication m=(n1,n2)->{
			System.out.println("Multiplication is "+(n1*n2));
		};
		m.mul(num1, num2);
		Division d=(n1,n2)->{
			System.out.println("Division is "+(n1/n2));
		};
		d.div(num1, num2);
		Modulus md = (n1,n2)->{
			System.out.println("Modulus is "+(n1%n2));
		};
		md.mod(num1,num2);
	}

}