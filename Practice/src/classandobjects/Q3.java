package classandobjects;

import java.util.Scanner;

class Patient
{
	String patientName;
	double height;
	double weight;
	Patient(String patientName,double height,double weight)
	{
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
	}
	double computeBMI()
	{
		return weight/(height*height);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String patientName=sc.nextLine();
		double  weight=sc.nextDouble();
		double height=sc.nextDouble();
		Patient p=new Patient(patientName,height,weight);
		System.out.println("BMI of given patient is : "+p.computeBMI());
	}

}
