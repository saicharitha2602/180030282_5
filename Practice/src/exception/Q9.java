package exception;
import java.util.*;
public class Q9 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    try
    {
      int q=a/b;
      System.out.println("The quotient of "+a+" and "+b+" is "+q);
      System.out.println("Successful!");
    }
    catch(ArithmeticException e)
    {
      System.out.println("DivideByZeroException caught");
    }
    finally
    {
      System.out.println("Inside finally block");
    }
  }

}