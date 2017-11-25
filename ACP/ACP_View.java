import java.util.Scanner;

public class ACP_View {

	public void theView() {

		System.out.print("ACP - CAlCULATOR");
		
		// Loop to keep prompting and providing output to view
		Boolean keepRunning = true;
		while (keepRunning) {

			double number1 = 0;
			double number2 = 0;
			String action;

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);

			System.out.print("\n\nEnter the first number: ");
			number1 = input.nextDouble();

			System.out.println("\nActions to take [ + , - , * , / ] ");
			input.nextLine();

			System.out.print("Enter a action: ");
			action = input.nextLine();

			System.out.print("\nEnter the second number: ");
			number2 = input.nextDouble();

			// Print out information we have gathered thus far
			System.out.print("\n" + number1 + " " + action + " " + number2 + " = ");

			// Delegate to the controller to handle the asked for action
			ACP_Controller.handleAction(action, number1, number2);
			
			System.out.print("\nWant to try again? (true/false): ");
			Boolean in;
			input.nextLine();
			in = Boolean.parseBoolean(input.nextLine());
			if (in)
			{
				// Do nothing
				System.out.print("\nLets do this again");
			}
			else
			{
				keepRunning = false;
				System.out.print("\nExiting... Good Bye");
			}
		}
	}
}
