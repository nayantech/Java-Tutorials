package program;

//To perform Array store Exception?

public class Array_Store_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Object a[] = new Double[10];
			a[0]=5;
		}
		catch(ArrayStoreException e) {
			System.out.println("Wrong Data Type "+e);
		}
	}

}