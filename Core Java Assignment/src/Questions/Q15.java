package Questions;

import java.util.Scanner;

public class Q15 implements Int15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c = 0;
		int operation;
		System.out.println("\n\033[1mQ15\033[0m");
		System.out.println("Enter A: ");
		try {
			a = getInput(sc);
			System.out.println("Enter B: ");
			b = getInput(sc);
			System.out.println("1) A + B\t2) A - B\n3) A * B\t4) A / B");
			operation = (int)getInput(sc);
			
	//		sc.close();
			
			switch(operation) {
			case 1:
				c = Int15.addition(a, b);
				break;
			case 2:
				c = Int15.substraction(a, b);
				break;
			case 3:
				c = Int15.multiplication(a, b);
				break;
			case 4:
				c = Int15.division(a, b);
				break;
			default:
				break;
			}
			System.out.println("Result: " + c);
	//		sc.close();
		} catch (Exception e) {
			System.out.println("That was not a number, continuing");
		}
	}
	static double getInput(Scanner sc) {
		return sc.nextDouble();
	}
}
