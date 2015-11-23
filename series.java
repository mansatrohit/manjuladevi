public class series{
   public static void main(String[] args){
   int i,j,k;
   System.out.println("SERIES OF NUMBER");
   i = 1;  
   do {
	   //for(i=1;i<=5;i++) 
	    for(j=1;j<=i;j++)
		 {
		  System.out.print(j);
		 }
		 i = i + 1;
         System.out.println(" "); 
      } while(i!=5); 
   if(i==5){	  
    do {
        for(k=1;k<=i;k++)
	   {
	    System.out.print(k);
	   }
	     i--;
		 System.out.println("");
	   } while(i!=0);
     }  
   System.out.println("");	   
   }
}
   
   