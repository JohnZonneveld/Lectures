package MyPackage;
import java.util.Arrays;
import Questions.Q1;
import Questions.Q2;
import Questions.Q3;
import Questions.Q4;
import Questions.Q5;
import Questions.Q6;
import Questions.Q7;
import Questions.Q8;
import Questions.Q9;
import Questions.Q10;


public class Driver {

	public static void main(String... args) {
		int[] anArray = new int[]{ 1,0,5,6,3,2,3,7,9,8,4 };
		int[] sortedArray = Q1.BubbleSort(anArray);
		String inputStr = "Pega cohort September 20th 2021";

		System.out.println("\033[1mResult of Q1 is: \033[0m");
		System.out.println( Arrays.toString( sortedArray ));
		Q2.Fibonacci(25);
		System.out.println( Q3.ReverseStr(inputStr));
		int Answer4 = Q4.Factorial(6);
		System.out.println("\n\033[1mQ4 Factorial of 6 is: \033[0m" + Answer4 );
		System.out.println("\n\033[1mQ5 shortened string: \033[0m" + Q5.IndexedStr(inputStr, 7)); 
		Q6.isEven(119);
		Q7.main(args);
		Q8.palindrome();
		Q9.prime();
		System.out.println("\033[1m\n\nMinimum is: " + Q10.minimum(10, 5));
	};
		
	


}
