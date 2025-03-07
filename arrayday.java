package day2;
import java.util.*;
public class arrayday {
	
	
		public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
		         int n =sc.nextInt();
		         int multiply=1;
	           int a[]=new int[n];
	          
	           for(int i=0;i<n;i++){
	             a[i]=sc.nextInt();
	}
	System.out.println();
	for(int i=0;i<n;i++){
	    System.out.println(a[i]+" ");

	//System.out.println();
	//1=1*2

	    multiply=multiply*a[i];
	}
	System.out.println();
	System.out.println("the product: "+multiply);
		}
	}

