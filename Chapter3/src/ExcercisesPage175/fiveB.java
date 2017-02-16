/**
 * 
 */
package ExcercisesPage175;

import javax.swing.JOptionPane;

/**
 * @author RA316282
 *
 */
public class fiveB {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double firstNumber;
		double secondNumber;
		
		String firstNumEntry;
		firstNumEntry = JOptionPane.showInputDialog(null, "Enter a number " ,"", JOptionPane.QUESTION_MESSAGE);
		firstNumber = Integer.parseInt(firstNumEntry);
		
		String secondNumEntry;
		secondNumEntry = JOptionPane.showInputDialog(null, "Enter another number ","", JOptionPane.QUESTION_MESSAGE);
		secondNumber = Integer.parseInt(secondNumEntry);
		
		ComputePercent(firstNumber, secondNumber);
	}
	
	public static void ComputePercent(double firstNumber, double secondNumber)
	{
		double percentage;
		
		percentage = (firstNumber/secondNumber) * 100;
		
		JOptionPane.showMessageDialog(null, firstNumber + " is " + percentage + " percent of " + secondNumber + ".");
		
	}
	

}
