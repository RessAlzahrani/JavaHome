/**
 * 
 */
package Debugging;

/**
 * @author bmwn1
 *
 */
public class Debugging3 
{
	   private int width;
	   private int length;
	   private int height;
	// This class uses a FixDebugBox class to instantiate two Box objects
	 public static void main(String args[])

	   {

		      int width = 12,
			      length = 10,
			      height = 8;
			      DebugBox box1 = new DebugBox();
			      DebugBox box2 = new DebugBox(width, length, height);
			      System.out.println("The dimensions of the first box are");
			      box1.showData();
			      System.out.print("  The volume of the first box is ");
			      showVolume(box1);
			      System.out.println("The dimensions of the second box are");
			      box2.showData();
			      System.out.print("  The volume of the second box is ");
			showVolume(box2);

	   }

	   public static void showVolume(DebugBox int width, int length, int height)
	   {
		   
			      this.width = width;
			      this.length = length;
			      this.height = height;
			      
			      System.out.println("Width: "  + width + "  Length: " +
			      length + "  Height: " + height);
	      
			      double vol = length * width * height;
			      return vol;
	   }
