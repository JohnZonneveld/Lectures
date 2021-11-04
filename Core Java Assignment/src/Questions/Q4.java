package Questions;

public class Q4 {

	public static int Factorial(int args) {
		int n = args;
		int result = 1;
		for (int i=1; i != n+1; i++) {
			
			result = result*i;
		}
		return result;
	}

}
