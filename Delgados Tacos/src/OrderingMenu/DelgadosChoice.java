/**
 * 
 */
package OrderingMenu;

import java.util.Scanner;

/**
 * @author RA316282
 *
 */
public class DelgadosChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		tacoTruck();
		menu();
		
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
		int OrderNumber; 
        double salesTax = .075;
	
		
		Scanner inputDevice = new Scanner (System.in);
				
		
		System.out.println("Hello and welcome to Delgados Tacos.");
		System.out.println("From the menu above what would you like to order?");
		System.out.println("Please select a menu number.");
		OrderNumber = inputDevice.nextInt();
		inputDevice.nextLine();
		
		
		if(OrderNumber == 1)
		{
			System.out.println("I see you like Tacos, how many would you like?");
			TacoOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (TacoPrice * TacoOrdered);
		    System.out.println("You ordered " + TacoOrdered + " Tacos." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 2)
		{
			System.out.println("I see you like Burritos, how many would you like?");
			BurritoOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (BurritoPrice * BurritoOrdered);
		    System.out.println("You ordered " + BurritoOrdered + " Burritos." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 3)
		{
			System.out.println("I see you like Quesadillas, how many would you like?");
			QuesadillaOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (QuesadillaPrice * QuesadillaOrdered);
		    System.out.println("You ordered " + QuesadillaOrdered + " Quesadillas." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 4)
		{
			System.out.println("I see you like Temales, how many would you like?");
			TemaleOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (TemalePrice * TemaleOrdered);
		    System.out.println("You ordered " + TemaleOrdered + " Temales." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 5)
		{
			System.out.println("I see you like Gorditas, how many would you like?");
			GorditaOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (GorditaPrice * GorditaOrdered);
		    System.out.println("You ordered " + GorditaOrdered + " Gorditas." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 6)
		{
			System.out.println("I see you like Chilaquiles, how many would you like?");
			ChilaquilesOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (ChilaquilesPrice * ChilaquilesOrdered);
		    System.out.println("You ordered " + ChilaquilesOrdered + " Chilaquiles." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 7)
		{
			System.out.println("I see you like Enchiladas, how many would you like?");
			EnchiladaOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (EnchiladaPrice * EnchiladaOrdered);
		    System.out.println("You ordered " + EnchiladaOrdered + " Enchiladas." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 8)
		{
			System.out.println("I see you like Elotes, how many would you like?");
			EloteOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (ElotePrice * EloteOrdered);
		    System.out.println("You ordered " + EloteOrdered + " Elotes." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 9)
		{
			System.out.println("I see you like Churros, how many would you like?");
			ChurroOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (ChurroPrice * ChurroOrdered);
		    System.out.println("You ordered " + ChurroOrdered + " Churros." + "\nThat's going to be " + totalPrice);
		}
		
		if(OrderNumber == 10)
		{
			System.out.println("I see you like Guacamole, how many sides would you like?");
			GuacamoleOrdered = inputDevice.nextDouble();
		    inputDevice.nextLine();
		    totalPrice = (GuacamolePrice * GuacamoleOrdered);
		    System.out.println("You ordered " + GuacamoleOrdered + " Guacamole." + "\nThat's going to be " + totalPrice);
		}
		
		
		
		
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

