public class primenumbers {
   public static void main(String[] args) {
   System.out.println("*********PRIME NUMBERS*********");
   int i,j,prime;
   for(i=1;i<=100;i++)
   { 
     prime = 1;
     for(j=1;j<=i;j++)
	 {
	   if(i%j==0 & j!=1 & j!=i){
		   prime = 0;
	   }
	  }
	   if(prime==1)
		   System.out.print(i +" ");
	  }
     }
   }   
 