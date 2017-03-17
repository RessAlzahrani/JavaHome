/**
 * 
 */
package Debugging;

import java.util.Scanner;
//This class calculates a waitperson's tip as 15% of the bill
/**
 * @author RA316282
 *
 */
public class Debugging1 {

	/**
	 * @param args
	 */
	public static void main(String args[])

	   {

	      double myCheck = 50.00;

	      double yourCheck = 19.95;
	      
	      double bill;
	      
	      Scanner input = new Scanner (System.in);
		  System.out.println("Enter your bill >> ");
	      bill = input.nextInt();
	  
	      System.out.println("Tips are 15% of the bill.");

	      calcTip(myCheck);

	      calcTip(yourCheck);

	    }

	    public static void calcTip(double bill)

	    {

	      final double RATE = 0.15;

	      double tip;

	      tip = bill * RATE;

	      System.out.println("The tip should be at least " + tip);

	    }

	}