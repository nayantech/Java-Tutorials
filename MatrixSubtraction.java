package program;
import java.util.*;


//Write a program in java to perform multiplication of two matrix?
class Subtraction{
	
	int a[][] = new int[10][10];
	int b[][] = new int[10][10];
	int c[][] = new int[10][10];
	
	int i,j,m,n,p,q;
	Scanner obj = new Scanner(System.in);
	public void get() {
		System.out.println("Enter order of matrix a");
		m=obj.nextInt();
		n=obj.nextInt();
		System.out.println("Enter element in matrix a");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				a[i][j] = obj.nextInt();
				}
		}
		System.out.println("Enter order of matrix b");
		p=obj.nextInt();
		q=obj.nextInt();
		System.out.println("Enter element of matrix b");
		for(i=0;i<p;i++) {
			
			for(j=0;j<q;j++) {
				b[i][j] = obj.nextInt();
			}
		}
		
		System.out.println("Element of matrix  a as follow ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Element of matrix b as follow ");
		for(i=0;i<p;i++) {
			for(j=0;j<q;j++) {
				System.out.print(" " + b[i][j]);
			}
			System.out.println( );
		}
	}
	
	public void calculate () {
 		if(m==p && n==q) {
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					c[i][j] = 0;
				}
			}
			
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					c[i][j] = c[i][j] + a[i][j] - b[i][j];
				}
			}
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					System.out.print(" " + c[i][j]);
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("Matrix order are not equal :(");
		}
		
		
		
	}
	
}




public class MatrixSubtraction {

	public static void main(String[] args) {
		Subtraction sub = new Subtraction();
		sub.get();
		sub.calculate();
	}

}