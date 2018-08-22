//Package
package file;

//Imports
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class NSBMFirst extends javax.swing.JFrame {

    //Closing a Window
    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }
    
    public NSBMFirst() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title1 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        LogoImage = new javax.swing.JLabel();
        Log = new javax.swing.JButton();
        BackImage = new javax.swing.JLabel();
        Border = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NSBM Green University");
        setMinimumSize(new java.awt.Dimension(611, 420));
        getContentPane().setLayout(null);

        Title1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(0, 153, 102));
        Title1.setText("NSBM Green University");
        getContentPane().add(Title1);
        Title1.setBounds(180, 30, 230, 17);

        Title2.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title2.setForeground(new java.awt.Color(102, 102, 102));
        Title2.setText("COURSE ENROLLMENT SYSTEM");
        getContentPane().add(Title2);
        Title2.setBounds(140, 60, 303, 17);

        LogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoNSBM.png"))); // NOI18N
        getContentPane().add(LogoImage);
        LogoImage.setBounds(0, 0, 160, 140);

        Log.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        Log.setForeground(new java.awt.Color(0, 153, 102));
        Log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        Log.setText("Login");
        Log.setOpaque(false);
        Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogActionPerformed(evt);
            }
        });
        getContentPane().add(Log);
        Log.setBounds(460, 20, 120, 60);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundNSBM.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        BackImage.setOpaque(true);
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 600, 405);

        Border.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        getContentPane().add(Border);
        Border.setBounds(130, 20, 320, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogActionPerformed
        close();
        AdminLogin a=new AdminLogin();
        a.setVisible(true);
    
    }//GEN-LAST:event_LogActionPerformed

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
            java.util.logging.Logger.getLogger(NSBMFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NSBMFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NSBMFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NSBMFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NSBMFirst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackImage;
    private javax.swing.JLabel Border;
    private javax.swing.JButton Log;
    private javax.swing.JLabel LogoImage;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    // End of variables declaration//GEN-END:variables
}
