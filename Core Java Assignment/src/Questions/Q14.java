package Questions;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("\033[1m\nQ14\nWhat do you want to do? (1-3)\033[0m");
		System.out.println("Calculate a Sqrt (1)");
		System.out.println("Display today's date (2)");
		System.out.println("Split a string into a string array (3)");
//		System.out.println("Your choice: ");
        int input;
        String str = "I am learning Core Java";
        String[] words = null;
        try {
			System.out.print("Make your choice: ");
			input = console.nextInt();
			switch(input)
			{
			case 1:
				System.out.println("Which Sqrt do you want to calculate?: ");
				int sqrtCandidate = console.nextInt();
				double result = Math.sqrt(sqrtCandidate);
				System.out.println("The Sqrt of " + sqrtCandidate + " is " + result );
				break;
			case 2:
				System.out.println("Today's date:");
				System.out.println(LocalDate.now()); 
				break;
			case 3:
				System.out.println("String to string array:");
				System.out.println("Input string is" + str);
				words = str.split(" ");
				System.out.println("String array is:");
				System.out.println(Arrays.toString(words));

				break;
			default:
				System.out.println("... that was an invalid choice, see you next time!!");
			}
		} catch (Exception e) {
			System.out.println("That was not a number");
		}
        
//        
	}
   
}
