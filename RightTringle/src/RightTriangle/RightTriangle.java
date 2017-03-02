/**
 * 
 */
package RightTriangle;
import java.lang.Math;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class RightTriangle {

	private static Scanner keyboard;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double A = 0;
		double B = 0;
		double C = 0;
		double calculateA = 0;
		double calculateB = 0;
		double calculateC = 0;
		int response;
		String sideChoice;
	
		
		System.out.println("We are helpful! \nWe will help you with math!");
		
		do
		{
			keyboard = new Scanner(System.in);
			System.out.print("Which side would you like to solve for A, B or C? >>>>");
				sideChoice = keyboard.nextLine();
				
				if("A".equals(sideChoice) || "a".equals(sideChoice))
				{
					aSide(calculateA, B, C);
				}
				else if("B".equals(sideChoice) || "b".equals(sideChoice))
				{
					bSide(calculateB, A, C);
				}
				else if("C".equals(sideChoice) || "c".equals(sideChoice))
				{
					cSide(calculateC, A, B);
				}
				System.out.println("\nWould you like to do more calculations? Enter 1 for no");
			response = keyboard.nextInt();
		} while (response != 1);
		
		
	}
	
	public static void aSide(double calculateA, double B, double C)
	{
		
		System.out.print("Enter the value of B >> ");
	    B = keyboard.nextDouble();
	    keyboard.nextLine();
	    System.out.print("Enter the value of C >> ");
	    C = keyboard.nextDouble();
	    keyboard.nextLine();		
		calculateA = Math.sqrt(C * C - B * B);
	    System.out.print(calculateA);
	}
	public static void bSide(double calculateB, double A, double C)
	{
		System.out.print("Enter the value of A >> ");
	    A = keyboard.nextDouble();
	    keyboard.nextLine();
	    System.out.print("Enter the value of C >> ");
	    C = keyboard.nextDouble();
	    keyboard.nextLine();
		calculateB = Math.sqrt(C * C - A * A);
	    System.out.print(calculateB);
	}
	public static void cSide(double calculateC, double A, double B)
	{
		System.out.print("Enter the value of A >> ");
	    A = keyboard.nextDouble();
	    keyboard.nextLine();
	    System.out.print("Enter the value of B >> ");
	    B = keyboard.nextDouble();
	    keyboard.nextLine();
		calculateC = Math.sqrt(A * A + B * B);
		System.out.print(calculateC);
	}
}
