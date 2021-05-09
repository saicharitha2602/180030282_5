import java.util.Scanner;
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		while(i<=num)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
