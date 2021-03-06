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
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Hyrex
 */
public class employeeDeductions extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
    /**
     * Creates new form employeeDeductions
     */
    public employeeDeductions() {
        initComponents();
         conn=db.getConnection();
         
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        lbl_emp.setText(Emp.username);
    }
    public void clear()
    {
    
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_dob.setText("");
        txt_dep.setText("");
        txt_status.setText("");
        txt_salary.setText("");
        txt_p1.setText("");
        txt_p.setText("");
        txt_a.setText("");
        txt_a1.setText("");
        txt_desig.setText("");
        txt_job.setText("");        
        txt_other.setText("");
        txt_doj.setText("");
        r_percentage.setSelected(false);
        r_amount.setSelected(false); 
        r_percentage1.setSelected(false);
        r_amount1.setSelected(false);
        lbl_total.setText("0.00");
        txt_pf.setText("0");
        txt_it.setText("0");
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
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_dep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_desig = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_doj = new javax.swing.JTextField();
        txt_job = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        txt_Save = new javax.swing.JButton();
        lbl_total = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        txt_p = new javax.swing.JTextField();
        txt_search = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_pf = new javax.swing.JTextField();
        txt_it = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        r_percentage1 = new javax.swing.JRadioButton();
        r_amount1 = new javax.swing.JRadioButton();
        txt_a1 = new javax.swing.JTextField();
        txt_a = new javax.swing.JTextField();
        txt_p1 = new javax.swing.JTextField();
        txt_other = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        lbl_pic = new javax.swing.JLabel();
        txt_deduction3 = new javax.swing.JTextField();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/frame.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 177, -1));

        txt_firstname.setEditable(false);
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 177, -1));

        txt_surname.setEditable(false);
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 177, -1));

        txt_dob.setEditable(false);
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 177, -1));

        txt_dep.setEditable(false);
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 177, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Basic Salary(in ₹) :");
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 110, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Job Title :");
        jLabel20.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Date Hired :");
        jLabel19.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Status :");
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Designation :");
        jLabel17.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 20));

        txt_desig.setEditable(false);
        getContentPane().add(txt_desig, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 177, -1));

        txt_status.setEditable(false);
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 177, -1));

        txt_doj.setEditable(false);
        getContentPane().add(txt_doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 177, -1));

        txt_job.setEditable(false);
        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 177, -1));

        txt_salary.setEditable(false);
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 177, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Department :");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 255, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date of Birth :");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 225, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Surname :");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 195, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("First name :");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 165, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Employee id :");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 135, -1, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/Calculate.png"))); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 166, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total Deduction(in ₹):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/erase-128.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 168, 36));

        txt_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/Save-icon.png"))); // NOI18N
        txt_Save.setText("Save");
        txt_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 166, 36));

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total.setText("0.00");
        getContentPane().add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 63, -1));

        r_percentage.setText("Percentage (%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });
        getContentPane().add(r_percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 350, 110, -1));

        r_amount.setText("Amount");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });
        getContentPane().add(r_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 90, -1));

        txt_p.setEditable(false);
        txt_p.setEnabled(false);
        txt_p.setInputVerifier(new searchv());
        txt_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pKeyTyped(evt);
            }
        });
        getContentPane().add(txt_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, -1));

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
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Search By Employee ID :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/Right3Green.png"))); // NOI18N
        lbl_back.setText("Back");
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 50, 40));

        label.setText("Logged in as:");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 80, -1));

        lbl_emp.setText("emp");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 150, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Provident Fund:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, 30));

        txt_pf.setEditable(false);
        txt_pf.setText("0");
        txt_pf.setInputVerifier(new numbers());
        getContentPane().add(txt_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 200, 30));

        txt_it.setEditable(false);
        txt_it.setText("0");
        txt_it.setInputVerifier(new numbers());
        getContentPane().add(txt_it, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 200, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Income Tax:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 120, 30));

        r_percentage1.setText("Percentage (%)");
        r_percentage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentage1ActionPerformed(evt);
            }
        });
        getContentPane().add(r_percentage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 110, -1));

        r_amount1.setText("Amount");
        r_amount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amount1ActionPerformed(evt);
            }
        });
        getContentPane().add(r_amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 100, -1));

        txt_a1.setEditable(false);
        txt_a1.setEnabled(false);
        txt_a1.setInputVerifier(new searchv());
        txt_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_a1ActionPerformed(evt);
            }
        });
        txt_a1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_a1KeyReleased(evt);
            }
        });
        getContentPane().add(txt_a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 100, -1));

        txt_a.setEditable(false);
        txt_a.setEnabled(false);
        txt_a.setInputVerifier(new searchv());
        txt_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_aKeyReleased(evt);
            }
        });
        getContentPane().add(txt_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 100, -1));

        txt_p1.setEditable(false);
        txt_p1.setEnabled(false);
        txt_p1.setInputVerifier(new searchv());
        txt_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_p1ActionPerformed(evt);
            }
        });
        txt_p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_p1KeyReleased(evt);
            }
        });
        getContentPane().add(txt_p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 100, -1));

        txt_other.setText("0");
        txt_other.setInputVerifier(new numbers());
        getContentPane().add(txt_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 200, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Others:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 30));

        lbl_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/frame.jpg"))); // NOI18N
        lbl_pic.setPreferredSize(new java.awt.Dimension(901, 640));
        getContentPane().add(lbl_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        txt_deduction3.setEditable(false);
        txt_deduction3.setEnabled(false);
        txt_deduction3.setInputVerifier(new numbers());
        getContentPane().add(txt_deduction3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 100, -1));

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

    private void txt_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SaveActionPerformed
        // TODO add your handling code here:
        
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){

            
            try {
     
                String sql ="insert into Deductions (emp_id,made_by,firstname,surname,salary,pf,it,others,total_deductions) values (?,?,?,?,?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                pst.setInt(1,Integer.parseInt(txt_id.getText()));
                pst.setString(2,String.valueOf(Emp.empId));
                pst.setString(3,txt_firstname.getText());
                pst.setString(4,txt_surname.getText());
                pst.setString(5,txt_salary.getText());
                pst.setString(6,txt_pf.getText());
                pst.setString(7,txt_it.getText());
                pst.setString(8,txt_other.getText());
                pst.setString(9,lbl_total.getText());
  
                pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");
               

            }
            catch(SQLIntegrityConstraintViolationException e1)
                {
                    int z= JOptionPane.showConfirmDialog(this,"Do you want to update the existing Record","Deduction Record Exists",JOptionPane.YES_NO_OPTION);
                    if(z==0)
                    {
                            try
                               { 
                                    String sql ="update Deductions set emp_id=?,made_by=?,firstname=?,surname=?,salary=?,pf=?,it=?,others=?,total_deductions=? where emp_id=?";
                                    pst=conn.prepareStatement(sql);
                                    pst.setInt(1,Integer.parseInt(txt_id.getText()));
                                    pst.setString(2,String.valueOf(Emp.empId));
                                    pst.setString(3,txt_firstname.getText());
                                    pst.setString(4,txt_surname.getText());
                                    pst.setString(5,txt_salary.getText());
                                    pst.setString(6,txt_pf.getText());
                                    pst.setString(7,txt_it.getText());
                                    pst.setString(8,txt_other.getText());
                                    pst.setString(9,lbl_total.getText());
                                    pst.setInt(10,Integer.parseInt(txt_id.getText()));
                                    pst.execute();
                                    JOptionPane.showMessageDialog(null,"Data is updated successfully");
                           }

                            catch(Exception e)
                            {
                              e.printStackTrace();
                            }

                    }
                }
            catch (Exception e)

            {
                e.printStackTrace();
            }
            
           try{
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String values = dateString;
            int val = Emp.empId;
            
            
                String reg= "insert into Audit (emp_id, date, status) values ("+val+",'"+value0+" / "+values+"','Updated Record')";
                pst=conn.prepareStatement(reg);
                pst.execute();
            }
          catch (Exception e)

            {
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
        
    }//GEN-LAST:event_txt_SaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int pf=Integer.parseInt(txt_pf.getText());
      int it=Integer.parseInt(txt_it.getText());
      int other=Integer.parseInt(txt_other.getText());
      int total=pf+other+it;
      lbl_total.setText(String.valueOf(total));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
     clear();
        
    }//GEN-LAST:event_clearActionPerformed

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

            String add4 =rs.getString("dob");
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
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_searchComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchComponentRemoved

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        MainMenu o=new MainMenu();
        this.dispose();
        o.setVisible(true);
    }//GEN-LAST:event_lbl_backMouseClicked

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
       id=txt_search.getText();
       txt_search.setText("");
    }//GEN-LAST:event_txt_searchFocusLost

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_p.setEnabled(false);
        txt_a.setEditable(true);
        txt_a.setEnabled(true);
        txt_p.setText("");
        txt_pf.setText("0");
    }//GEN-LAST:event_r_amountActionPerformed

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
        r_percentage.setSelected(true);
        r_amount.setSelected(false);
        //r_amount.setEnabled(false);
        txt_a.setEnabled(false);
        txt_p.setEditable(true);
        txt_p.setEnabled(true);
        txt_a.setText("");
        txt_pf.setText("0");
    }//GEN-LAST:event_r_percentageActionPerformed

    private void r_percentage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentage1ActionPerformed
        r_percentage1.setSelected(true);
        r_amount1.setSelected(false);
        //r_amount.setEnabled(false);
        txt_a1.setEnabled(false);
        txt_p1.setEditable(true);
        txt_p1.setEnabled(true);
        txt_a1.setText("");
        txt_it.setText("0");
    }//GEN-LAST:event_r_percentage1ActionPerformed

    private void r_amount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amount1ActionPerformed
        r_amount1.setSelected(true);
        r_percentage1.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_p1.setEnabled(false);
        txt_a1.setEditable(true);
        txt_a1.setEnabled(true);
        txt_p1.setText("");
        txt_it.setText("0");
    }//GEN-LAST:event_r_amount1ActionPerformed

    private void txt_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_p1ActionPerformed

    private void txt_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_a1ActionPerformed

    private void txt_pKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pKeyReleased
       int salary = Integer.parseInt(txt_salary.getText());
        int p = Integer.parseInt(txt_p.getText());
        int total_p_deduction = salary /100 * p;
        String x = String.valueOf(total_p_deduction);
        txt_pf.setText(x);
    }//GEN-LAST:event_txt_pKeyReleased

    private void txt_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pKeyTyped
       
    }//GEN-LAST:event_txt_pKeyTyped

    private void txt_pKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pKeyPressed
        
    }//GEN-LAST:event_txt_pKeyPressed

    private void txt_aKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyReleased
        int salary = Integer.parseInt(txt_salary.getText());
        int p = Integer.parseInt(txt_a.getText());
        int total_p_deduction = p;
        String x = String.valueOf(total_p_deduction);
        txt_pf.setText(x);
    }//GEN-LAST:event_txt_aKeyReleased

    private void txt_p1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p1KeyReleased
       int salary = Integer.parseInt(txt_salary.getText());
        int p1 = Integer.parseInt(txt_p1.getText());
        int total_p1_deduction = salary /100 * p1;
        String x = String.valueOf(total_p1_deduction);
        txt_it.setText(x);
    }//GEN-LAST:event_txt_p1KeyReleased

    private void txt_a1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_a1KeyReleased
        int salary = Integer.parseInt(txt_salary.getText());
        int a1 = Integer.parseInt(txt_a1.getText());
        int total_a1_deduction = a1;
        String x = String.valueOf(total_a1_deduction);
        txt_it.setText(x);
    }//GEN-LAST:event_txt_a1KeyReleased

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
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeDeductions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_pic;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_amount1;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JRadioButton r_percentage1;
    private javax.swing.JButton txt_Save;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_a1;
    private javax.swing.JTextField txt_deduction3;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_desig;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_it;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_other;
    private javax.swing.JTextField txt_p;
    private javax.swing.JTextField txt_p1;
    private javax.swing.JTextField txt_pf;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
  private String id=null;
}
