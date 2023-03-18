package main;

import java.util.Scanner;

public class all {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter a five-digit number");
		int number = a.nextInt();
		int number1 = number/10000;
		int number2 = number%10000/1000;
		int number3 = number%10000%1000/100;
		int number4 = number%10000%1000%100/10;
		int number5 = number%10000%1000%100%10/1;
		
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5);
		
	}

}
