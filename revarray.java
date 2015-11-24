import java.util.Scanner;
public class revarray {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.println("ENTER THE NO OF ELMENTS OF AN ARRAY:");
	int n = input.nextInt();
	System.out.println("ENTER THE ELMENTS OF AN ARRAY:");
	int data[] = new int[10];
	int i;
	for(i=0;i<n;i++)
	{
	 data[i] = input.nextInt();
	 //System.out.print(" ");
     }
	System.out.println("THE GIVEN ELMENTS OF AN ARRAY:");
    for(i=0;i<n;i++)
	{
	 System.out.print(data[i]);
	 System.out.print(" ");
	}
	System.out.println(" " );
	System.out.println("REVERSE OF AN ARRAY:");
    for(i = n-1;i >= 0;i--)
	{
	System.out.print(data[i]);	
	System.out.print(" ");
	}
  }
}   