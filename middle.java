package day4;

import java.util.Scanner;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
         // char ch[]= {'a','e','i','o','u'};
          //int count =0;
          String str1= sc.nextLine();
          int n = str1.length();
          if(n%2!=0) {
          int m = n/2;
          System.out.println(str1.charAt(m));
          }
          else {
        	  int o=n/2;
        	  int c= o-1;
        	  System.out.print(str1.charAt(o));
        	  System.out.print(str1.charAt(c));
          }
	}

}
