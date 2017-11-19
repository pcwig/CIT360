import java.util.Arrays;

public class ShoppingList {

	public String[] prepareTheCart() {

		String[] cart = {"TextBooks", "Laptop", "Pens"};

		System.out.println("Cart currently contains: " + Arrays.toString(cart));

		return cart;
	}

	public String[] addPaperAndPencils() {

		String[] cart = {"TextBooks", "Laptop", "Pens", "Paper", "Pencils"};

		System.out.println("Cart now contains: " + Arrays.toString(cart));

		return cart;
	}
}


