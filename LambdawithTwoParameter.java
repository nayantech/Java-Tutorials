package program;

//Lambda Expression using Two Parameter?

@FunctionalInterface

interface Arithematic{
	abstract public void add(int a, int b);
}
public class LambdawithTwoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithematic ref =(n1,n2)->
		{
			System.out.println("Addition is "+(n1+n2));
		};
		ref.add(2,2);
	}

}