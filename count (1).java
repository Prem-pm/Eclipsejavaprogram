package day4;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc =new Scanner(System.in);
         // char ch[]= {'a','e','i','o','u'};
          int count =0;
          String str1= sc.nextLine();
          String s1= str1.toLowerCase();
          for(int i=0;i<s1.length();i++) {
        	  if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') 
        		// count+=s1;
        		  count++;
        	  
        	  
          }
          System.out.println(count);
	}

}
