/**
 * 
 */
package decisionMaking;

import java.util.Scanner;

/**
 * @author ra316282
 *
 */
public class doorPrize {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose is behind Door #1, Door #2, or Door #3");
		choice = input.nextInt();
		
		//door number one comment line
		if(choice == 1)
		{
			System.out.println("A brand new car");
		}
		if (choice == 2 )
		{
			System.out.println("A brand new huffy bike!");
		}
		if (choice == 3)
		{
			System.out.println("A green apple!");
		}
		if (choice >= 4 )
		{
			System.out.println("NOTHING YOU'RE A LOSER!!!");
		}
		
	}

}
