package Questions;

import java.util.ArrayList;

public class Q9 {

	public static void prime() {
		ArrayList<Integer> numbers = new ArrayList<Integer>(100);
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for (int i = 1; i < 100+1; i++)
		{
		   numbers.add(i);

		}
		while (numbers.size() >0) {
			int i = 0;
			int retint = numbers.get(i);
			if (retint == 1) {
				numbers.remove(i);
			}
			else
			{
				int nextprime = numbers.get(i);
				primes.add(nextprime);
				numbers.remove(i);
				for (int j=0;j < numbers.size(); j++) {
					int testnumber = numbers.get(j);
					int remainder = testnumber % nextprime;
					if ( remainder == 0) {
						numbers.remove(j);
					}	
				}
			}
				
			i++;
		}
		System.out.println("\033[1m\nQ9 Prime number : \033[0m");
		for (Integer prime : primes) {
			System.out.print(prime + " ");
		}

	}

}
