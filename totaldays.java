import java.util.Scanner;
public class totaldays {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("*******PROGRAM TO SHOW TOTAL NO OF DAYS IN GIVEN MONTH********");
   String month;
   System.out.print("ENTER THE MONTH:");
   month = s.next();
   switch (month) {
   case "JANUARY" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 31");
		 break;
   case "FEBRUARY" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 28");
		 break;
   case "MARCH" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 31");
		 break;
   case "APRIL" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 30");
		 break;
   case "MAY" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 31");
		 break;
   case "JUNE" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 30");
		 break;		
   case "JULY" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 31");
		 break;		 
   case "AUGUST" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 31");
		 break;
   case "SEPTEMBER" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 30");
		 break;		 
   case "OCTOBER" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 31");
		 break;
   case "NOVEMBER" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 30");
		 break;	
   case "DECEMBER" :
         System.out.print(month);
         System.out.println(": TOTAL NO OF DAYS IS 31");
		 break;
   default :
         System.out.println("ENTERED INVALID OPTION");
         break;		 
	}
   }
 }  