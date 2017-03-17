/**
 * 
 */
package testing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author bmwn1
 *
 */
public abstract class ImageIcon {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ImageIcon point = new ImageIcon ("Davenport West.jpg");
        JOptionPane.showMessageDialog(null, "Congratulations, You have chosen correctly! There have been no more killings.", JOptionPane.INFORMATION_MESSAGE, point);
	}

}
