package day2;
import java.util.*;
public class zodiac
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Month: ");
	    int month =sc.nextInt();
	    System.out.println("Date: ");
	    int date =sc.nextInt();
	   // int b =a%10;
	   System.out.println("Your zodiac sign is:");
	  
	    if(month==1){
	        //System.out.println("A");
	        if(date>=1&&date<=19){
	            System.out.println("capicorn");
	        }
	        else if(date>=20&&date<=31){
	            System.out.println("Aquaris");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	    else if(month==2){
	        //System.out.println("B");
	          if(date>=1&&date<=18){
	            System.out.println("Aquaris");
	        }
	        else if(date>=19&&date<=29){
	            System.out.println("Pisces");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	        
	    }
	    else if(month==3){
	        //System.out.println("C");
	              if(date>=1&&date<=20){
	            System.out.println("Pisces");
	        }
	        else if(date>=21&&date<=29){
	            System.out.println("Aries");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	      else if(month==4){
	        //System.out.println("C");
	              if(date>=1&&date<=19){
	            System.out.println("Aries");
	        }
	        else if(date>=20&&date<=30){
	            System.out.println("Tauries");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	      else if(month==5){
	        //System.out.println("C");
	              if(date>=1&&date<=20){
	            System.out.println("Tauries");
	        }
	        else if(date>=20&&date<=31){
	            System.out.println("Gemini");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	      else if(month==6){
	        //System.out.println("C");
	              if(date>=1&&date<=21){
	            System.out.println("Gemini");
	        }
	        else if(date>=20&&date<=30){
	            System.out.println("Cancer");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	      else if(month==7){
	        //System.out.println("C");
	              if(date>=1&&date<=22){
	            System.out.println("Cancer");
	        }
	        else if(date>=20&&date<=30){
	            System.out.println("Leo");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	      else if(month==8){
	        //System.out.println("C");
	              if(date>=1&&date<=22){
	            System.out.println("Leo");
	        }
	        else if(date>=23&&date<=31){
	            System.out.println("Virgo");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	      else if(month==9){
	        //System.out.println("C");
	              if(date>=1&&date<=22){
	            System.out.println("Virgo");
	        }
	        else if(date>=23&&date<=30){
	            System.out.println("Libra");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	      else if(month==10){
	        //System.out.println("C");
	              if(date>=1&&date<=22){
	            System.out.println("Libra");
	        }
	        else if(date>=23&&date<=31){
	            System.out.println("Seorpia");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	    else if(month==11){
	        //System.out.println("C");
	              if(date>=1&&date<=22){
	            System.out.println("Seorpia");
	        }
	        else if(date>=23&&date<=30){
	            System.out.println("Sagattarius");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	    else if(month==12){
	        //System.out.println("C");
	              if(date>=1&&date<=22){
	            System.out.println("Sagattarius");
	        }
	        else if(date>=23&&date<=31){
	            System.out.println("capicorn");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	    else{
	        System.out.println("Invalid month");
	    }
	}
}