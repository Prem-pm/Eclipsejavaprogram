package logesstellarday3;

import java.util.Scanner;

public class sumrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner sc =new Scanner(System.in);
				int n =sc.nextInt();
				int a[][]= new int[n][n];
			// int sum=0,bot =0;
				for(int i=0;i<n;i++){
					for(int j =0;j<n;j++) {
				
				    a[i][j]=sc.nextInt();
			}
					System.out.println();
				}
				for(int j=0;j<n;j++) {
					int sum=0;
					for(int i=0;i<n;i++) {
						
						sum+=a[i][j];
						
					}
					System.out.println("sum of column"+ " "+(j+1)+":"+sum);
				}
				for(int i=0;i<n;i++) {
					int row=0;
					for(int j=0;j<n;j++) {
						
						row+=a[i][j];
						
					}
					System.out.println("Sum of row " +(i+1)+":"+row);
				}


	}

}
