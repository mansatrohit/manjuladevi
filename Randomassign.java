import java.util.Scanner;
public class Randomassign {
   public static void main(String[] args) {
      int x;
	  System.out.println("ENTER THE NUMBER TO FIND RANDOM NUMBER:");
	  Scanner input = new Scanner(System.in);
	  x = input.nextInt();
	  int rand = (int)(Math.random()*(x-1));
	  System.out.println("THE GIVEN NUMBER IS :" + x);
	  System.out.print("THE RANDOM VALUE OF GIVEN NUMBER IS:" + rand);
   }
 }