// This program uses the CalcControl.java, CalcView.java, and CalcModel.java

// MAIN - Driver for Simple Calculator GUI implementing MVC Pattern
public class CalcMVC {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Get the view
		CalcView CalcView = new CalcView();

		// Get the model
		CalcModel CalcModel = new CalcModel();

		// Provide view and model to controler
		CalcControl CalcControl = new CalcControl(CalcView, CalcModel);

		// Make sure we can see the view
		CalcView.setVisible(true);

	}
}