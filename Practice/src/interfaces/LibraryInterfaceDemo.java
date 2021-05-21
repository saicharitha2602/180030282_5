package interfaces;

import java.util.Scanner;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
}
class KidUsers implements LibraryUser
{
	int age;
	String bookType;

	public KidUsers(int age, String book) {
		// TODO Auto-generated constructor stub
		this.age=age;
		bookType=book;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equals("Kids"))
		{
			System.out.println("“Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}
class AdultUsers implements LibraryUser
{
	int age;
	String bookType;
	public AdultUsers(int age, String book) {
		// TODO Auto-generated constructor stub
		this.age=age;
		bookType=book;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
}
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age1=sc.nextInt();
		String book1=sc.next();
		KidUsers k=new KidUsers(age1,book1);
		k.registerAccount();
		k.requestBook();
		int age2=sc.nextInt();
		String book2=sc.next();
		AdultUsers a=new AdultUsers(age2,book2);
		a.registerAccount();
		a.requestBook();

	}

}
