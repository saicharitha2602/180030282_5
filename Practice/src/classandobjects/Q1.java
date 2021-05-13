package classandobjects;

import java.util.Scanner;

class Box
{
	int length;
	int width;
	int height;
	Box(int length,int height,int width)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	int volume()
	{
		return length*width*height;
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int width=sc.nextInt();
		int height=sc.nextInt();
		Box b=new Box(length,height,width);
		System.out.println("The volume is : "+b.volume());

	}

}
