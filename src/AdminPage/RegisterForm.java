package AdminPage;

import Validation.RegitraionVelidation;
import dbOperation.DBOperator;
import gettersetter.GetterSetter;
import java.awt.Color;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {
   GetterSetter gs;
    public RegisterForm(GetterSetter gs) {
        initComponents();
        this.gs = gs;
        jLabel7.setText("WELCOME:"+gs.getName().toUpperCase());
        
        setTitle("REGISTRATION FORM");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 360, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("NAME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 23, 184, 58));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 23, 362, 58));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("EMAIL:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 174, 200, 53));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("PASSWORD:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 298, 200, 49));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 102));
        jRadioButton1.setText("MALE");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 93, 89, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 102));
        jRadioButton2.setText("FEMALE");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 93, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 174, 362, 53));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 293, 362, 59));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("PHONE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 416, 153, 54));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 402, 362, 68));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/login.png"))); // NOI18N
        jButton2.setText("CONTINUE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 260, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 740, 650));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("BACK");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 120, 47));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 630, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(102, 102, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/addEmployeeImage.png"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 790, 660));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 780, 650));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/LoginBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 910));

        setSize(new java.awt.Dimension(1693, 915));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dbOperation.DBOperator.soundOfButton();
        try
        {
            RegitraionVelidation rv = new RegitraionVelidation();
           
            String gender = "";      
            if(jRadioButton1.isSelected())
            {
                gender = "m";
            }
            else
            {
                gender = "f";
            }
           // --------------------------------------------------
            GetterSetter gs = new GetterSetter();
            gs.setName(jTextField1.getText());
            gs.setEmail(jTextField2.getText());
            gs.setGender(gender);
            gs.setPassword(jTextField3.getText());
            gs.setMobile(jTextField4.getText());
            //---------------------------------------------------------
            DBOperator dbo = new DBOperator(gs);
            if(dbo.registerEmployee())
            {
                        
                    if(!rv.nameValidtaion(jTextField1.getText()))
                    {
                        JOptionPane.showMessageDialog(rootPane, " name is not valid", "name invalid", JOptionPane.WARNING_MESSAGE);
                     }
                    else if(!jRadioButton1.isSelected()&&!jRadioButton2.isSelected())
                    {
                       JOptionPane.showMessageDialog(rootPane, "please select the gender", "gender not selected", JOptionPane.WARNING_MESSAGE);
                    
                    }
                    else if(!rv.emailValidation(jTextField2.getText()))
                    {
                        JOptionPane.showMessageDialog(rootPane, "email name is not valid", "invalid email", JOptionPane.WARNING_MESSAGE);
                     }
                    else if(jTextField3.getText().length()<6)
                    {
                       JOptionPane.showMessageDialog(rootPane, "you have to create minimum 6 charcter password for security", "invalid password", JOptionPane.WARNING_MESSAGE);

                    }
                    else if(!rv.phoneValdition(jTextField4.getText()))
                    {
                        JOptionPane.showMessageDialog(rootPane, "mobile number is not valid", "invalid mobile number", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "record has saved");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        buttonGroup1.clearSelection();
                     }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "record could not save", "error", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dbOperation.DBOperator.soundOfButton();
        new AdminPanel(gs).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
      jLabel6.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
       jLabel6.setForeground(Color.red);
    }//GEN-LAST:event_jLabel6MouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
