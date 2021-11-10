package Questions;



public class Q13 {
	
	public static void PrintTrinagle(int size) {
		
		int characterIteration = 0;
		
		// Iteration through each row
		for (int row = 0; row < size; ++row) {
			
			//Add the right number of characters
			for (int column = 0; column < row + 1; ++column) {
				System.out.print((characterIteration % 2) + " ");;
				++characterIteration;
			}
			System.out.println();
		}
	}

	public static void Triangle(String[] args) {
		String triangle = new String();
		System.out.println("\033[1m\n\nQ13\nTriangle:\033[0m");
		int n = 1;
		String str1 = "0";
		String str2 = "1";
		for (int i= 1; i < 5; i++) {
			if (i == 1) {
				triangle = "0";
			} else {
				
				
				if ( n%2!=0 ) {
					str1=str1+str2;
					str2=str1.replace(str2, "");
					str1=str1.replace(str2, "");
				} 
				if (i%2 == 0) {
					triangle = str1 + triangle;
				} else {
					triangle = triangle + str1;
				}
			n++;	
			}
			
			System.out.println(triangle);
		}

	}

}
