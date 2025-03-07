package day2;
import java.util.*;
public class lucas {
	
		public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  int a=0,b=0,c=1,d;
		  int len =sc.nextInt();
		  for(int i=0;i<len;i++){
		      d=a+b+c;
		      System.out.print(a+" ");
	                   int temp=a;
	         	      a=b;
		      b=c;
		      c=d;
		      d=temp;
		  }
		  }
		
	}


