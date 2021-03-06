/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Hyrex
 */
public class searchEmpSalarySlip extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form searchEmpSalarySlip
     */
    public searchEmpSalarySlip() {
        initComponents();
        conn=db.getConnection();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
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

        jLabel3 = new javax.swing.JLabel();
        txt_dep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_desig = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_doj = new javax.swing.JTextField();
        txt_job = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        lbl_emp = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();
        lbl_pic = new javax.swing.JLabel();

        jLabel3.setText("Date of Birth :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(901, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_dep.setEditable(false);
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 177, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Employee ID :");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 177, -1));

        txt_firstname.setEditable(false);
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 177, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("First name :");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Surname :");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txt_surname.setEditable(false);
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 177, -1));

        txt_dob.setEditable(false);
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 177, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date of Birth :");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txt_desig.setEditable(false);
        getContentPane().add(txt_desig, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 177, -1));

        txt_status.setEditable(false);
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 177, -1));

        txt_doj.setEditable(false);
        getContentPane().add(txt_doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 177, -1));

        txt_job.setEditable(false);
        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 177, -1));

        txt_salary.setEditable(false);
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 177, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Basic Salary(in ₹) :");
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 110, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Job Title :");
        jLabel20.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Date Hired :");
        jLabel19.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Status :");
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Designation :");
        jLabel17.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Department :");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/slip.png"))); // NOI18N
        jButton1.setText("Generate Slip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 375, 165, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Search By Employee ID :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        txt_search.setInputVerifier(new searchv());
        txt_search.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                txt_searchComponentRemoved(evt);
            }
        });
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 410, -1));

        lbl_emp.setText("Administrator");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 140, 20));

        label.setText("Logged in as:");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 80, 20));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/Right3Green.png"))); // NOI18N
        lbl_back.setText("Back");
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 50, 40));

        lbl_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/frame.jpg"))); // NOI18N
        lbl_pic.setPreferredSize(new java.awt.Dimension(901, 640));
        getContentPane().add(lbl_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_searchComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchComponentRemoved

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try{

            String sql ="select * from Staff_information where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(txt_search.getText()));
            rs=pst.executeQuery();
            rs.next();
            String add1 =String.valueOf(rs.getInt("id"));
            txt_id.setText(add1);

            String add2 =rs.getString("first_name");
            txt_firstname.setText(add2);

            String add3 =rs.getString("surname");
            txt_surname.setText(add3);

            String add4 =rs.getString("Dob");
            txt_dob.setText(add4);

            String add5 =rs.getString("Department");
            txt_dep.setText(add5);

            String add7 =rs.getString("Salary");
            txt_salary.setText(add7);

            String add8 =rs.getString("Status");
            txt_status.setText(add8);

            String add9 =rs.getString("Date_hired");
            txt_doj.setText(add9);

            String add10 =rs.getString("job_title");
            txt_job.setText(add10);

            String add17 =rs.getString("Designation");
            txt_desig.setText(add17);


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

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        // TODO add your handling code here:
            String value = txt_firstname.getText();
            String value0 = txt_surname.getText();
            int value1 = Integer.parseInt(txt_id.getText());
            String value2 = txt_desig.getText();
            String value3 = txt_dep.getText();
                                                      
            
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(value +" "+ value0+"-Salary Slip"+".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
           
        try {
            // TODO add your handling code here:
            
            
           String sql ="select * from Deductions where emp_id = "+value1+"";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                rs.next();
                String pf = rs.getString("pf");
                String it = rs.getString("it");
                String other = rs.getString("others");
                String totald = rs.getString("total_deductions");
                rs.close();
                pst.close();

                String sq ="select * from Allowance where id = "+value1+"";
                pst=conn.prepareStatement(sq);
                rs=pst.executeQuery();
                rs.next();

                int calcTotal = Integer.parseInt(txt_salary.getText());
                float x = Float.valueOf(rs.getString("total_allowance"));
                int v = Integer.parseInt(totald);
                float total = calcTotal+ x -v;

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                myDocument.open();

                myDocument.add(new Paragraph("PAY SLIP",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add((new Paragraph("EMPLOYEE DETAILS",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD))));
                myDocument.add((new Paragraph("Name of Employee: " +value + " "+value0,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                myDocument.add((new Paragraph("Designation: "+value2,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                myDocument.add((new Paragraph("Department: "+value3,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("SALARY",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                myDocument.add(new Paragraph("Basic Salary: ₹"+calcTotal,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("ALLOWANCES",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                myDocument.add(new Paragraph("Overtime: "+rs.getString("overtime")+" Hours",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("DA: ₹" +rs.getString("da"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("HRA: ₹" +rs.getString("hra"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));        
                myDocument.add(new Paragraph("Medical: ₹" +rs.getString("medical"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Bonus: ₹"+rs.getString("bonus"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Other Allowances: ₹"+rs.getString("other"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("DEDUCTIONS",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                myDocument.add(new Paragraph("Provident Fund  : ₹"+pf,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Income Tax : ₹"+it ,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Other Deductions : ₹"+other ,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("TOTAL PAYMENT",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                myDocument.add(new Paragraph("Gross Earnings: ₹"+rs.getString("total_allowance"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Gross Deductions : ₹"+totald ,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Net Pay : ₹" +total,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));

           
           myDocument.newPage();
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"Report was successfully generated");
           
     }
        catch(Exception e){
            
            e.printStackTrace();
         
         
     }
     finally {
            
            try{
               rs.close();
               pst.close();
                
            }
            catch(Exception e){
            
            e.printStackTrace();
         
            }
     }
   }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        MainMenu o=new MainMenu();
        this.dispose();
        o.setVisible(true);
    }//GEN-LAST:event_lbl_backMouseClicked

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
       id=txt_search.getText();
       txt_search.setText("");
       
    }//GEN-LAST:event_txt_searchFocusLost

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
            java.util.logging.Logger.getLogger(searchEmpSalarySlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchEmpSalarySlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchEmpSalarySlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchEmpSalarySlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchEmpSalarySlip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_pic;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_desig;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
private String id=null;
}
