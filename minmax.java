package day2;
import java.util.*;
public class minmax {
	
	
		public static void main(String[] args) {
		//	System.out.println("Hello World");
			Scanner sc =new Scanner(System.in);
			int n =sc.nextInt();
			int a[]= new int[n];
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
			for(int i=1;i<n;i++){
			    if(a[i]<min){
			        min=a[i];
			    }
			}
			System.out.println("the min value is:"+min);
				for(int i=1;i<n;i++){
			    if(a[i]>max){
			        max=a[i];
			    }
			}
			System.out.println("the max value is:"+max);
			
		}
	}


