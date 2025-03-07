package day2;

import java.util.*;
public class ifelse
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =a+b+c;
		int e =a+b;
		int f =a+c;
		int g =b+c;
		if(d==180){
		    if(a==b&&a==c){
		        System.out.println("Prize 3");
		    }
		    else if(e==90&&f==90&&g==90){
		        System.out.println("prize 2");
		    }
		    else{
		        System.out.println("prize 1");
		    }
		    
		}
		else{
		    System.out.println("no prize");
		}
	}
}
