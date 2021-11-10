package Questions;

import static org.junit.Assume.assumeFalse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q19 {

	public static void main(String[] args) {
		int evensum = 0;
		int oddsum = 0;
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		System.out.println("\n\033[1mQ19\033[0m\nArrayList contains:");
		for (Integer num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < arr.size(); ++i) {
			if (arr.get(i)%2 == 0) {
				evensum +=arr.get(i);	
			} else {
				oddsum += arr.get(i);
			}
		}
		System.out.println("total of even numbers is: " + evensum);
		System.out.println("total of odd numbers is:" + oddsum);
		
		keepNonPrimes(arr);
		System.out.println("\nAfter removing of primes the array list contains:");
		for (Integer num : arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void keepNonPrimes(List<Integer> nums) {

        for (int i = 0 ; i < nums.size() ; i++) {
        	System.out.println("size: " +nums.size());
        	System.out.println("nums :"+ nums);
            if (isPrime(nums.get(i))) {
                nums.remove(i);
                i--;
            }
        }
    }
	
	public static boolean isPrime(int number) {
		if (number == 1)
			return false;
        for (int i = 2 ; i < number ; i++) {
            if (number % i == 0) {
                return false; // number is divisible so its not prime
            }
        }
        return true; // number is prime now
    }
	

}
