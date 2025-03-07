package day2;
import java.util.*;
public class days {
	//public class days
	
		public static void main(String[] args) {
			//System.out.println("Hello World");
			Scanner sc =new Scanner(System.in);
			int y =sc.nextInt();
			int g_y=1900;
			int ry=0;
			int ly =0;
			y=(y-1)-g_y;//(2024-1)-1900=123
			ly=y/4;//123/4=30
			ry=y-ly;//123-30=97
			int totaldays=(ry*365)+(ly*364)+1;//(97*365)+(30*364)+1=
			int days=totaldays%7;
			if(days==0){
			    System.out.println("Sunday");
			}
			if(days==1){
			    System.out.println("monday");
			}
			if(days==2){
			    System.out.println("tuesday");
			}
			if(days==3){
			    System.out.println("Wednesday");
			}
			if(days==4){
			    System.out.println("thursday");
			}
			if(days==5){
			    System.out.println("friday");
			}
			if(days==6){
			    System.out.println("saturday");
			}
		}
	
}
