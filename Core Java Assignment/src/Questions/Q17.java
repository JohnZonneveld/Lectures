package Questions;

import java.util.Scanner;

public class Q17 {

	public static void Interest() {
		double princip, rate = 0;
		int years = 0;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n\033[1mQ17\033[0m");
			System.out.println("Enter principal amount: ");
			princip = scanner.nextDouble();
			System.out.println("Enter interest rate: ");
			rate = scanner.nextDouble();
			System.out.println("Enter period in whole years");
			years = scanner.nextInt();
			System.out.print("The total generated interest would be:\n");
			System.out.printf("%.2f", princip * rate/100 * years);
//		scanner.close();
		} catch (Exception e) {
			System.out.println("That was not a number");
		}

	}

}
