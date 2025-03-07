package day4;

import java.util.Scanner;

public class csk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        String s1= sc.nextLine();
      for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)==s1.charAt(i+2)&& s1.charAt(i+1)==s1.charAt(i+3)) {
                    System.out.println("win");
                    break;
        	}
        	else {
        		System.out.println("lose");
        		break;
        	}
	}
	}

}
//x=a.charAt(0);
//y=a.charAt(1);
//int flag=0;
//if(x==y)
//flag=1;
//else
	//for(int i=0;i<a.length;i++){
//if(i%2==0){
//if(x!=str.charAt(i)){
//flag=1;
//break;
//}
//}
//else if(y!==str.charAt(i)){
//flag=1;
//break;
//}
//}
//if(flag==0)sop(yes)
//else {sop(no)
//}}}