import java.util.Scanner;
public class ifelseassign {
   public static void main(String[] args) {
   System.out.println("*********PROGRAM TO CHECK WHETHER HE/SHE IS ELIGIBLE TO VOTE*********");
   Scanner s = new Scanner(System.in);
   String name,name1;
   int a;
   System.out.println("ENTER THE NAME:");
   name = s.next();
   System.out.println("ENTER THE AGE:");
   a = s.nextInt();
   if (a >= 18){
   name1 = name + " IS ELIGIBLE TO VOTE";  
   System.out.println(name1);
	}else {
     name1 = name + " IS NOT ELIGIBLE TO VOTE";
	 System.out.println(name1);
	 }
   }
}