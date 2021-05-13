package classandobjects;
import java.lang.*;
import java.util.*;
class Calculator
{
	static int powerInt(int num1,int num2)
	{
		return (int) Math.pow((int)num1, num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double num3=sc.nextDouble();
		int num4=sc.nextInt();
		System.out.println("Integer values : "+Calculator.powerInt(num1,num2));
		System.out.println("Integer and double values : "+Calculator.powerDouble(num3,num4));
	}

}
