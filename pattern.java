package day4;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }		    
		    for(int j=1;j<=i;j++) {
		    	System.out.print(i +" ");
		} System.out.println();
	}
	}
}


