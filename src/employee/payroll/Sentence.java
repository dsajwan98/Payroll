/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dsajw
 */
public class Sentence extends InputVerifier {
    public boolean verify(JComponent input)
    {
       JTextField jtf=(JTextField)input;
       if(jtf.getText().matches("[A-Z][a-zA-Z\\s]*"))
       {
         return true;
       }
       else
       {
          JOptionPane.showMessageDialog(input,"Enter the letters in Sentence Case","ERROR",JOptionPane.ERROR_MESSAGE);
          return false;
       }
    }
}