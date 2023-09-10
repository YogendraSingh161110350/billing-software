
package AdminPage;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import  gettersetter.GetterSetter;
import dbOperation.DBOperator;
import java.awt.Color;
import javax.swing.JOptionPane;
import Validation.RegitraionVelidation;
public class ShowEmployeeDetails extends javax.swing.JFrame {
DefaultTableModel model;
   GetterSetter gs;
    public ShowEmployeeDetails(GetterSetter gs) {
        initComponents();
        this.gs= gs;
        model = (DefaultTableModel)jTable2.getModel();
        jLabel6.setText("WELCOME:"+gs.getName().toUpperCase());
        
        setTitle("EMPLOYEE DETAILS");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jTable2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL NO.", "NAME", "EMAIL", "PHONE NO. "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 810, 624));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("BACK");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 98, 70));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 340, 40));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 340, 40));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 340, 40));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 340, 40));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 102));
        jRadioButton1.setText("MALE");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 560, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 102));
        jRadioButton2.setText("FEMALE");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("NAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 158, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("EMAIL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 249, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("PHONE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 337, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 431, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/delete.png"))); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 626, 168, 52));

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/update.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1201, 626, 172, 52));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 730, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/LoginBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1610, 810));

        setSize(new java.awt.Dimension(1609, 792));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                String name = "";
                String email ="";
                String phone  ="";
                int count = 0;
                Object[] obj ;
                try
                {
                    ResultSet rs = dbOperation.DBOperator.showEmployeeTable();
                    while(rs.next())
                    {
                        count++;
                        name = rs.getString("name");
                        email = rs.getString("email");
                        phone = rs.getString("phone_number");
                        obj = new Object[]{count,name,email,phone};
                        model.addRow(obj);
                        
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      dbOperation.DBOperator.soundOfButton();
        new AdminPanel(gs).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        dbOperation.DBOperator.soundOfButton();
        try
      {
          int selected_row = jTable2.getSelectedRow();
          String item_id = (String)jTable2.getValueAt(selected_row, 2);
          ResultSet rs = dbOperation.DBOperator.fillValueInEmpDetailsTabale(item_id);
          if(rs.next())
             {
                    jTextField1.setText(rs.getString("name"));
                    jTextField2.setText(rs.getString("email"));
                    jTextField3.setText(rs.getString("phone_number"));
                    jTextField4.setText(rs.getString("password"));
                    if(rs.getString("gender").equals("m"))
                    {
                      jRadioButton1.setSelected(true);
                    }
                    else
                    {
                         jRadioButton2.setSelected(true);
                    }
                   
             }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dbOperation.DBOperator.soundOfButton();
        RegitraionVelidation rv = new RegitraionVelidation();
        String gender = "";
        GetterSetter gs = new GetterSetter();
       gs.setName(jTextField1.getText());
       gs.setEmail(jTextField2.getText());
       gs.setMobile(jTextField3.getText());
       gs.setPassword(jTextField4.getText());
       if(jRadioButton1.isSelected())
       {
           gender = "m";
       }
       else
       {
           gender = "f";
       }
        
       gs.setGender(gender);
       if(!rv.nameValidtaion(jTextField1.getText()))
       {
           JOptionPane.showMessageDialog(rootPane,"please enter valid name", "name warning", JOptionPane.WARNING_MESSAGE);
       }
       else if(!jRadioButton1.isSelected()&&!jRadioButton2.isSelected())
       {
           JOptionPane.showMessageDialog(rootPane, "gender can not be empty", "gender empty", JOptionPane.WARNING_MESSAGE);
       }
       else if(!rv.phoneValdition(jTextField3.getText()))
       {
           JOptionPane.showMessageDialog(rootPane, "phone number is not valid", "phone number warning", JOptionPane.WARNING_MESSAGE);
       }
       else if(jTextField4.getText().length()<6)
       {
       
           JOptionPane.showMessageDialog(rootPane, "password must have  minimum 6 charchters ", gender, HEIGHT);
       }
      else
       {
             int a= DBOperator.updateEmployee(gs);
             if(a>0)
             {
                  JOptionPane.showMessageDialog(rootPane, "record has updated");
                  new ShowEmployeeDetails(gs).setVisible(true);
                  setVisible(false);
             }
              else
                {
                  JOptionPane.showMessageDialog(rootPane, "record could not update", "failed", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dbOperation.DBOperator.soundOfButton();
        boolean a = DBOperator.deleteEmployee(jTextField2.getText());
        if(!a)
        {
            JOptionPane.showMessageDialog(rootPane, "record has deleted");
            new ShowEmployeeDetails(gs).setVisible(true);
            setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "record has not deleted", "failed", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
       jLabel1.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
