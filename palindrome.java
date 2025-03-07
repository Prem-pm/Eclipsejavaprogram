package day4;

import java.util.Scanner;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
          String s= sc.nextLine();
          String str1=new StringBuffer(s).reverse().toString();
          //s1.reverse();
          if(s.equalsIgnoreCase(str1)) {
        	  System.out.println("Palidrome");
        	  
          }
          else {
        	  System.out.println("not palindrome");
          }
	}

}
