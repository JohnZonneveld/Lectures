package Questions;

public class Q6 {

	public static void isEven(int x) {
		// use bitwise & to see if the least significant bit of the value of x a '1' or a '0'
		int lsb = x & 1;
		System.out.print("\n\033[1mQ7 the input \033[0m"+ x + "\033[0m is \033[0m");
		if (lsb == 1) {
			System.out.println("\033[1mOdd\033[0m");
		} else {
			System.out.println("\033[1mEven\033[0m");
		}
	}

}
