package jxz.jzva;

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input =new Scanner(System.in);
		 System.out.printf("Enter an integer for second");
		 int seconds=input.nextInt();
		 int minutes =seconds/60;
		 int remainingseconds=seconds%60;
		 System.out.printf(seconds+"seconds is"+minutes+"minutes and"+remainingseconds+" seconds");
	}

}
