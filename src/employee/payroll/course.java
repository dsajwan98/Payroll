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
public class course extends InputVerifier{
    public boolean verify(JComponent input)
    {
       JComboBox jcf=(JComboBox)input;
       if(jcf.getSelectedIndex()==0)
       {
         JOptionPane.showMessageDialog(input,"Choose any one course","Kindly make a choice",JOptionPane.ERROR_MESSAGE);
         return false;
       }
       else
       {
           return true;
       }
    }
    
}
