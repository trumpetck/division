import javax.swing.JOptionPane;
/**
*This program is the.
*driver program for
*division.
*@author Caroline Kirkconnell
*@version 4/13/2020
*/
public class DivisionDriver
{
/**
*@param args - not used
*/
   public static void main(String[] args)
   {
      String numInput
         = JOptionPane.showInputDialog("Enter the numberator:");
      String denomInput
         = JOptionPane.showInputDialog("Enter the Denominator:");
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \r\n"
            + Division.intDivide(num, denom)
            + "\r\n\r\nFloating point division: \r\n"
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException errorDetail) {
         JOptionPane.showMessageDialog(null,
               "Invalid input: enter numericalintegervalues only.",
               "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException errorMessage) {
         JOptionPane.showMessageDialog(null,
               errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}