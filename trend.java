package day2;
import java.util.Scanner;
public class trend 
	{
		public static void main(String[] args) {
			//System.out.println("Hello World");
	         Scanner sc =new Scanner(System.in);
			int a =sc.nextInt();
			int b=a/10;
			int c=b%10;
			System.out.println(c);
			if(c%3==0){
			    System.out.println("Trendy number");
			}
			else{
			    System.out.println("not a trendy number");
			}
		}
	}


