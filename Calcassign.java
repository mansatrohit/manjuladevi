import java.util.Scanner;
public class Calcassign {
   public static void main(String[] args) {
      int a,b,Result;
	  String x;
	  System.out.print("ENTER THE VALUES OF a AND b:");
      Scanner input =new Scanner(System.in);
      a = input.nextInt();
      b = input.nextInt();
	  System.out.print("ENTER THE EXPECTED OPERATION TO BE DONE:");
	  x = input.next();
	  System.out.println("THE GIVEN FIRST NUMBER IS:" + a);
	  System.out.println("THE GIVEN SECOND NUMBER IS:" + b);
	  switch (x) {
	  case "+" :
	        Result = a + b;
            System.out.println("THE GIVEN OPERATION IS: +");
			System.out.println("THE SUM OF GIVEN NUMBERS ARE:" + Result);
			break;
	  case "-" :
	        Result = a - b;
			System.out.println("THE GIVEN OPERATION IS: -");
			System.out.println("THE DIFFERENCE OF GIVEN NUMBERS ARE:" + Result);
			break;
      case "/" :
	        Result = a / b;
			System.out.println("THE GIVEN OPERATION IS: /");
			System.out.println("THE QUOTIENT OF GIVEN NUMBERS ARE:" + Result);
			break;
	  case "*" :
	        Result = a * b;
			System.out.println("THE GIVEN OPERATION IS: *");
			System.out.println("THE PRODUCT OF GIVEN NUMBERS ARE:" + Result);
			break;
	  case "%" :
	        Result = a % b;
			System.out.println("THE GIVEN OPERATION IS: %");
			System.out.println("THE REMINDER OF THE GIVEN NUMBERS ARE:" + Result);
			break;
	  default :
	        System.out.println("THE GIVEN OPERATION IS NOT VALID");
			break;
	 }
   }
}	