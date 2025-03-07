package logesstellarday3;

import java.util.Scanner;

public class twod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a[][]= new int[n][n];
	 int sum=0,bot =0;
		for(int i=0;i<n;i++){
			for(int j =0;j<n;j++) {
		
		    a[i][j]=sc.nextInt();
	}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			//for(int j=i;j<n;j++) {
				if(i==j||i<j) {
					sum+=a[i][j];
				}
			}
			
		}
		System.out.println(sum);
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
			//	if(a[i]==a[j]&&a[i]<a[j]) {
					bot+=a[i][j];
				//}
			}
			
		}
		System.out.println(bot);

}
}
