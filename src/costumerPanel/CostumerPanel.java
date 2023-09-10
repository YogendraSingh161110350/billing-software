
package costumerPanel;

import EmployeePage.StartBilling;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class CostumerPanel extends javax.swing.JFrame {

    gettersetter.GetterSetter gs ;
    public CostumerPanel(gettersetter.GetterSetter gs) {
        initComponents();
        this.gs = gs;
        jLabel1.setText("WELCOME "+gs.getName());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "ITEM NAME", "EMPLOYEE NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 1350, 540));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 218, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("BACK");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 20, 107, 38));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/LoginBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1600, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        ResultSet rs = dbOperation.DBOperator.getCostumerShopingDetails(gs.getMobile());
        String number_of_item = "";
        String name_of_item= "";
        String price_of_itme="";
        String details = "";
        DefaultTableModel dtf = (DefaultTableModel)jTable1.getModel();
       try
       {
            while(rs.next())
            {//101,bon-bon,100,2
                    String items = rs.getString("costumer_item");
                    String[] itemss = items.split(",");
                    int total_items = itemss.length/4;
                    int count = -1;
                    for(int i =1;i<=total_items;i++)
                    {
                        count = count+2;
                        String name = itemss[count];
                        count++;
                        String price = itemss[count];
                        count++;
                        String ammount = itemss[count];
                        System.out.println(count);
                        details = ammount+" "+ name+" each is "+price+" || ";
                    }
                    String datee = rs.getString(3);
                    String timee = rs.getString(4);
                    Object obj[] = {datee,timee,details,rs.getString(5)};
                    dtf.addRow(obj);
             }
            
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        System.out.println(details);
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new billingsowftware.Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       jLabel2.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(Color.red);
    }//GEN-LAST:event_jLabel2MouseExited

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CostumerPanel(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
