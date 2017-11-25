
import java.util.HashMap;

public class ACP_Controller {

	// Create a hashmap in order to store a key string and object method away in
	public static HashMap<String,ACP_Handler> mapOfActions = new HashMap<String,ACP_Handler>();
	
	// Method to handle delegation from view
	public static void handleAction(String action, double number1, double number2)
	{
		mapOfActions.put("+", new ACP_Addition());
		mapOfActions.put("-", new ACP_Subtract());
		mapOfActions.put("*", new ACP_Multiply());
		mapOfActions.put("/", new ACP_Divide());
		
		// Resolve our action using the map so we know what to do
		ACP_Handler handler = mapOfActions.get(action);
		
		// Once resolved invoke our target and provide the needed inputs into the method call
		handler.execute(number1, number2);
	}
}
