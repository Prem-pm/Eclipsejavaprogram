package logesstellarday3;

import java.util.Scanner;

public class hw {
	public static void main(String[] args) {
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
	for(int i=0;i<n;i++){
		for(int j =0;j<n;j++) {
			System.out.print(a[i][j]+ " ");
			//if(a[i][j-1])
	    
}
		System.out.println();
	}
}

}
