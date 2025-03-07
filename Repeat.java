package logesstellarday3;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		boolean b[]=new boolean[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(b[i]==true) {
				continue;
			}
			if(arr[i]==arr[j]) {
				b[i]=true;
				System.out.println(a[i]);
			}
		}
	}
	}

}
