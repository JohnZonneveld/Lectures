package Questions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Q12 {
	public static void EvenNumbers() {
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		int[] arr = IntStream.range(1, 101).toArray();
    
		for (int i : arr) {
			if (i%2 == 0) {
				evenNumbers.add(i);
				System.out.println(i);
			}
		}
		System.out.println("\033[1mQ12\nThe even numbers are:\033[0m");
		for (int j = 0; j < evenNumbers.size(); j++) { 
			System.out.print(evenNumbers.get(j));
			if (j != evenNumbers.size()-1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
			
		}
	}
}

