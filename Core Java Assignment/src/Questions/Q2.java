package Questions;

public class Q2 {

	public static int[] Fibonacci(int fib) {
		int first = 0;
		int second = 1;
		System.out.println("\n\033[1mQ2\nFibonacci of 25 is: \033[0m");
		for (int i = 0; i < fib; i++) {
			System.out.print(first);
			int sum = first + second;
			first = second;
			second = sum;
			if (i != fib-1) {
				System.out.print(", ");
			}
		}
		return null;

	}

}
