package employee.payroll;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsajw
 */
public class searchv extends InputVerifier{
    public boolean verify(JComponent input)
    {
      JTextField jtf=(JTextField)input;
      String numToken="[\\p{Digit}&&[1234567890]]+";
      if(jtf.getText().matches(numToken)||jtf.getText().matches(""))
      {
         return true;
      }
      else
      {
         JOptionPane.showMessageDialog(input,"Kindly enter your input in numbers","Invalid format",JOptionPane.ERROR_MESSAGE);
         return false;
      }
    }
    
}

