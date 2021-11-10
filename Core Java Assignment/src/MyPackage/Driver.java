package MyPackage;
import static org.hamcrest.CoreMatchers.not;

import java.util.Arrays;

import Questions.Q1;
import Questions.Q2;
import Questions.Q20;
import Questions.Q3;
import Questions.Q4;
import Questions.Q5;
import Questions.Q6;
import Questions.Q7;
import Questions.Q8;
import Questions.Q9;
import Questions.Q10;
import Questions.Q11;
import Questions.Q12;
import Questions.Q13;
import Questions.Q14;
import Questions.Q15;
import Questions.Q16;
import Questions.Q17;
import Questions.Q18;
import Questions.Q18Upperclass;
import Questions.Q19;



public class Driver {

	public static void main(String... args) {
		int[] anArray = new int[]{ 1,0,5,6,3,2,3,7,9,8,4 };
		int[] sortedArray = Q1.BubbleSort(anArray);
		String inputStr = "Pega cohort September 20th 2021";

		System.out.println("\033[1mSorted array: \033[0m");
		System.out.println( Arrays.toString( sortedArray ));
		Q2.Fibonacci(25);
		System.out.println( Q3.ReverseStr(inputStr));
		int Answer4 = Q4.Factorial(6);
		System.out.println("\n\033[1mQ4\nFactorial of 6 is: \033[0m\n" + Answer4 );
		System.out.println("\n\033[1mQ5\nShortened string: \033[0m" + Q5.IndexedStr(inputStr, 7)); 
		Q6.isEven(119);
		Q7.main(args);
		Q8.palindrome();
		Q9.prime();
		System.out.println("\033[1m\n\nQ10 \nMinimum is: \033[0m" + Q10.minimum(10, 5));
		Q11.main(args);
		Q12.EvenNumbers();
		Q13.Triangle(args);
		Q13.PrintTrinagle(4);
		Q14.main(args);
		Q15.main(args);
		Q16.commandLine("Hello");
		Q17.Interest();
		Q18 string = new Q18();
		System.out.println("Input string is: " + inputStr);
		System.out.println("Are there uppercase characters in the string (true/false): \n" + string.checkForUpper(inputStr));
		System.out.println("String converted to lower case\n" + string.toLowers(inputStr));
		System.out.println("String total numeric value: " + string.toInteger(inputStr));
		Q19.main(args);
		Q20.main(args);		
	
	}

}
