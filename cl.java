package day4;

import java.util.Scanner;

public class cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        String s1= sc.nextLine();
         //String s2=s1.charAt(0);
         //s2.toUpperCase();
         for(int i=0;i<s1.length();i++) {
        	 if(s1.substring(i, i+1).equals(" ")) {
        		s1= s1.replace(s1.substring(i+1,i+2),s1.substring(i+1,i+2).toUpperCase());
        		//s1=s1.charAt(0).toUpperCase();
        		String s2=s1.replace(" ","");
        		
        		 System.out.println(s2);
        	 }
         }
	}

}
