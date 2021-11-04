package MyPackage;
import java.util.Arrays;
// import java.util.Scanner;
import Questions.Q1;
import Questions.Q2;
import Questions.Q3;

public class Driver {

	public static void main(String... args) {
		int[] anArray = new int[]{ 1,0,5,6,3,2,3,7,9,8,4 };
		int[] sortedArray = Q1.BubbleSort(anArray);
		System.out.println("Result of Q1 is: ");
		System.out.println( Arrays.toString( sortedArray ));
		int[] fibArray = Q2.Fibonacci(25);
		String inputStr = "Pega cohort September 20th 2021";
		Q3.ReverseStr(inputStr);
		
		
	};
		
	


}
