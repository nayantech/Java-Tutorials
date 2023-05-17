package program;


//Write a program in java to perform multiplication of two matrix?
import java.util.Scanner;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int c[][] = new int[10][10];
		int i,m,n,p,q,j,k;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter order of matrix a");
		m=obj.nextInt();
		n=obj.nextInt();
		System.out.println("Enter elements in matrix a");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				a[i][j] = obj.nextInt();
			}
		}
		
		System.out.println("Enter ordre of matrix b");
		p=obj.nextInt();
		q=obj.nextInt();
		System.out.println("Enter elements in matrix b");
		for(j=0;j<p;j++) {
			for(k=0;k<q;k++) {
				b[j][k] = obj.nextInt();
			}
		}
		
		System.out.println("Element of matrix a as follow");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();

		}
		
		System.out.println("Element of matrix b as follow");
		for(j=0;j<p;j++) {
			for(k=0;k<q;k++) {
				System.out.print(" " + b[j][k]);
			}
			System.out.println();
		}
		
		System.out.println("Multiplication of a and b matrix are as  : ");
		if(n==p) {
			for(i=0;i<m;i++) {
				for(k=0;k<q;k++) {
					c[i][k] = 0;
				}
			}
			for(i=0;i<m;i++) {
				for(j=0;j<p;j++) {
					for(k=0;k<q;k++) {
						c[i][k]= c[i][k] + a[i][j]*b[j][k];
					}
				}
			}
			System.out.println("Matrix multiplication is :");
			for(i=0;i<m;i++) {
				for(k=0;k<q;k++) {
					System.out.print(" " + c[i][k]);
				}
				System.out.println();
			}
		}
		
	}

}