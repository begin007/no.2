package jxz;
import java.util.Scanner;
public class ComputeTax
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter weight in kg:");
		double weight=input.nextDouble();
		System.out.println("Enter height in M:");
		double height=input.nextDouble();
		final double KIl_per_pou=0.45359237;
		final double M=0.0254;
		double weightIntKilograms=weight;
		double heightInMetrts=height;
		double bmi=weightIntKilograms/(heightInMetrts*heightInMetrts);
		System.out.println("BMI is" + bmi);
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi<25)
			System.out.println("Normal");
		else if(bmi>30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
