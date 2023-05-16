package program;
import java.util.*;

//Write a program in java to display of element of matrix transpose ?
public class TransposeMatrix {

	public static void main(String[] args) {
		int i,j,m,n;
		
		float avg,sum=0;
		int a[][] = new int[50][50];
		int b[][] = new int[50][50];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter order of matrix a ");
		m=s.nextInt();
		n=s.nextInt();
		System.out.println("Enter elements in matrix");
		for(i=0;i<m;i++) {  //for rows
			for(j=0;j<n;j++) {  //for columns
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Elements of matrix a are as follows");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				sum=sum+a[i][j];
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				b[j][i] = a[i][j];
			}
			
		}
		System.out.println("Elements of matrix b are as follows");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print( " " + b[i][j]);
			}
			System.out.println();
		}
	
	}

}