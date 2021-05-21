package exception;
public class Q4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  try
  {
    int sum=0;
    for(int i=0;i<args.length;i++)
    {
      sum=sum+(Integer.parseInt(args[i]));
    }
    int avg=sum/5;
  }
  catch(ArithmeticException e)
  {
    System.out.println("ArithmeticException....");
  }
  catch(NumberFormatException e1)
  {
    System.out.println("NumberFormatException...");
  }
  }

}