import java.util.Scanner;
public class insert_element {
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
     }
	System.out.println("THE GIVEN ELMENTS OF AN ARRAY:");
    for(i=0;i<n;i++)
	{
	 System.out.print(data[i]);
	 System.out.print(" ");
	}
	System.out.println();
	System.out.println("ENTER THE ELMENT TO BE INSERTED IN AN ARRAY:");
	int val = input.nextInt();
	System.out.println("ENTER THE POSITION TO BE INSERTED IN AN ARRAY:");
	int m = input.nextInt();
	i = n;
	do {
	data[i] = data[i-1];
	i = i-1;
	} while(i>=m);
	data[m-1] = val;
	System.out.println("THE ELMENTS OF AN ARRAY AFTER INSERTION:");
	for(i=0;i<=n;i++)
	{
	System.out.print(data[i]);
	System.out.print(" ");
	}
  }
}   
	