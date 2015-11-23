import java.util.Scanner;
public class Rootassign {
   public double squareroot(double sq1) {
      double sq2 = Math.sqrt(sq1);
	  return (sq2);
	  }
   public double cuberoot(double cube1) {
      double cube2 = Math.cbrt(cube1);
	  return (cube2);
	  }
public static void main(String[] args) {
   Scanner n = new Scanner(System.in);
   Rootassign root = new Rootassign();
   System.out.println("ENTER THE NUMBER TO FIND SQUARE ROOT:");
   double sq = n.nextDouble();
   double squarert = root.squareroot(sq);
   System.out.print("THE SQUAREROOT OF THE GIVEN NUMBER IS");
   System.out.println(squarert);
   System.out.println("ENTER THE NUMBER TO FIND CUBEROOT:");
   double cube = n.nextDouble();
   double cubert = root.cuberoot(cube);
   System.out.print("THE CUBEROOT OF THE GIVEN NUMBER IS");
   System.out.println(cubert);
  }
}