//Package
package file;

//Imports
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame {

    public AdminLogin() {
        initComponents();
        FrontPane.setBackground(new Color(255,255,255,150)); //Make background panel transparent
    }
    
    //Close Window
    public void close(){
        WindowEvent winClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrontPane = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        UsernameBox = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        Password = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        Title1 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        BackImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NSBM Green University");
        setMinimumSize(new java.awt.Dimension(611, 420));
        getContentPane().setLayout(null);

        Username.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(102, 102, 102));
        Username.setText("Username :");

        Title.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 153, 102));
        Title.setText("ADMIN LOGIN");

        UsernameBox.setText("admin");
        UsernameBox.setBorder(null);
        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(0, 153, 102));
        LoginButton.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("LOGIN");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.setText("Password :");

        PasswordBox.setBorder(null);
        PasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBoxActionPerformed(evt);
            }
        });

        Title1.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(0, 153, 102));
        Title1.setText("NSBM Green university");

        Title2.setFont(new java.awt.Font("Raleway SemiBold", 1, 18)); // NOI18N
        Title2.setForeground(new java.awt.Color(102, 102, 102));
        Title2.setText("COURSE ENROLLMENT SYSTEM");

        Back.setBackground(new java.awt.Color(0, 153, 102));
        Back.setFont(new java.awt.Font("Raleway Black", 1, 11)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.setBorder(null);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrontPaneLayout = new javax.swing.GroupLayout(FrontPane);
        FrontPane.setLayout(FrontPaneLayout);
        FrontPaneLayout.setHorizontalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Title1)
                                    .addGap(35, 35, 35))
                                .addComponent(Title2))
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(Title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPaneLayout.createSequentialGroup()
                        .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrontPaneLayout.createSequentialGroup()
                                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Username)
                                    .addComponent(Password))
                                .addGap(43, 43, 43)
                                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60))))
        );
        FrontPaneLayout.setVerticalGroup(
            FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPaneLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username))
                .addGap(18, 18, 18)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password))
                .addGap(18, 18, 18)
                .addGroup(FrontPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(FrontPane);
        FrontPane.setBounds(110, 70, 380, 240);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        BackImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 600, 405);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBoxActionPerformed

    private void PasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordBoxActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        
        String user="admin";
        String pass="dasuni";
        String username= UsernameBox.getText();
        char[] passwordArray=PasswordBox.getPassword();
        String password = new String(passwordArray);
        
         try {
            if (username.equals(user) && password.equals(pass)) {// Check username and password entered
                JOptionPane.showMessageDialog(this,"Correct. Successfully logged in.");
                close();
                Menu m=new Menu();
                m.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
                UsernameBox.setText(null);
                PasswordBox.setText(null);
            }

        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        close();
        NSBMFirst n=new NSBMFirst();
        n.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackImage;
    private javax.swing.JPanel FrontPane;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField UsernameBox;
    // End of variables declaration//GEN-END:variables
}
