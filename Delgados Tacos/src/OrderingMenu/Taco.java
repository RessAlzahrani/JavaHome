/**
 * 
 */
package OrderingMenu;
import java.util.Scanner;

/**
 * @author RA316282
 *
 */
public class Taco {
	private static Scanner inputDevice;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		tacoTruck();
		menu();
		
		String burritoString, tacoString;
		double TacoOrdered;
		double TacoPrice = 10.50;
		double BurritoOrdered;
		double BurritoPrice = 12.20;
		double QuesadillaOrdered;
		double QuesadillaPrice = 15.99;
		double TemaleOrdered;
		double TemalePrice = 5.75;
		double GorditaOrdered;
		double GorditaPrice = 20.75;
		double ChilaquilesOrdered;
		double ChilaquilesPrice = 7.89;
		double EnchiladaOrdered;
		double EnchiladaPrice = 8.99;
		double EloteOrdered;
		double ElotePrice = 6.98;
		double GuacamoleOrdered;
		double GuacamolePrice = 4.65;
		double ChurroOrdered;
		double ChurroPrice = 9.78;
		double totalPrice;
		double totalPriceWithTax;
				
		inputDevice = new Scanner(System.in);
		
		System.out.println("How many Tacos do you want? >>>> ");
		TacoOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Burritos do you want? >>>> ");
		BurritoOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Quesadillas do you want? >>>> ");
		QuesadillaOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Temales do you want? >>>> ");
		TemaleOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Gordita do you want? >>>> ");
		GorditaOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Chilaquiles do you want? >>>> ");
		ChilaquilesOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Enchilada do you want? >>>> ");
		EnchiladaOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Elote do you want? >>>> ");
		EloteOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Guacamole sides do you want? >>>> ");
		GuacamoleOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many churro orders do you want? >>>> ");
		ChurroOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		
		totalPrice = (TacoPrice * TacoOrdered) + (BurritoOrdered * BurritoPrice) + (QuesadillaOrdered * QuesadillaPrice) + (TemaleOrdered * TemalePrice) + (GorditaOrdered * GorditaPrice) + (ChilaquilesOrdered * ChilaquilesPrice) + (EnchiladaOrdered + EnchiladaPrice) + (EloteOrdered * ElotePrice) + (GuacamoleOrdered * GuacamolePrice) + (ChurroOrdered * ChurroPrice);
		
		double salesTax = .075;
		
		totalPriceWithTax = totalPrice * salesTax;
		
		System.out.println("Your Order comes out to be " + totalPrice + ", and " + totalPriceWithTax + " after the tax.");
		totalPrice = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		
	}
	public static void menu()
	{
		
		System.out.println("Taco price -----------------------------------10.50");
		System.out.println("Burrito price --------------------------------12.20");
		System.out.println("Quesadilla price -----------------------------15.99");
		System.out.println("Temale price----------------------------------5.75");
		System.out.println("Gordita price---------------------------------20.75");
		System.out.println("Chilaquiles price-----------------------------7.89");
		System.out.println("Enchilada price-------------------------------8.99");
		System.out.println("Elote price-----------------------------------6.98");
		System.out.println("Guacamole price-------------------------------4.65");
		System.out.println("Churro price----------------------------------9.78");
		
	}
	
	public static void salesTax (double totalPrice)
	{
		double salesTax = .075;
		
		double totalPriceWithTax = totalPrice * salesTax;
		
		System.out.println("Your Order comes out to be " + totalPrice + ", and " + totalPriceWithTax + " after the tax.");
		totalPrice = inputDevice. nextDouble();
		inputDevice.nextLine();
	}
	public static void tacoTruck()
	{
		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("*********************************************************************************************");
		System.out.println("*********************************************************************************************");
		System.out.println("***     TACO           TACO       TACO              TACO     TACO          TACO             ***");
		System.out.println("***             TACO                       TACO                     TACO            TACO     ***");
		System.out.println("***     TACO           TACO       TACO              TACO     TACO          TACO               ***");
		System.out.println("***             TACO                       TACO                     TACO            TACO       ***");
		System.out.println("***     TACO           TACO       TACO              TACO     TACO          TACO                 ***");
		System.out.println("***             TACO                       TACO                     TACO            TACO        ***");
		System.out.println("***     TACO           TACO       TACO              TACO     TACO          TACO                ***");
		System.out.println("***             TACO                       TACO                     TACO            TACO      ***");
		System.out.println("***     TACO           TACO       TACO              TACO     TACO          TACO              ***");
		System.out.println("***             TACO                       TACO                     TACO            TACO     ***");
		System.out.println("***     TACO           TACO       TACO               TACO    TACO          TACO            ***");
		System.out.println("*********************************************************************************************");
		System.out.println("*********************************************************************************************");
		System.out.println("*********************************************************************************************");
	}

}
