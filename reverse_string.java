import java.util.*;
public class reverse_string {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	String str,reverse="";
	System.out.print("ENTER THE STRING TO BE REVERSED:");
	str = input.nextLine();
	System.out.println("THE LENGTH OF THE GIVEN STRING IS:" + str.length());
	int n = str.length();
	System.out.println("THE STRING ENTERED IS:");
	System.out.println(str);
	System.out.println("THE LENGTH OF THE STRING IS:" +n);
	for(int i = n-1 ; i>=0 ; i--)
	{
	 reverse = reverse + str.charAt(i);	
	} 
	System.out.println("THE REVERSE OF THE STRING IS:" +reverse);
 }
}