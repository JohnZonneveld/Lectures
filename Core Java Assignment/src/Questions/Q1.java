package Questions;

import java.util.Arrays;

public class Q1 {
	public static int[] BubbleSort(int[] array) {
		System.out.print("\033[1mQ1\nUnsorted array: \033[0m\n");
		System.out.println( Arrays.toString( array ));
		int arrayLength = array.length;
		for (int k = 1; k < arrayLength - 1; k++) 
		{
			for (int i = 0; i < arrayLength - k; i++) 
			{
				if (array[i] > array[i+1]) {
					int arrayI = array[i];
					array[i] = array[i+1];
					array[i+1] = arrayI;
				}
			};
		};

		return array;
	}
}
