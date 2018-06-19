/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;
import javax.swing.*;

/**
 *
 * @author Sajwan
 */
public class gender extends InputVerifier{
    public boolean verify(JComponent input)
    {
      JRadioButton jrb=(JRadioButton)input;
      if(jrb.isSelected())
      {
        return true;
      }
      else
      {
         JOptionPane.showMessageDialog(input,"Kindly select one","Selection error",JOptionPane.ERROR_MESSAGE);
         return false;
      }
    }
    
}
