package MyPackage;

public class MyThing {
	int myWholeNumber; //Short for 'integer', 32 bits. Whole numbers only
	float myDecimal = 1.05f; // 'Floating-point or decimal number. 64 bits
	double myMorePreciseDecimal = 1.06; //128 bits, double precision decimal number
	short mySmallNumber = 5; //Half of an in 16 bits
	long myBigNumber; // 64 bit, twice as large as an int
	byte myByte; // 8 bits, half of an short
	boolean myTrueOrFalse; // 1 byte or 8 bits
	char myCharacter; // 16 bits, stores ASCII unless otherwise specified
	/*
	 * Camel Case: firstLetterLowerCase, upper case for each new word
	 */
	
	// Reference
	Object o; // References are 32 bits on a x86 (32-bit machine and 64 bits on a x64 machine)
	
	//My First method
	public void PrintMyValues() {
		System.out.println("My values are: " + myByte + ", " + mySmallNumber + ", " + myDecimal);
	}
}
