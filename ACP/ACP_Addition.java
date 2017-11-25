
// Implements the APC_Handler
public class ACP_Addition implements ACP_Handler {
	
	// Method called execute that is called by controller and provided input via call
	// Processes the calculation then prints out to the view
	public void execute(double number1, double number2) {
		
		double sum = number1 + number2;
		System.out.println(sum);
	}
}
