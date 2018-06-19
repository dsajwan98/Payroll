/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.InputVerifier;
import org.jdesktop.swingx.JXDatePicker;
/**
 *
 * @author Sajwan
 */
public class dob extends InputVerifier{
     public boolean verify(JComponent input)
    {
      JXDatePicker jtf=(JXDatePicker)input;
      String numToken="^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.]((19|20)\\d\\d)$";
     if(input != null)
     {
        InputVerifier verifier=input.getInputVerifier();
     }
      if(jtf.getDate().toString().matches(numToken))
      {
         return true;
      }
      else
      {
         JOptionPane.showMessageDialog(input,"Kindly enter correct date format(DD/MM/YYYY)","Invalid date format",JOptionPane.ERROR_MESSAGE);
         return false;
      }
    }
    
    
}

