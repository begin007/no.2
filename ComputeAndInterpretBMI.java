package jxz;
import java.util.Scanner;
public class ComputeAndInterpretBMI
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double weight=input.nextDouble();
		System.out.println("Enter height in inches:");
		double height=input.nextDouble();
		final double KIl_per_pou=0.45359237;
		final double M=0.0254;
		double weightIntKilograms=weight*KIl_per_pou;
		double heightInMetrts=height*M;
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
