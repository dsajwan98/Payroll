/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Sajwan
 */
public class lastname extends InputVerifier{
     public boolean verify(JComponent input)
    {
       JTextField jtf=(JTextField)input;
       if(jtf.getText().matches("[a-zA-z]+([ ][a-zA-Z]+)*"))
       {
         return true;
       }
       else
       {
          JOptionPane.showMessageDialog(input,"Enter the letters only","ERROR",JOptionPane.ERROR_MESSAGE);
          return false;
       }
    }
}
    
