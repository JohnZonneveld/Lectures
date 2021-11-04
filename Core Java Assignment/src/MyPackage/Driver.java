package MyPackage;
import java.util.Arrays;
// import java.util.Scanner;
import Questions.Q1;
import Questions.Q2;
import Questions.Q3;
import Questions.Q4;

public class Driver {

	public static void main(String... args) {
		int[] anArray = new int[]{ 1,0,5,6,3,2,3,7,9,8,4 };
		int[] sortedArray = Q1.BubbleSort(anArray);
		System.out.println("\n\033[1mResult of Q1 is: \033[0m");
		System.out.println( Arrays.toString( sortedArray ));
		Q2.Fibonacci(25);
		String inputStr = "Pega cohort September 20th 2021";
		Q3.ReverseStr(inputStr);
		int Answer4 = Q4.Factorial(6);
		System.out.println("\n\n\033[1mQ4 Factorial of 6 is: \033[0m"+ Answer4);
		
		
	};
		
	


}
