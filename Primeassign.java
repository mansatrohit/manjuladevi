import java.util.Scanner;
public class Primeassign {
   public int prime(int x) {
      int i,flag = 0;
	  for(i=2;i<x;i++) 
	  {
	   if(x%i==0 & i!=1 & i!=x)
	    flag = 1;
	   }
	  return(flag);
	  }
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   Primeassign obj = new Primeassign();
   System.out.println("ENTER THE NUMBER TO FIND PRIME OR NOT:");
   int a = input.nextInt();
   int result = obj.prime(a);
   System.out.println("THE GIVEN NUMBER IS:" + a);
   if(result==0) 
   {
    System.out.print("THE GIVEN NUMBER IS PRIME");
   }
   else
    System.out.print("THE GIVEN NUMBER IS NOT PRIME");
  }
}
		