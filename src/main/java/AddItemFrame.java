
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddItemFrame extends javax.swing.JFrame {
    Connection connect          = null;
    PreparedStatement prepStat  = null;
    ResultSet resultSet         = null;
    
    static final String secretKey = "!e3&3r@0$N`*";

    public AddItemFrame() throws SQLException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        site = new javax.swing.JLabel();
        details = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        siteField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsField = new javax.swing.JTextArea();
        showHide = new javax.swing.JToggleButton();
        showHide2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Item");
        setResizable(false);

        username.setText("Username");

        email.setText("E-mail");

        password.setText("Password");

        confirmPassword.setText("Confirm Password");

        site.setText("Site");

        details.setText("Details");

        warning.setForeground(new java.awt.Color(255, 51, 51));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warning.setOpaque(true);

        usernameField.setToolTipText("");

        emailField.setToolTipText("");

        passwordField.setActionCommand("<Not Set>");
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        confirmPasswordField.setActionCommand("<Not Set>");
        confirmPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtn(evt);
            }
        });

        detailsField.setColumns(20);
        detailsField.setRows(5);
        jScrollPane1.setViewportView(detailsField);

        showHide.setText("H");
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideBtn(evt);
            }
        });

        showHide2.setText("H");
        showHide2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHide2Btn(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password)
                    .addComponent(confirmPassword)
                    .addComponent(site)
                    .addComponent(email)
                    .addComponent(username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn)
                        .addGap(31, 31, 31)
                        .addComponent(cancelBtn))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siteField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showHide2))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showHide)))
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(details)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(details))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showHide))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmPassword)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showHide2))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(site)
                            .addComponent(siteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(cancelBtn))
                        .addGap(28, 28, 28))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn
        final String SQL = "SELECT site, username, email FROM safeVault";
        
        if (siteField.getText().equals("")                 &&
            emailField.getText().equals("")                &&
            usernameField.getText().equals("")             &&
            passwordField.getPassword().length == 0        &&
            confirmPasswordField.getPassword().length == 0 &&
            detailsField.getText().equals("")) {

            warning.setText("Fields are empty");
            return;
        }
        
        if (!(Arrays.equals(passwordField.getPassword(), confirmPasswordField.getPassword()))) {
            warning.setText("Password not matched");
            return;
        }
        
        
        char[] password = passwordField.getPassword();
        String encryptedPassword = AESCrypt.encrypt(String.valueOf(password), secretKey);
        
        
        
        Database.getConnection();
        Database.insertData(siteField.getText(), 
                            emailField.getText(), 
                            usernameField.getText(), 
                            encryptedPassword, 
                            detailsField.getText());
        
        DashboardFrame.table.setModel(Operations.updateTableData(SQL));
        System.out.println("Added to Database");
        dispose();
        
    }//GEN-LAST:event_addBtn

    private void cancelBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtn
        dispose();
    }//GEN-LAST:event_cancelBtn

    private void showHideBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideBtn
        if (showHide.isSelected()) {
            passwordField.setEchoChar((char)0);
            showHide.setText("S");
        } else {
            passwordField.setEchoChar('•');
            showHide.setText("H");
        }
    }//GEN-LAST:event_showHideBtn

    private void showHide2Btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHide2Btn
        if (showHide2.isSelected()) {
            confirmPasswordField.setEchoChar((char)0);
            showHide2.setText("S");
        } else {
            confirmPasswordField.setEchoChar('•');
            showHide2.setText("H");
        }
    }//GEN-LAST:event_showHide2Btn

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
                try {
                    FlatLightLaf.setup();
                    new AddItemFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddItemFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addBtn;
    public static javax.swing.JButton cancelBtn;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel details;
    private javax.swing.JTextArea detailsField;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JToggleButton showHide;
    private javax.swing.JToggleButton showHide2;
    private javax.swing.JLabel site;
    private javax.swing.JTextField siteField;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables



}
