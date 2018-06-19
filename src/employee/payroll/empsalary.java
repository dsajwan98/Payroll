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
 * @author dsajw
 */
public class empsalary extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    /**
     * Creates new form empsalary
     */
    public empsalary() {
        initComponents();
         conn=db.getConnection();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
         lbl_emp.setText(Emp.username);
        fill();
    }
    public void fill()
    {
        try{

            String sql ="select * from Staff_information where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setInt(1,Emp.empId);
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
            rs.close();
            pst.close();
          
                String sql1 ="select * from Deductions where emp_id = "+Emp.empId+"";
                pst=conn.prepareStatement(sql1);
                rs=pst.executeQuery();
                rs.next();
                txt_pf.setText(rs.getString("pf"));
                txt_it.setText(rs.getString("it"));
                txt_od.setText(rs.getString("others"));
                String val=rs.getString("total_deductions");
                txt_td.setText(val);
                rs.close();
                pst.close();

                String sq ="select * from Allowance where id = "+Emp.empId+"";
                pst=conn.prepareStatement(sq);
                rs=pst.executeQuery();
                rs.next();

                int calcTotal = Integer.parseInt(txt_salary.getText());
                float x = Float.valueOf(rs.getString("total_allowance"));
                int v = Integer.parseInt(val);
                float total = calcTotal+ x -v;
                txt_ot.setText(rs.getString("overtime"));
                txt_med.setText(rs.getString("medical"));
                txt_da.setText(rs.getString("da"));
                txt_hra.setText(rs.getString("hra"));
                txt_bonus.setText(rs.getString("bonus"));
                txt_other.setText(rs.getString("other"));
                txt_te.setText(rs.getString("total_allowance"));
                txt_np.setText(String.valueOf(total));

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

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_back = new javax.swing.JLabel();
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
        jLabel21 = new javax.swing.JLabel();
        txt_te = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_ot = new javax.swing.JTextField();
        txt_med = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_bonus = new javax.swing.JTextField();
        txt_other = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_td = new javax.swing.JTextField();
        txt_np = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        txt_da = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_hra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_pf = new javax.swing.JTextField();
        txt_it = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_od = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(901, 655));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/Right3Green.png"))); // NOI18N
        lbl_back.setText("Back");
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 50, 40));

        txt_dep.setEditable(false);
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 177, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Employee ID :");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 30));

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 177, 30));

        txt_firstname.setEditable(false);
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 177, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("First name :");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Surname :");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 30));

        txt_surname.setEditable(false);
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 177, 30));

        txt_dob.setEditable(false);
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 177, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date of Birth :");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        txt_desig.setEditable(false);
        getContentPane().add(txt_desig, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 177, 30));

        txt_status.setEditable(false);
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 177, 30));

        txt_doj.setEditable(false);
        getContentPane().add(txt_doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 177, 30));

        txt_job.setEditable(false);
        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 177, 30));

        txt_salary.setEditable(false);
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 177, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Basic Salary(in ₹) :");
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 110, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Job Title :");
        jLabel20.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Date Hired :");
        jLabel19.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Status :");
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Designation :");
        jLabel17.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Department :");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/slip.png"))); // NOI18N
        jButton1.setText("Generate Slip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 549, 165, 40));

        jLabel21.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SALARY DETAILS");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 350, 60));

        txt_te.setEditable(false);
        getContentPane().add(txt_te, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 177, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Overtime(in hours):");
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 120, 30));

        txt_ot.setEditable(false);
        getContentPane().add(txt_ot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 177, 30));

        txt_med.setEditable(false);
        txt_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medActionPerformed(evt);
            }
        });
        getContentPane().add(txt_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 177, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Medical(in ₹):");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Bonus(in ₹):");
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, 30));

        txt_bonus.setEditable(false);
        getContentPane().add(txt_bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 177, 30));

        txt_other.setEditable(false);
        getContentPane().add(txt_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 177, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Other Allowances(in ₹):");
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 140, 30));

        txt_td.setEditable(false);
        getContentPane().add(txt_td, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 177, 30));

        txt_np.setEditable(false);
        getContentPane().add(txt_np, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 177, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Net Pay(in ₹):");
        jLabel24.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Gross Deductions(in ₹):");
        jLabel25.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 150, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Gross Earnings(in ₹):");
        jLabel15.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 120, 30));

        label.setText("Logged in as:");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 80, 20));

        lbl_emp.setText("Administrator");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 140, 20));

        txt_da.setEditable(false);
        txt_da.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_daActionPerformed(evt);
            }
        });
        getContentPane().add(txt_da, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 177, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("DA(in ₹):");
        jLabel14.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 30));

        txt_hra.setEditable(false);
        txt_hra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hraActionPerformed(evt);
            }
        });
        getContentPane().add(txt_hra, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 177, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("HRA(in ₹):");
        jLabel16.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, 30));

        txt_pf.setEditable(false);
        getContentPane().add(txt_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 177, 30));

        txt_it.setEditable(false);
        getContentPane().add(txt_it, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 177, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Income Tax(in ₹):");
        jLabel26.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Provident Fund(in ₹):");
        jLabel27.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 150, 30));

        txt_od.setEditable(false);
        getContentPane().add(txt_od, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 177, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Other Deductions(in ₹):");
        jLabel28.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 150, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/frame.jpg"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txt_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medActionPerformed

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        Interface o=new Interface();
        this.dispose();
        o.setVisible(true);
    }//GEN-LAST:event_lbl_backMouseClicked

    private void txt_daActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_daActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_daActionPerformed

    private void txt_hraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hraActionPerformed

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
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empsalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JTextField txt_bonus;
    private javax.swing.JTextField txt_da;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_desig;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hra;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_it;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_med;
    private javax.swing.JTextField txt_np;
    private javax.swing.JTextField txt_od;
    private javax.swing.JTextField txt_ot;
    private javax.swing.JTextField txt_other;
    private javax.swing.JTextField txt_pf;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_td;
    private javax.swing.JTextField txt_te;
    // End of variables declaration//GEN-END:variables

}