package Questions;

import Test.testFloats;

public class Q11 {

	public static void main(String[] args) {
		System.out.println("\n\033[1mQ11\nReturn floats from other package:\033[0m");
		new testFloats();
		Float floatOne = testFloats.flOne();
		new testFloats();
		Float floatTwo = testFloats.flTwo();
		System.out.println("\033[1mFloat One: \033[0m"+ floatOne);
		System.out.println("\033[1mFloat Two: \033[0m"+ floatTwo);

	}
}


