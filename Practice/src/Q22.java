import java.util.Scanner;
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,4,34,56,7};
		int key=sc.nextInt();
		int flag=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				flag=i;
				break;
			}
		}
		System.out.println(flag);
	}

}
