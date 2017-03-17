/**
 * 
 */
package Debugging;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class Debugging3 {
	
	// This application gets a user's name and displays a greeting
	
	public static String getName()

	   {

	      String name;

	      Scanner input = new Scanner(System.in);

	      System.out.print("Enter name ");

	      name = input.nextLine();

	      return name;

	   }

	   public static void displayGreeting(String name)

	   {

	      System.out.println("Hello, " + name + "!");

	   }

	}