package MyPackage;

public class Driver {
	public static void main(String[] args) {
		System.out.print("Hello world");
		
		// Object INSTANTIATION
		MyThing mt = new MyThing();
		System.out.println("Say hi to my object, it has a value of " + mt.mySmallNumber);
		
		mt.PrintMyValues();
		
		int myInt = 1;
		float myFloat = (float) myDouble;
	}
	
	public static void myMethod(float myParameter) {
		System.out.println("My parameter is " + myParameter);
	}
}
