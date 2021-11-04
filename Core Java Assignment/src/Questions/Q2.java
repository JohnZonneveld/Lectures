package Questions;

public class Q2 {

	public static int[] Fibonacci(int fib) {
		int first = 0;
		int second = 1;
		System.out.println("\nAnswer to Q2 is: ");
		for (int i = 1; i < fib; i++) {
			System.out.print(first + ", ");
			int sum = first + second;
			first = second;
			// System.out.println("first " + first);
			second = sum;
			// System.out.println("second " + second);
		}
		return null;

	}

}
