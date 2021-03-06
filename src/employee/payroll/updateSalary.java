/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dsajw
 */
public class updateSalary extends javax.swing.JFrame {
     Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;


    /**
     * Creates new form updateSalary
     */
    public updateSalary() {
        initComponents();
        conn=db.getConnection();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        txt_percent.setEnabled(false);
        txt_amt.setEnabled(false);
        lbl_emp.setText(Emp.username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        r_percent = new javax.swing.JRadioButton();
        r_amt = new javax.swing.JRadioButton();
        txt_search = new javax.swing.JTextField();
        txt_empid = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_dept = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_percent = new javax.swing.JTextField();
        txt_amt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbl_back = new javax.swing.JLabel();
        jLablel15 = new javax.swing.JLabel();
        lbl_sau = new javax.swing.JLabel();
        lbl_ua = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        lbl_pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(901, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Search By Employee ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 250, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Employee ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 114, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Surname:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 114, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Firstname:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 114, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date Of Birth:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 114, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Department:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 114, 26));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Update Salary By:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 114, 26));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Percentage(%):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 114, 26));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Amount(in ₹):");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 114, 26));

        r_percent.setText("Percentage(%)");
        r_percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentActionPerformed(evt);
            }
        });
        getContentPane().add(r_percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        r_amt.setText("Amount");
        r_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amtActionPerformed(evt);
            }
        });
        getContentPane().add(r_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        txt_search.setInputVerifier(new searchv());
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 313, -1));

        txt_empid.setEditable(false);
        getContentPane().add(txt_empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 132, -1));

        txt_salary.setEditable(false);
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 132, -1));

        txt_dept.setEditable(false);
        getContentPane().add(txt_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 132, -1));

        txt_dob.setEditable(false);
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 132, -1));

        txt_firstname.setEditable(false);
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 132, -1));

        txt_surname.setEditable(false);
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 132, -1));

        txt_percent.setInputVerifier(new numbers());
        getContentPane().add(txt_percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 132, -1));

        txt_amt.setInputVerifier(new numbers());
        getContentPane().add(txt_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 132, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/update icon.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 160, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Basic Salary(in ₹):");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 114, 26));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/Calculate.png"))); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 166, 50));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/Right3Green.png"))); // NOI18N
        lbl_back.setText("Back");
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 50, 40));

        jLablel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLablel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLablel15.setText("Salary After Updation(in ₹):");
        getContentPane().add(jLablel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 170, 40));

        lbl_sau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_sau.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_sau.setText("0.00");
        getContentPane().add(lbl_sau, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 120, 40));

        lbl_ua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_ua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_ua.setText("0.00");
        getContentPane().add(lbl_ua, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 120, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Updated Amount(in ₹):");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 150, 40));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/erase-128.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 168, 50));

        label.setText("Logged in as:");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 584, 83, 20));

        lbl_emp.setText("emp");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 584, 140, 20));

        lbl_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/frame.jpg"))); // NOI18N
        lbl_pic.setPreferredSize(new java.awt.Dimension(901, 640));
        getContentPane().add(lbl_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
          try{

            String sql ="select * from Staff_information where id=?";

            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(txt_search.getText()));
            rs=pst.executeQuery();
            rs.next();
               String add1 =String.valueOf(rs.getInt("id"));
                txt_empid.setText(add1);

                String add2 =rs.getString("first_name");
                txt_firstname.setText(add2);

                String add3 =rs.getString("surname");
                txt_surname.setText(add3);

                String add4 =rs.getString("dob");
                txt_dob.setText(add4);

                String add5 =rs.getString("salary");
                txt_salary.setText(add5);

                String add8 =rs.getString("department");
                txt_dept.setText(add8);
            

        }catch(Exception e){
           e.printStackTrace();
        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
        int salary=Integer.parseInt(txt_salary.getText());
        
        if(r_percent.isSelected()==true)
        {
        int getPercentage=Integer.parseInt(txt_percent.getText());
        int calcPercentage= salary/100 * getPercentage + salary;
        String xp=String.valueOf(calcPercentage);
        txt_salary.setText(xp);
        }
        else
        {
        int getAmount=Integer.parseInt(txt_amt.getText());
        int calcamt=getAmount + salary;
        String xa=String.valueOf(calcamt);
        txt_salary.setText(xa);
        }
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
        try
        {
          int value1=Integer.parseInt(txt_empid.getText());
          String value2=txt_salary.getText();
          Statement st= null;
          String sql="update Staff_information set salary='"+value2+"' where id="+value1+"";
          st=conn.createStatement();
          /*pst.setString(1,txt_salary.getText());
          pst.setInt(2, Integer.parseInt(txt_empid.getText()));*/
          st.executeUpdate(sql);
          JOptionPane.showMessageDialog(null,"Record Updated");
          clear();
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r_percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentActionPerformed
        txt_amt.setText("");
        r_percent.setSelected(true);
        r_amt.setSelected(false);
        txt_percent.setEnabled(true);
        txt_amt.setEnabled(false);
        txt_percent.setText("");
        
    }//GEN-LAST:event_r_percentActionPerformed

    private void r_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amtActionPerformed
        txt_percent.setText("");
        r_percent.setSelected(false);
        r_amt.setSelected(true);
        txt_percent.setEnabled(false);
        txt_amt.setEnabled(true);
        txt_amt.setText("");
    }//GEN-LAST:event_r_amtActionPerformed

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        MainMenu o=new MainMenu();
        this.dispose();
        o.setVisible(true);
    }//GEN-LAST:event_lbl_backMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int salary = Integer.parseInt(txt_salary.getText());

        if(r_percent.isSelected()== true){
            int percentage = Integer.parseInt(txt_percent.getText());
            int total_percentage_updation = salary /100 * percentage;
            int salafterupd=salary+total_percentage_updation;
            lbl_ua.setText(String.valueOf(total_percentage_updation));
            lbl_sau.setText(String.valueOf(salafterupd));
        }

        if(r_amt.isSelected()== true){
            int updation = Integer.parseInt(txt_amt.getText());
            int total_amount_updation = updation;
            int salafterupd=salary+total_amount_updation;
            lbl_ua.setText(String.valueOf(total_amount_updation));
            lbl_sau.setText(String.valueOf(salafterupd));

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void clear()
    {
    
        txt_empid.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_dob.setText("");
        txt_dept.setText("");
        txt_salary.setText("");
        txt_percent.setText("");
        txt_amt.setText("");
        lbl_ua.setText("");
        lbl_sau.setText("");
        r_percent.setSelected(false);
        r_amt.setSelected(false);
        txt_percent.setEnabled(false);
        txt_amt.setEnabled(false);
    }

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
         id=txt_search.getText();
         txt_search.setText("");
    }//GEN-LAST:event_txt_searchFocusLost

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();

    }//GEN-LAST:event_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(updateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLablel15;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_pic;
    private javax.swing.JLabel lbl_sau;
    private javax.swing.JLabel lbl_ua;
    private javax.swing.JRadioButton r_amt;
    private javax.swing.JRadioButton r_percent;
    private javax.swing.JTextField txt_amt;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_empid;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_percent;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
    private String id=null;
}