import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Create the scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("JSON Serialize Demo\n");

		String choice = null;
		boolean keepLooping = true;
		
		// Main menu
		while (keepLooping) {

			System.out.print("\nPlease choose an option: Create | Parse | Exit");
			System.out.print("\nOption: ");
			try {
				choice = input.next();
			} catch (Exception e) {

			}

			switch (choice) {

			case "Create":
				jsonCreate();
				break;

			case "Parse":
				jsonParse();
				break;

			case "Exit":
				keepLooping = false;
				break;

			default:
				System.out.print("\nInvalid Input\n");
				break;
			}
		}

		System.out.print("\nGoodbye\n");
	}
	@SuppressWarnings("unchecked")
	private static void jsonCreate() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt for input to create user info
		System.out.print("\nPlease enter your first name: ");
		String firstName = input.next();

		System.out.print("Please enter your last name: ");
		String lastName = input.next();

		System.out.print("Please enter age: ");
		int age = input.nextInt();

		System.out.print("I live in the United States (true or false): ");
		boolean isUS = input.next() != null;

		System.out.print("Please enter a filename: ");
		String filename = input.next();

		// Create user info and put it into a JSON object.
		JSONObject account = new JSONObject();

			account.put("firstName", firstName);
			account.put("lastName", lastName);
			account.put("age", age);
			account.put("isUS", isUS);

		
			   
			
		// Begin serialization
		System.out.print("\nCreating file...\n");

		try (FileWriter file = new FileWriter("/Users/Phillip/eclipse-workspace/CIT360/" + filename + ".json")) {
			file.write(account.toJSONString());
		
		

        // Notify of success
		System.out.print("\nSuccess!\n");
		}
	}

	private static void jsonParse() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Create the scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Get the filename
		System.out.print("\nPlease enter a filename: ");
		String filename = input.next();
		
		// Attempt to deserialize
		System.out.print("\nParsing...\n");
		
		JSONParser parser = new JSONParser();
		 
        try {
 
            Object obj = parser.parse(new FileReader(
                    "/Users/Phillip/eclipse-workspace/CIT360/" + filename + ".json"));
 
            JSONObject account1 = (JSONObject) obj;
 
            String firstName1 = (String) account1.get("firstName");
            String lastName1 = (String) account1.get("lastName");
            long age = (long) account1.get("age");
            boolean isUS = (boolean) account1.get("isUS");
            
         // Print out the objects datatype so we can see if the deserialization was a success or not
    		System.out.println("\nFirst Name - [" + firstName1 + "] Last Name - [" + lastName1
    							+ "] Age - [" + age + "] Lives in U.S. - [" + isUS + "]");
        
 
        } catch (IOException   e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    
		
		// Deserialization complete
		System.out.print("\nSuccess!\n");
	
		}
}