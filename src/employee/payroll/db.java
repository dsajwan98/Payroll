/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author dsajw
 */
public class db {
    
    public static Connection getConnection(){
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527/mydatabase","repository","repository");
            Connection conn =DriverManager.getConnection("jdbc:derby:mydatabase","repository","repository");
      
            return conn;
           
            
        }catch (Exception e){
            
            return null;
        }
        
    }
   /* public static String url="jdbc:derby://localhost:1527/mydatabase";
    //public static String url="jdbc:derby:mydatabase";
    public static String driverName="org.apache.derby.jdbc.ClientDriver";
    public static String username="repository";
    public static String password="repository";
    public static Connection con;
    public static Statement statement;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static Connection getConnection(){
      try{
       Class.forName(driverName).newInstance();
       con=DriverManager.getConnection(url,username,password);
       
       }
      catch(SQLException se){
         se.printStackTrace();
        }
         
     catch(Exception e){
          e.printStackTrace();  
     }
      return con;
    }
     */

}
