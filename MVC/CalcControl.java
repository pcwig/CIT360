// This program uses the CalcControl.java, CalcModel.java, and CalcMVC.java

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

// CONTROLLER - Controls relations between the view and model
public class CalcControl {

	private CalcView CalcView;
	private CalcModel CalcModel;

	public CalcControl(CalcView CalcView, CalcModel ClacModel) {
		
		this.CalcView = CalcView;
		this.CalcModel = ClacModel;

		// If a event or button is pressed and captured by the view let the controller know
		this.CalcView.calcListener(new ProcessListener());
	}

	class ProcessListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			double n1, n2, remainder = 0;

			// Get Placeholder button that was pressed
			JButton pressed = (JButton) (e.getSource());

			// Reach into Placeholder button and pull text
			String text = pressed.getText();

			// Check to see which column button was pressed
			// Get input from view
			// Push to model for processing
			// Gather returned processing from model
			// Push to view
			if (text.equals("Add")) {

				try {

					n1 = CalcView.getInputOne();
					n2 = CalcView.getInputTwo();

					remainder = CalcModel.addition(n1, n2);

					CalcView.setSolution(remainder);
				}

				catch (NumberFormatException ex) {

					System.out.println(ex);

					CalcView.displayErrorMessage("You Need to Enter 2 Integers");
				}
			} else if (text.equals("Subtract")) {

				try {

					n1 = CalcView.getInputOne();
					n2 = CalcView.getInputTwo();

					remainder = CalcModel.subtract(n1, n2);

					CalcView.setSolution(remainder);
				}

				catch (NumberFormatException ex) {

					System.out.println(ex);

					CalcView.displayErrorMessage("You Need to Enter 2 Integers");
				}
			} else if (text.equals("Multiply")) {

				try {

					n1 = CalcView.getInputOne();
					n2 = CalcView.getInputTwo();

					remainder = CalcModel.multiply(n1, n2);

					CalcView.setSolution(remainder);
				}

				catch (NumberFormatException ex) {

					System.out.println(ex);

					CalcView.displayErrorMessage("You Need to Enter 2 Integers");
				}
			} else if (text.equals("Divide")) {

				try {

					n1 = CalcView.getInputOne();
					n2 = CalcView.getInputTwo();

					remainder = CalcModel.division(n1, n2);

					CalcView.setSolution(remainder);
				}

				catch (NumberFormatException ex) {

					System.out.println(ex);

					CalcView.displayErrorMessage("You Need to Enter 2 Integers");
				}
			}
			else {
				// Do nothing
			}
		}
	}
}
