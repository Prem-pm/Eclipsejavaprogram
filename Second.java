package logesstellarday3;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= new int[n];
		//int b[]=new int[n];
		int min=0;
		int max=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    //System.out.println();
		}
		 System.out.println();
		for(int i=0;i<n;i++){
		    System.out.println(a[i]+" ");
		}
		min=a[0];
		max=a[0];
		for(int i=0;i<n;i++){
		    if(a[i]>min){
		    	max=min;
		        min=a[i];
		        //b[i]=min;
		    }
		}
		System.out.println("the min value is:"+max);
		

	}

}
