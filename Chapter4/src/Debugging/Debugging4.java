/**
 * 
 */
package Debugging;

/**
 * @author bmwn1
 *
 */
public class Debugging4 {
	// This class discounts prices by 10%
	public static void main(String args[])

	   {

	      final double DISCOUNT_RATE = 0.90;

	      int price = 100;

	      double price2 = 100.00;

	      tenPercentOff(price, DISCOUNT_RATE);

	      tenPercentOff(price2, DISCOUNT_RATE);

	   }

	   public static void tenPercentOff(int price, final double DISCOUNT_RATE)

	   {

	      double newPrice = price * DISCOUNT_RATE;

	      System.out.println("Ten percent off " + price);

	      System.out.println("  New price is " + newPrice);

	   }

	   public static void tenPercentOff(double price2, final double DISCOUNT_RATE)

	   {

	      double newPrice = price2 * DISCOUNT_RATE;

	      System.out.println("Ten percent off " + price2);

	      System.out.println("  New price is " + newPrice);

	   }

	}
