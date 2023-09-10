
package AdminPage;

import gettersetter.GetterSetter;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AddItems extends javax.swing.JFrame {
    GetterSetter gs;
    File file;
    public AddItems(GetterSetter gs) {
        initComponents();
        setTitle("ADD ITEMS");
        this.gs = gs;
        jLabel8.setText("WELCOME:"+gs.getName().toUpperCase());
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 349, 39));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 349, 39));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 349, 37));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 112, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("ITEM ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("ITEM NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("ITEM PRICE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("ITEM CATEGORY:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT CATEGORY", "CLOTHING,SHOES & JEWELRY", "ARTS,CARFTS", "BEUTY AND PERSONAL CARE", "HOME & KITCHEN", "SPORTS AND OUTDOORS", "TOYES GAMES", "CELL PHONE ACCESSORIES", "BOOKS", "TOOL AND HOME IMPROVEMENT", "ELECTRONICS", "APPLIANCES" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 349, 49));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("DESCROPTION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 145, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/selectImage1.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 193, 184));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 23)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/add2.png"))); // NOI18N
        jButton1.setText("choose image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 574, 230, 60));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 498, 146));

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/login.png"))); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 574, 210, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 469, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/LoginBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1400, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dbOperation.DBOperator.soundOfButton();
        new AdminPanel(gs).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dbOperation.DBOperator.soundOfButton();
        BufferedImage img = null;
        JFileChooser jfc = new JFileChooser();
        int open = jfc.showOpenDialog(rootPane);
        
        if(open==0)
        {
            try
            {
                file = jfc.getSelectedFile();
                img = ImageIO.read(file);
                Image dimg = img.getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(), Image.SCALE_SMOOTH);
                jLabel7.setIcon(new ImageIcon(dimg));
                //FileInputStream fis = new FileInputStream(file);
                //jLabel7.setIcon(new ImageIcon(file.getAbsolutePath()));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dbOperation.DBOperator.soundOfButton();
        String item_id = jTextField1.getText();
       String item_name = jTextField2.getText();
       String item_price = jTextField3.getText();
       String item_category = (String)jComboBox1.getSelectedItem();
       String item_desc = jTextArea1.getText();
       try
       {
           if(item_id.length()<2)
           {
               JOptionPane.showMessageDialog(rootPane, "item id must be minimum 3 charcters", "item id problem", JOptionPane.ERROR_MESSAGE);
           }
           else if(item_name.length()<1)
           {
               JOptionPane.showMessageDialog(rootPane, "item name must be contain minimum 2 charcters", "item name problem", JOptionPane.ERROR_MESSAGE);
               
           }
           else if(item_price.length()<1)
           {
              JOptionPane.showMessageDialog(rootPane, "enter price", "item price problem", JOptionPane.ERROR_MESSAGE);
              
           }
           else if(item_category.equalsIgnoreCase("select category"))
           {
               JOptionPane.showMessageDialog(rootPane, "select any category", "item category problem", JOptionPane.ERROR_MESSAGE);
           }
           else if(item_desc.length()<1)
           {
               JOptionPane.showMessageDialog(rootPane, "enter any description about product", "item description", JOptionPane.ERROR_MESSAGE);
           }
           else if(file==null)
           {
             JOptionPane.showMessageDialog(rootPane, "please choose image of item", "item image problem", JOptionPane.ERROR_MESSAGE);
           }
           else
           {    Integer.parseInt(item_price);
                FileInputStream fis = new FileInputStream(file);
                boolean is_inseted = dbOperation.DBOperator.saveItemDataInDatabase(fis, item_id,item_name,item_price,item_category,item_desc);
                 if(is_inseted)
                    {
                        JOptionPane.showMessageDialog(rootPane, "record is updated");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextArea1.setText("");
                        jComboBox1.setSelectedIndex(0);
                        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/selectImage1.png")));
         
         }
   else
      {
             JOptionPane.showMessageDialog(rootPane, "record could not inserted ", "invalid entry", JOptionPane.ERROR_MESSAGE);
      }
    } 
       }
       catch(NumberFormatException e)
       {
           JOptionPane.showMessageDialog(rootPane,"item price can not alphabets and special charcter", "enter valid price", JOptionPane.ERROR_MESSAGE);
       
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dbOperation.DBOperator.soundOfButton();
        BufferedImage img = null;
        JFileChooser jfc = new JFileChooser();
        int open = jfc.showOpenDialog(rootPane);
        
        if(open==0)
        {
            try
            {
                file = jfc.getSelectedFile();
                img = ImageIO.read(file);
                Image dimg = img.getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(), Image.SCALE_SMOOTH);
                jLabel7.setIcon(new ImageIcon(dimg));
                //FileInputStream fis = new FileInputStream(file);
                //jLabel7.setIcon(new ImageIcon(file.getAbsolutePath()));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseExited

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
