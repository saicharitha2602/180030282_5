import java.util.Scanner;
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int sum=0,c=0;
		for(int i:a)
		{
			sum+=i;
			c++;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+sum/c);

	}

}
