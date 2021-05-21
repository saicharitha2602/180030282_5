package polymorphism;

 class Fruit {

	String name,taste;
	int size;
	public void eat()
	{
		System.out.println("Fruit and its taste");
	}

}
 class Apple  extends Fruit
{
	public void eat()
	{
		System.out.println("Fruit is apple and taste is sweet");
	}
}
 class Orange extends Fruit
 {
	 public void eat()
	 {
		 System.out.println("Fruit is orange and taste is sour");
	 }
 }
 class Main
 {
	 public static void main(String args[])
	 {
		 Apple a=new Apple();
		 a.eat();
		 Orange o=new Orange();
		 o.eat();
	 }
 }