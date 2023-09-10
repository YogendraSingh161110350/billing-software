
package EmployeePage;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import gettersetter.GetterSetter;
import java.awt.print.PrinterJob;

public class PaymentPanel extends javax.swing.JFrame {

    HashMap< String, ArrayList> hm ;
    String name,phone,total_ammount;
    GetterSetter gs;
    public PaymentPanel(GetterSetter gs,HashMap hm,String... details) {
        initComponents();
        this.gs = gs;
        this.hm  =hm;
        this.name = details[0];
        this.phone = details[1];
        this.total_ammount = details[2];
         jLabel9.setText("WELCOME "+gs.getName());
        jLabel4.setText(total_ammount);
     
        jLabel6.setText(name+" biil:");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("TOTAL BILL:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 228, 219, 39));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("____________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 418, 312, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("CASH DEPOSITED: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 313, -1, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("____________________");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 228, 312, 39));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 313, 312, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 320, 37));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setText("costumer name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 136, 356, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/login.png"))); // NOI18N
        jButton1.setText("CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 430, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("-----");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("0");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 53));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("0");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 53));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("-----");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, 25));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("0");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, 53));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("-----");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, 25));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setText("0");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, 53));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("BACK");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 20, -1, 37));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("employee name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 327, 37));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/printer-.png"))); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 660, 250, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/LoginBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, -10, 1510, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       
        try
        {
            if(!jTextField1.getText().isEmpty())
        {
                    String payment_from_costumer = jTextField1.getText();
                    int total_audit =Integer.parseInt(payment_from_costumer)-Integer.parseInt(total_ammount);
                    if(total_audit<0 )
                    {
                        jLabel5.setText("due payment :");
                        jLabel2.setText(-(total_audit)+" INR");
                        jLabel2.setForeground(Color.red);
                    }
                        else if(total_audit>=0)
                    {
                         jLabel5.setText("return payment :");
                         jLabel2.setText(total_audit+" INR");
                         jLabel2.setForeground(Color.green);
                    }
               }
        else
        {
                         jLabel5.setText("due payment :");
                        jLabel2.setForeground(Color.red);
                         jLabel2.setText(total_ammount);
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "enter only digits not alphabet or symboles", "ammont erroe", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
       jLabel7.setForeground(Color.red);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new CostumerDetails(hm,gs).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String items_details =  hashTableStringvalue();
        LocalTime lt = LocalTime.now();
        String timee = lt.toString();
        LocalDate ld = LocalDate.now();
        String datee = ld.toString();
        String employee_email =gs.getEmail();
        String costumer_phone = phone;
        int a = dbOperation.DBOperator.insertCostumerHistory(phone,items_details,datee,timee,employee_email);
        if(a>0)
        {
            JOptionPane.showMessageDialog(rootPane, "record has saved");
            new EmployeePanel(gs).setVisible(true);
            setVisible(false);
            gs.setSell(Integer.parseInt(total_ammount));
            System.out.println(gs.getSell());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          PrinterJob pj = PrinterJob.getPrinterJob();
        if(pj.printDialog()){
            try{
                pj.print();
            }catch(Exception e){
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
  
    public String hashTableStringvalue()
    {
        String item = "";
        for(Map.Entry em: hm.entrySet())
        {
            item = item +(String)em.getKey()+",";
            ArrayList al = (ArrayList)em.getValue();
            item = item+ al.get(0)+",";
            item = item+ al.get(1)+",";
            item = item+ al.get(2)+",";
        }
        
        return item;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
