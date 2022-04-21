/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catatalumni;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

/**
 *
 * @author Administrator
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    int x;
    int y;
    boolean mousePress;
    
    public Login() {
        initComponents();
        drag();
    }
    
    public void drag() {
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                mousePress = true;
                x = me.getX();
                y = me.getY();
            }
            public void mouseReleased(MouseEvent me){
                mousePress = false;
            }
        });
        
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent me){
                if (mousePress = true){
                    int tX = Login.this.getLocation().x + me.getX();
                    int tY = Login.this.getLocation().y + me.getY();
                    
                    int X = tX - x;
                    int Y = tY - y;
                    
                    Login.this.setLocation(X, Y);
                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelKiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        fieldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        buttonLogin = new javax.swing.JPanel();
        textLogin = new javax.swing.JLabel();
        buttonExit = new javax.swing.JPanel();
        textExit = new javax.swing.JLabel();
        buttonMinimize = new javax.swing.JPanel();
        textMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelKiri.setBackground(new java.awt.Color(124, 148, 115));
        panelKiri.setPreferredSize(new java.awt.Dimension(480, 440));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 234, 230));
        jLabel2.setText("Catat Alumni");

        javax.swing.GroupLayout panelKiriLayout = new javax.swing.GroupLayout(panelKiri);
        panelKiri.setLayout(panelKiriLayout);
        panelKiriLayout.setHorizontalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKiriLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(90, 90, 90))
        );
        panelKiriLayout.setVerticalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel2)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        getContentPane().add(panelKiri, java.awt.BorderLayout.WEST);

        panelLogin.setBackground(new java.awt.Color(207, 218, 200));
        panelLogin.setPreferredSize(new java.awt.Dimension(360, 440));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(124, 148, 115));
        jLabel1.setText("Authenticate");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(124, 148, 115));
        jLabel3.setText("Username");

        fieldUsername.setBackground(new java.awt.Color(207, 218, 200));
        fieldUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fieldUsername.setForeground(new java.awt.Color(81, 96, 75));
        fieldUsername.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(232, 234, 230));
        jSeparator1.setForeground(new java.awt.Color(232, 234, 230));

        fieldPassword.setBackground(new java.awt.Color(207, 218, 200));
        fieldPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fieldPassword.setForeground(new java.awt.Color(81, 96, 75));
        fieldPassword.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(124, 148, 115));
        jLabel4.setText("Password");

        jSeparator2.setBackground(new java.awt.Color(232, 234, 230));
        jSeparator2.setForeground(new java.awt.Color(232, 234, 230));

        buttonLogin.setBackground(new java.awt.Color(124, 148, 115));
        buttonLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(232, 234, 230), new java.awt.Color(205, 208, 203), null));
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonLoginMouseReleased(evt);
            }
        });

        textLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textLogin.setForeground(new java.awt.Color(232, 234, 230));
        textLogin.setText("Login");
        buttonLogin.add(textLogin);

        buttonExit.setBackground(new java.awt.Color(124, 148, 115));
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonExitMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonExitMouseReleased(evt);
            }
        });

        textExit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textExit.setForeground(new java.awt.Color(232, 234, 230));
        textExit.setText("X");
        buttonExit.add(textExit);

        buttonMinimize.setBackground(new java.awt.Color(124, 148, 115));
        buttonMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMinimizeMouseExited(evt);
            }
        });

        textMinimize.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        textMinimize.setForeground(new java.awt.Color(232, 234, 230));
        textMinimize.setText("_");
        buttonMinimize.add(textMinimize);

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator1)
                    .addComponent(fieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(fieldPassword)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(buttonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        getContentPane().add(panelLogin, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        buttonExit.setBackground(new Color(232, 234, 230));
        textExit.setForeground(new Color(81,96,75));
    }//GEN-LAST:event_buttonExitMouseEntered

    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        buttonExit.setBackground(new Color(124,148,115));
        textExit.setForeground(new Color(232,234,230));
    }//GEN-LAST:event_buttonExitMouseExited

    private void buttonMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizeMouseEntered
        buttonMinimize.setBackground(new Color(232, 234, 230));
        textMinimize.setForeground(new Color(81,96,75));
    }//GEN-LAST:event_buttonMinimizeMouseEntered

    private void buttonMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizeMouseExited
        buttonMinimize.setBackground(new Color(124,148,115));
        textMinimize.setForeground(new Color(232,234,230));
    }//GEN-LAST:event_buttonMinimizeMouseExited

    private void buttonExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseReleased
        int jawab = JOptionPane.showOptionDialog(this, 
                    "Ingin Keluar?", 
                    "Keluar", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Program Akan Keluar");
            System.exit(0);
        }
    }//GEN-LAST:event_buttonExitMouseReleased

    private void buttonLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseReleased
        buttonLogin.setBackground(new Color(124,148,115));
        textLogin.setForeground(new Color(232,234,230));
        
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_buttonLoginMouseReleased

    private void buttonLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMousePressed
        buttonLogin.setBackground(new Color(81,96,75));
        textLogin.setForeground(new Color(232,234,230));
        
        try {
            String sql = "SELECT * FROM admin WHERE username='"+fieldUsername.getText()+"' AND password='"+fieldPassword.getText()+"'";
            java.sql.Connection conn = (Connection)Koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet r = pst.executeQuery();
            
            int baris = 0;
            while (r.next()){
                baris = r.getRow();
            }
            
            if (baris == 1){
                JOptionPane.showMessageDialog(null, "Login sukses",
                        "Sukses", JOptionPane.INFORMATION_MESSAGE);             
                    
                this.dispose();
                new MainMenu().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Silahkan cek kembali username atau password",
                        "Ada yang salah", JOptionPane.INFORMATION_MESSAGE);
                
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Ada yang salah", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonLoginMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonExit;
    private javax.swing.JPanel buttonLogin;
    private javax.swing.JPanel buttonMinimize;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelKiri;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel textExit;
    private javax.swing.JLabel textLogin;
    private javax.swing.JLabel textMinimize;
    // End of variables declaration//GEN-END:variables
}
