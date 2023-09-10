package AdminPage;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import gettersetter.GetterSetter;
import java.awt.Color;

public class ChangePassword extends javax.swing.JFrame {
    GetterSetter gs;
    public ChangePassword(GetterSetter gs) {
        initComponents();
        setTitle("CHANGE PASSWORD");
        this.gs = gs;
        jLabel6.setText("WELCOME:"+gs.getName().toUpperCase());
        setResizable(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("CHANGE PASSWORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 521, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("OLD PASSWORD:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 237, 55));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 472, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("NEW PASSWORD:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 237, 58));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 262, 472, 58));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/update.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 950, 530));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("BACK");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 20, 120, 37));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 600, 52));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/LoginBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       dbOperation.DBOperator.soundOfButton();
        new AdminPanel(gs).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dbOperation.DBOperator.soundOfButton();
        String old_password = jTextField2.getText();
       String new_password = jTextField3.getText();
       ResultSet rs = dbOperation.DBOperator.checkOldPassword(old_password);
       try
       {
           
           if(rs.next())
           {
               System.out.println(new_password);
              if(new_password.length()>=6)
              {
                   boolean is_update = dbOperation.DBOperator.changePassword(new_password);
                    if(is_update)
                    {
                        JOptionPane.showMessageDialog(rootPane, "password is updated");
                        new AdminPanel(gs).setVisible(true);
                        setVisible(false);
                    }
                    
                     else
                    {
                         JOptionPane.showMessageDialog(rootPane, "password can not updated", "password error", JOptionPane.ERROR_MESSAGE);
                    }
              }
              else
              {
                    JOptionPane.showMessageDialog(rootPane, "length of password minimum 6 or more than charecters ", "new password error", JOptionPane.ERROR_MESSAGE);
              }  
           }
           else
           {
               JOptionPane.showMessageDialog(rootPane, "old password is wrong", "wrong password", JOptionPane.ERROR_MESSAGE);
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
       jLabel5.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
       jLabel5.setForeground(Color.red);
    }//GEN-LAST:event_jLabel5MouseExited

    
//---------------CHANGE PASSWORD METHOD-----------------------------------------------
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
