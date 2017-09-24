import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class collections {


	public static void main(String[] args) {
		
		// Create temporary score holders
		float t1 = 0;
		float t2 = 0;
		float t3 = 0;
		float t4 = 0;
		float t5 = 0;
		float t6 = 0;
		float t7 = 0;
		// Create the scanner for input.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt for input
		System.out.print("Please enter some test scores in % ");
		System.out.print("Score 1: ");
		t1 = input.nextFloat();
		System.out.print("Score 2: ");
		t2 = input.nextFloat();
		System.out.print("Score 3: ");
		t3 = input.nextFloat();
		System.out.print("Score 4: ");
		t4 = input.nextFloat();
		System.out.print("Score 5: ");
		t5 = input.nextFloat();

		// Create our list we are going to use
		List<Float> tempList = new ArrayList<Float>();
		
		// Add the temporary Score holders into the list we made
		tempList.add(t1);
		tempList.add(t2);
		tempList.add(t3);
		tempList.add(t4);
		tempList.add(t5);
		
		// Display to the user the Scores they provided
		System.out.print("\nHere are the values you entered in: ");
		System.out.println(tempList + "\n");
		
		
		//sort the list in ascending order
		Collections.sort(tempList);
		System.out.println("Sorted Scores - Low to High: " + tempList + "\n");
		
		//shuffle the list so its random again
		Collections.shuffle(tempList);
		System.out.println("Shuffled Scores: " + tempList + "\n");
		Collections.shuffle(tempList);
		System.out.println("Shuffled Scores: " + tempList + "\n");
		
		//searching the list
		// We need to sort before we search it. 
		Collections.sort(tempList);
		
		// Prompt for a Score
		float scoreLookup = 0;
		System.out.println("Score lookup: ");
		scoreLookup = input.nextFloat();
		
		// Search the list for the provided Score to lookup and report back
		int search = Collections.binarySearch(tempList, scoreLookup);
		
		// If the search worked look for positive number, else negative = fail
		if(search >= 0){
			System.out.println("Score found. [" + scoreLookup + "]\n");
		}
		else{
		    System.out.println("Score not found. [" + scoreLookup + "]\n");
		}
		
		//Get the min temp from the list
		Float minimum = Collections.min(tempList);
		System.out.println("Minimum Score is: [" + minimum + "]\n");
		
		//Get the max temp from the list
		Float maximum = Collections.max(tempList);
		System.out.println("Maximum Score is: [" + maximum + "]\n");
		
		//Reverse the list around
		System.out.println("List Before - Current List: " + tempList);
		Collections.reverse(tempList);
		System.out.println("List After - Reversed List: " + tempList + "\n");
		
		//Add two more scores to our list
				System.out.print("Score 6: ");
				t6 = input.nextFloat();
				System.out.print("Score 7: ");
				t7 = input.nextFloat();
				
		//save scores
		tempList.add(t6);
		tempList.add(t7);
				
		//Show values
		System.out.print("\nHere are the values you entered in: ");
		System.out.println(tempList + "\n");
		
		//filling the list 
		float zeroOut = 0;
		Collections.fill(tempList, zeroOut);
		System.out.println("Clear list using fill: "+ tempList);
				
		//Replaces one specified value in a list with another.
		float par1 = (float) 0.0;
		float par2 = (float) 56.23;
		Collections.replaceAll(tempList, par1, par2);
		System.out.println("Replace list: "+tempList + "\n");
	
		
		// End
		System.out.println("End of program reached. Goodbye.");
	}
}