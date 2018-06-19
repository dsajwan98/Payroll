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
public class emailid extends InputVerifier {
    public boolean verify(JComponent input)
    {
      JTextField jtf=(JTextField)input;
      String numToken= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
      if(jtf.getText().matches(numToken))
      {
         return true;
      }
      else
      {
         JOptionPane.showMessageDialog(input,"Kindly enter valid emailid","Invalid id format",JOptionPane.ERROR_MESSAGE);
         return false;
      }
    }
    
}
