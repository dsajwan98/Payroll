/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dsajw
 */
public class datetime {
      public String date(String d)
    {
      Date date=new Date();
      DateFormat df=new SimpleDateFormat(d);
      String p=df.format(date);
      return(p);
    }
    public static void main(String[] args)
    {
       datetime dt=new datetime();
       System.out.print(dt.date("EE"));//EE for weekday
    }
    
    
}
