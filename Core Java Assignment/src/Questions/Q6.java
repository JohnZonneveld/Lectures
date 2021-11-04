package Questions;

public class Q6 {

	public static void isEven(int x) {
		int lsb = x & 1;
		boolean b = (lsb == 1);
		System.out.print("\033[1mQ7 the input \033[0m"+ x + "\033[0m is \033[0m");
		if (b) {
			System.out.println("\033[1mOdd\033[0m");
		} else {
			System.out.println("\033[1mEven\033[0m");
		}
	}

}
