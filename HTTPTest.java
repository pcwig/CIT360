import java.io.BufferedReader; // Class - reads text from a char input stream
import java.io.InputStreamReader; // Class - bridge from byte streams to char streams. Reads bytes and decodes them 
                                  // into readable chars using a specified charset.
import java.net.HttpURLConnection; // Class - used to make a single http request. Can be shared by other instances.
import java.net.URL; // Class - used to indicate that we are using http
import java.util.Scanner;

public class HTTPTest {

	public static void main(String[] args) throws Exception {

		// Create new httpTest object from class
		HTTPTest httpTest = new HTTPTest();

		httpTest.sendGet();
	}

	// sendGet() method
	private void sendGet() throws Exception {
		try {
		// Create the scanner.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Ask to add two numbers
		// Prompt for first number
		System.out.print("Please provide a website to make a get request to.\n");
		System.out.print("Full URL: ");
		String url = input.next();

		URL urlObj = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();

		// Setting the request method for our connection to GET
		connection.setRequestMethod("GET");

		

		// Make a query to the connection for a resonse code to display to the
		// user
		// If code is 200 this means our get request has succeded and was a
		// success!
		int responseCode = connection.getResponseCode();
		String result;
		if (responseCode == 200)
		{
			result = "Success!";
		}
		else
		{
			result = "Failure.";
		}
		System.out.println("\n[ Sending (GET) request to URL ] : " + url);
		System.out.println("[ Response Code Received       ] : " + responseCode + " - " + result);

		// Using our connection open an input stream reader and read in the html
		// from our get response
		// This is done using a buffered reader which decodes the byte stream
		// into readable characters
		// For my website the charset is set to urf-8 so the bufferedreader will
		// decode to this
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		// We will need this for printing out each line of html from the webpage
		// get request
		String inputLine;

		// Use while loop to print what was decoded as long as something is
		// being read in for each line
		System.out.println("[ Response from (GET) request  ] : ");
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
		// Close the input stream
		in.close();
	}
		catch(Exception e){
	           //Print the exception if we have a bad URL
	           System.out.println(e);
	}
	}
}