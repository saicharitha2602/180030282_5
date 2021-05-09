import java.util.Scanner;
class Q15
{
   public static void main(String args[])
   {
      int n, c, d;
      Scanner in = new Scanner(System.in);
      
      n = in.nextInt();
      
      for ( c = 1 ; c <= n ; c++ )
      {
         for ( d = 1 ; d <= c ; d++ )
           {
              System.out.print("*");
              
           }
          System.out.println();
      }
   }
}