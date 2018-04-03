import java.awt.GridLayout;
import javax.swing.*;
import java.net.*;
import java.io.*;
     
public class SystemLevelTest {

    public static void main(String[] args) throws IOException
    {
        JFrame frame = new JFrame("System Level Test - Bolt to Inch");
        int numeral = Integer.parseInt(JOptionPane.showInputDialog(frame, "Convert bolt to inches.  Please enter number of bolts: "));
        
        try {
            int result = (numeral * 1440);
            JOptionPane.showConfirmDialog(frame, "The result is: ".concat(Integer.toString(result)));
            System.out.print(result);
        } catch (Exception e) {
            System.out.print("Can't multiple a string to an integer.");
            System.exit(0);
        }
        
        System.exit(0);
        
    }
}
    