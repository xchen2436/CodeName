package Model;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Clue {
	
	public static String Clue;
	public static int ClueNumber;
	
	
	public JTextField textFieldClue;
	public JTextField textFieldNumber;
	public JTextField textFieldDisplayClue;
	public JTextField textFieldDisplayClueNumber;
	
	/*Validate Clue*/
	public void validateClue() {
		ClueNumber = (int) Float.parseFloat(textFieldNumber.getText());
        textFieldNumber.setText(String.valueOf(ClueNumber));
        textFieldDisplayClueNumber.setText(textFieldNumber.getText());
	}
	/*Display Clue*/
	public boolean displayClue() {

		Clue = textFieldClue.getText();
		textFieldDisplayClue.setText(Clue);
		boolean isClueValid = true;
		try {
			validateClue();
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Please enter valide number of clue");
	        isClueValid = false;
	    }
		return isClueValid;
	}
	public void resetClue() {
		textFieldClue.setText(null);
		textFieldNumber.setText(null);
		textFieldDisplayClue.setText(null);
		textFieldDisplayClueNumber.setText(null);
	}
}
