import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println(Character.toLowerCase(ch));
		}
		else
		{
			System.out.println(Character.toUpperCase(ch));
		}
	}

}
