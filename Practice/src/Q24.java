import java.util.*;
public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,0,-25,50,3749,347};
		Arrays.sort(a);
		System.out.println("1st Largest: "+a[a.length-1]);
		System.out.println("2nd Largest: "+a[a.length-2]);
		System.out.println("1st Smallest: "+a[0]);
		System.out.println("2nd smallest: "+a[1]);
	}

}
