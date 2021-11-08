package MyPackage;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {

	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			Integer a, b;
			System.out.println("\033[1mCalculator\033[0m");
			System.out.println("A simple addition (type quit any moment to exit)");
			Scanner inputScan = new Scanner(System.in);
			try {
				System.out.print("Enter your first number: ");
				a = inputScan.nextInt();
				System.out.print("Enter your second number: ");
				b = inputScan.nextInt();
				System.out.println("Sum: " + add(a, b));
				
			} catch (Exception e) {
				System.out.println("That was not a number");
			}
			TimeUnit.SECONDS.sleep(10);
			
		}
	}
	
	private static int add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a + b);
	}

	

}
