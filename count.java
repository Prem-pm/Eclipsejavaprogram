
import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		boolean b[]=new boolean[n];
		 System.out.println();
		for(int i=0;i<n;i++){
			if(b[i]==true) {
				continue;}
				int count=1;
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						b[j]=true;
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
		 
		}

	}


