package SampleProject;

// abstraction is hiding actual impelementation and just showing functionality.

abstract class AbstractMathematics { // abstract class should be declared with abstract keyword.
	
	protected final String color = "red";
	
	public AbstractMathematics(){} // abstract class can have constructor but can't declare as abstract. constructor should have body present.
	
	public abstract int addition(int a , int b); // abstract method is define without body in abstract class
	
	public abstract int subtraction(int a , int b); // abstract method cannot be static as we need to override the method for implementation
	
	public abstract int multiplication(int a , int b); // abstract method cannot be declare as final because implemention should be done in another class
	
	protected abstract int division(int a , int b); // abstract method cannot be private. It could be protected, public
}


class Mathematics extends AbstractMathematics{
	
	public Mathematics() {
		String c = super.color;
		System.out.println("Mathematics class Constructor given as "+c);
	}
	
	public int addition(int a, int b) {
		return a + b;
	}
	
	public int subtraction(int a, int b) {
		return a - b;
	}
	
	public int multiplication(int a , int b) {
		return a * b;
	}
	
	public int division(int a, int b) {
		return a / b;
	}
}

public class SampleAbstraction {
	
	public static void main(String args[]) {
		int a = 5;
		int b = 3;
		AbstractMathematics sa = new Mathematics();
		System.out.println(sa.addition(a, b));
		System.out.println(sa.subtraction(a, b));
		System.out.println(sa.multiplication(a, b));
		System.out.println(sa.division(a, b));	
	}	
}
