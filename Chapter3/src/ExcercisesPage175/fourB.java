/**
 * 
 */
package ExcercisesPage175;

import javax.swing.JOptionPane;

/**
 * @author RA316282
 *
 */
public class fourB {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		
		String firstNumEntry;
		firstNumEntry = JOptionPane.showInputDialog(null, "Enter a number " ,"", JOptionPane.QUESTION_MESSAGE);
		firstNumber = Integer.parseInt(firstNumEntry);
		
		String secondNumEntry;
		secondNumEntry = JOptionPane.showInputDialog(null, "Enter another number ","", JOptionPane.QUESTION_MESSAGE);
		secondNumber = Integer.parseInt(secondNumEntry);
		
		displayTwiceTheNumber(firstNumber, secondNumber);
		displayNumberPlusFive(firstNumber, secondNumber);
		displayNumberSquared(firstNumber, secondNumber);
		
	}
	
	public static void displayTwiceTheNumber(int firstNumber, int secondNumber)
	{
		int twicefirst;
		int twicesecond;
		int twice = 2;
		
		twicefirst = firstNumber * twice;
		twicesecond = secondNumber * twice;
		
		JOptionPane.showMessageDialog(null, "Twice " + firstNumber + " is " + twicefirst + " and twice " + secondNumber + " is " + twicesecond );
		
	}
	public static void displayNumberPlusFive(int firstNumber, int secondNumber)
	{
		int firstPlusFive;
		int secondPlusFive;
		int five = 5;
		
		firstPlusFive = firstNumber + five;
		secondPlusFive = secondNumber + five;
		
		JOptionPane.showMessageDialog(null,  firstNumber + " plus 5 is " + firstPlusFive + " and " + secondNumber + " plus five is " + secondPlusFive );
	}
	
	public static void displayNumberSquared(int firstNumber, int secondNumber)
	{
		int firstSquared;
		int secondSquared;
		int squared = 2;
		
		firstSquared = firstNumber ^ squared;
		secondSquared = secondNumber ^ squared;
		
		JOptionPane.showMessageDialog(null,  firstNumber + " squared is " + firstSquared + " and " + secondNumber + " squared is " + secondSquared );
	}

}
	
