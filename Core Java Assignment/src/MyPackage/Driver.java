package MyPackage;
import java.util.Arrays;
// import java.util.Scanner;
import Questions.Q1;

public class Driver {

	public static void main(String... args) {
		int[] anArray = new int[]{ 1,0,5,6,3,2,3,7,9,8,4 };
//		int arrayLength = anArray.length;
//		for (int k = 1; k < arrayLength - 1; k++) 
//		{
//			for (int i = 0; i < arrayLength - k; i++) 
//			{
//				if (anArray[i] > anArray[i+1]) {
//					int arrayI = anArray[i];
//					anArray[i] = anArray[i+1];
//					anArray[i+1] = arrayI;
//				}
//			};
//		};
//		System.out.println("Answer to Q1 is: ");
//		System.out.println( Arrays.toString( anArray ));
//		System.out.println();
		int[] sortedArray = Q1.BubbleSort(anArray);
		System.out.println("Answer to Q1 is: ");
		System.out.println( Arrays.toString( sortedArray ));
		
		
		int fibonacciLength = 25;
		int first = 0;
		int second = 1;
		System.out.println("\nAnswer to Q2 is: ");
		for (int i = 1; i < fibonacciLength; i++) {
			System.out.print(first + ", ");
			int sum = first + second;
			first = second;
			// System.out.println("first " + first);
			second = sum;
			// System.out.println("second " + second);
		}
		
	String inputString = "Pega cohort September 20th 2021";
    char[] chars = inputString.toCharArray();
    int length = chars.length;
    System.out.println("\n\nAnswer to Q3: ");
    for (int i = length -1; i >= 0; i-- ) {
    	System.out.print(chars[i]);
    }
//    int n = s.length();
//    int start = 0;
//    int end = (n - 1);
//    while(start<end)
//    {
//        a[start]^=a[end];
//        a[end]^=a[start];
//        a[start]^=a[end];
//        end--;
//        start++;
//    }
//    for(int i=0;i<n;i++)
//    System.out.print(a[i]);
//    System.out.println();
	};
		
	


}
