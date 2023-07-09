package program;

//To perform Number Formate Exception?

public class Number_Formate_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt("Java");
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

}