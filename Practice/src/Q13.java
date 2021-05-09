import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i <100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     System.out.println(i+" ");
		  }	
	       }	
	       

	}

}
