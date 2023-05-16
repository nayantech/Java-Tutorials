package program;
import java.util.*;
//Write a program in java to perform to display the array element in matrix format and sum matrix and average matrix?

public class AddAvgMultiDimensional {

	public static void main(String[] args) {
		int i,j,m,n;
		
		float avg,sum=0;
		int a[][] = new int[50][50];
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
		avg=sum/(m*n);
		System.out.println("Sum of Matrix is : " +sum);
		System.out.println("Avg of Matrix is : " +avg);
	
	}

}