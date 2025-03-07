package day4;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        String s1= sc.nextLine();
        if(s1.contains(".com")||s1.contains(".org")||s1.contains(".in")) {
        	System.out.println("Valid email address");
        }
        else {
             System.out.println("Invalid email address");
        }
	}
}
