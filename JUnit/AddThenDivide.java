import java.util.Scanner;

// Class JUnit going to be used for testing
public class AddThenDivide {

	public static void main(String[] args) {

		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Ask to add two numbers
		// Prompt for first number
		System.out.print("Lets add two numbers!\n");
		System.out.print("Number one: ");
		double n1 = input.nextDouble();

		// Prompt for second number
		System.out.print("Number two: ");
		double n2 = input.nextDouble();

		// Call add method then print result
		System.out.print("Calculating...\n");
		double addResult = additionTest(n1, n2);
		System.out.print("Result is: " + addResult);

		// Ask to multiply two numbers
		// Prompt for first number
		System.out.print("\n\nLets multiply two numbers!\n");
		System.out.print("Number one: ");
		double n3 = input.nextDouble();

		// Prompt for second number
		System.out.print("Number two: ");
		double n4 = input.nextDouble();

		// Call add method then print result
		System.out.print("Calculating...\n");
		double multiplyResult = multiplyTest(n3, n4);
		System.out.print("Result is: " + multiplyResult);
	}

	// Method additionTest - Note* method subtracts rather than adds
	// this is a mistake and will fail the JUnit test when called
	public static double additionTest(double n1, double n2) {
		return n1 - n2;
		// right
		// return n1 + n2;
	}

	// Method multiplyTest - Note* method returns correct values
	public static double multiplyTest(double n1, double n2) {
		return n1 * n2;
	}
}