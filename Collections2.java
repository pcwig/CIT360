import java.util.*;

public class Collections2 {

	public static void main(String[] args) {

		System.out.println(
				"\n\n########################################### MAPS ############################################\n\n");

		// Create a map that contains a string and integer for key use
		// A map has the form Map <K, V> where:
		// K: specifies the type of keys maintained in this map.
		// V: defines the type of mapped values.
		System.out.println("Creating Map DroneWarehouse...");
		Map<String, Integer> droneWarehouse = new HashMap<String, Integer>();

		// Lets import some inventroy into the warehouse
		// put() Adds the requested key-value pair in the map.
		System.out.println("\nImporting some inventory into the DroneWarehouse - 6 Drones");
		droneWarehouse.put("Syma x11", 3);
		droneWarehouse.put("3DR Solo", 5);
		droneWarehouse.put("Quanum Nova", 27);
		droneWarehouse.put("Proto X", 45);
		droneWarehouse.put("Hubsan X4", 65);
		droneWarehouse.put("DJI Phantom 3", 15);

		// Lets take stock of the warehouse
		// size() Returns the number of key-value pairs currently in the map.
		System.out.println("\nWarehouse Total Stock: " + droneWarehouse.size() + "\n");

		// Example iterator for map - Will loop through the map and print out
		// the drone and current inventory stock
		// keySet() Returns a Set that contains all keys of the map.
		// get() Retrieve the value of the requested key.
		for (Iterator<String> it = droneWarehouse.keySet().iterator(); it.hasNext();) {
			Object drone = it.next();
			System.out.println(drone + " - " + droneWarehouse.get(drone));
		}

		// Lets search for a drone in the map
		// containsKey() Returns true if the map contains the requested key.
		String searchKey = "Hubsan X4";
		if (droneWarehouse.containsKey(searchKey)) {
			System.out.println("\nFound: " + droneWarehouse.get(searchKey) + " - Using searchKey: " + searchKey);
		}

		// Lets search for a drone using the inventory
		// containsValue() Returns true if the map contains the requested value.
		int searchValue = 15;
		if (droneWarehouse.containsValue(searchValue)) {
			System.out.println("\nFound: DJI Phantom 3 - Using searchValue: " + searchValue);
		}

		// Clear out the droneWarehouse
		// clear() Removes all the elements from the map.
		System.out.println("\nClearing out the DroneWarehouse. Clearing...");
		droneWarehouse.clear();

		// Check the size of the map after clearing it
		System.out.println("Current inventory DroneWarehouse: " + droneWarehouse.size());

		System.out.println(
				"\n\n########################################### SETS ############################################\n\n");

		// Create new Set string - empty
		Set<String> set1Example = new HashSet<String>();

		// Add chars to setExample
		set1Example.add("A");
		set1Example.add("B");
		set1Example.add("C");
		set1Example.add("D");
		set1Example.add("E");
		set1Example.add("F");

		// Print out contents
		System.out.println("set1Example Contents: " + set1Example);

		// Create new Set2 string - empty
		Set<String> set2Example = new HashSet<String>();

		// Add chars to set2Example
		set2Example.add("A");
		set2Example.add("B");
		set2Example.add("C");
		set2Example.add("D");
		set2Example.add("E");
		set2Example.add("F");

		// Print out contents
		System.out.println("set2Example Contents: " + set2Example);

		// Lets compare the two sets to see if the contents match
		System.out.println("\nDoes set1Example match exactly set2Example?: " + set1Example.equals(set2Example));

		// Since they both match exactly lets remove an element from set1Example
		System.out.println("\nLets remove A, C, and F from set1Example. Removing...");
		set1Example.remove("A");
		set1Example.remove("C");
		set1Example.remove("F");

		// Print out contents
		System.out.println("\nset1Example contents: " + set1Example);
		System.out.println("\nset1Example contents: " + set2Example);

		// Lets compare both sets again
		System.out.println("\nDoes set1Example match exactly set2Example?: " + set1Example.equals(set2Example));

		// Example of the use of a for each loop
		System.out.println("\nFor Each Loop Example - set1Example");
		for (String str : set1Example) {
			System.out.println("set1Example: " + str);
		}

		// Lets use an Iterator to loop through and display contents
		System.out.println("\nIterator Loop - set2Example");
		Iterator<String> iterator = set2Example.iterator();
		while (iterator.hasNext()) {
			System.out.println("set2Example: " + iterator.next());
		}

		// Example of clearing set1Example
		System.out.println("\nLets wipe the slate on set1Example. Clearing...");
		set1Example.clear();
		System.out.println("Was set1Example cleared?: " + set1Example.isEmpty());

		// Example to show size count of each set
		System.out.println("\nset1Example currently has: " + set1Example.size() + " Elements");
		System.out.println("set2Example currently has: " + set2Example.size() + " Elements");

		// Lets create an array and store the contents of set2Example in it
		System.out.println(
				"\nLets create an array and transfer whats in set2Example into it. Creating... Transferring...");
		String[] setContentsArray = set2Example.toArray(new String[set2Example.size()]);
		System.out.println("Current contents of setContentsArray are:" + Arrays.toString(setContentsArray));

		System.out.println(
				"\n\n########################################### TREES ############################################\n\n");

		TreeSet<Integer> integerTree = new TreeSet<Integer>();
		integerTree.add(85);
		integerTree.add(64);
		integerTree.add(22);
		integerTree.add(9);
		integerTree.add(3);
		integerTree.add(78);
		integerTree.add(32);
		integerTree.add(75);
		integerTree.add(99);
		integerTree.add(26);

		System.out.print("Tree integer data in ascending order: ");

		// Lets print out the ints in the tree using an iterator in ascending
		// order
		Iterator<Integer> iterator2 = integerTree.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}

		// Lets now check to see if the tree is full or empty
		if (integerTree.isEmpty()) {
			System.out.println("\nThe integerTree is empty");
		} else {
			System.out.println("\n\nThe integerTree is full and contains: " + integerTree.size() + " integers");
		}

		// Display the last integer in the tree
		System.out.println("\nintegerTree - Last integer: " + integerTree.last());

		// Display the first integer in the tree
		System.out.println("integerTree - First integer: " + integerTree.first());

		// Lets remove an integer from the tree
		System.out.println("\nRemoving 32 from the integerTree...");
		if (integerTree.remove(32))
		{
			System.out.println("Removed 32");
		} else {
			System.out.println("Integer doesn't exist");
		}

		// Lets remove an integer from the tree
		System.out.println("\nRemoving 77 from the integerTree...");
		if (integerTree.remove(77))
		{
			System.out.println("Removed 77");
		} else {
			System.out.println("Integer doesn't exist");
		}

		// Displaying the Tree set data
		System.out.print("\nTree integer data in ascending order: ");
		Iterator<Integer> iterator3 = integerTree.iterator();
		while (iterator3.hasNext()) {
			System.out.print(iterator3.next() + " ");
		}

		// Let the user know how many integer are in the tree
		System.out.println("\n\nThe integerTree now contains: " + integerTree.size() + " integers");

		// Lets clear house - Wipe the integerTree
		integerTree.clear();

		// Check to see if its clear or still contains integers
		if (integerTree.isEmpty()) {
			System.out.println("\nThe integerTree is empty");
		} else {
			System.out.println("\n\nThe integerTree is full and contains: " + integerTree.size() + " integers");
		}
	}
}