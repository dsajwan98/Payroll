/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author dsajw
 */
public class pl extends InputVerifier {
     public boolean verify(JComponent input)
    {
      JTextField jtf=(JTextField)input;
      String numToken= "^.{8,}$";
      if(jtf.getText().matches(numToken))
      {
         return true;
      }
      else
      {
         JOptionPane.showMessageDialog(input,"Kindly enter valid password","Invalid password",JOptionPane.ERROR_MESSAGE);
         return false;
      }
    }
}
