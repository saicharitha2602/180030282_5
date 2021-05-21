package exception;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements in the array: ");
		try {
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
		
			System.out.println("Enter the index");

			int ind = sc.nextInt();
			System.out.println("The array element at index " + ind + " : " + arr[ind]);
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}

		catch(NumberFormatException num)
		{
			System.out.println("java.lang.NumberFormatException");
		}
	}

}
