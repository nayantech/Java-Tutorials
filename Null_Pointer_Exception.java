package program;

//To perform Null Pointer Exception?

public class Null_Pointer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str=null;
			System.out.println("Length of String is "+str.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}