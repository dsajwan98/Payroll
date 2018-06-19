/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sajwan
 */
package employee.payroll;
import javax.swing.*;
public class firstname extends InputVerifier {
    public boolean verify(JComponent input)
    {
       JTextField jtf=(JTextField)input;
       if(jtf.getText().matches("[A-Z][a-zA-Z]*"))
       {
         return true;
       }
       else
       {
          JOptionPane.showMessageDialog(input,"Must contain letters only. First letter should be in Capital","ERROR",JOptionPane.ERROR_MESSAGE);
          return false;
       }
    }
}
