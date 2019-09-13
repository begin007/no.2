package jxz.jzva;

import java.util.Scanner;

public class FahreheitToCelsius {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input =new Scanner(System.in);
		 System.out.printf("Enter a degree in Fahrenheut:");
		 double fahrenheit=input.nextDouble();
		 double celsius=(5.0 / 9) * (fahrenheit - 32);
		 System.out.printf("Fahrenheit "+ fahrenheit + " is "+celsius+" in Celsius");
	}

}
