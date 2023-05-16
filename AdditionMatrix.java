package program;
import java.util.*;


// Write a program to display and to perform addition of two matrix?
class Addition{
	int a[][] = new int[10][10];
	int b[][] = new int[10][10];
	int c[][] = new int[10][10];
	int m,n,p,q,i,j;
	Scanner obj = new Scanner(System.in);
	public void get() {
		System.out.println("Enter order of matrix a ");
		m=obj.nextInt();
		n=obj.nextInt();
		System.out.println("Enter elements in matrix a ");
		for(i=0;i<m; i++) {
			for(j=0;j<n;j++) {
				a[i][j] = obj.nextInt();
			}
		}
		
		System.out.println("Enter order of matrix b ");
		p=obj.nextInt();
		q=obj.nextInt();
		System.out.println("Enter elements in matrix b ");
		for(i=0;i<p;i++) {
			for(j=0;j<q;j++) {
				b[i][j] = obj.nextInt();
			}
		}
		System.out.println("Elements of matrix a are as follow ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Elements of matrix b are as follow");
		for(i=0;i<p;i++) {
			for(j=0;j<q;j++) {
				System.out.print(" " +b[i][j]);
			}
			System.out.println();
		}
		}
	public void calculate() {
		if(m==p && n==q) {
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					c[i][j] = 0;
				}
			}
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					c[i][j]=c[i][j] + a[i][j] + b[i][j];
				}
			}
			System.out.println("Matrix Addition is ");
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					System.out.print( " " +c[i][j]);
//					System.out.println();
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Matrix order are not equal");
		}
	}
 }

public class AdditionMatrix {

	public static void main(String[] args) {
		Addition add =new Addition();
		add.get();
		add.calculate();
	}

}