
package billingsowftware;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.UIManager;

public class StartPage extends javax.swing.JFrame  {

    public StartPage()
    {
        
        initComponents();
        timer.start();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 102));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 1370, 21));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("file loading.........");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 258, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/addEmployeeImage.png"))); // NOI18N
        jLabel4.setText("phot");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 770, 450));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 50)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("  The only way \n to do great\n work is to love \n what you do.\n   \n\t");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 150, 1130, 452));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 75)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("BILLING SOWFTWARE ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsowftware/Icones/LoginBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -10, 1590, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
                             }
        });
    }
    int i = 1;
    Timer timer = new Timer(100,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            jProgressBar1.setValue(i);
            if(i==100)
            {
                    timer.stop();
                    setVisible(false);
                    new Login().setVisible(true);
            }
            if(i==20)
            {
                jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
                jLabel3.setForeground(Color.blue);
                jLabel3.setText("resource loading.........");
            }
            if(i==40)
            {
                jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
                jLabel3.setForeground(Color.BLUE);
                jLabel3.setText("netowrk cheaking.........");
            }
            if(i==60)
            {
                jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
                jLabel3.setForeground(Color.BLUE);
                jLabel3.setText("loading data.........");
            }
            if(i==80)
            {
                jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
                jLabel3.setForeground(Color.BLUE);
                jLabel3.setText("data loaded.........");
            }
            i++;
        }
    } );
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

   
    }

