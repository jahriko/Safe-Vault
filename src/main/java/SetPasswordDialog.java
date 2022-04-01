

import java.io.FileWriter;
import org.json.simple.JSONObject;

public class SetPasswordDialog extends javax.swing.JDialog {
    static String secret = "tDW234!&k";

    public SetPasswordDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setPassField = new javax.swing.JPasswordField();
        setPassLbl = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        confirmPassLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        showHide = new javax.swing.JToggleButton();
        showHide2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        setPassLbl.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        setPassLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setPassLbl.setText("Set your Password");

        confirmPassLbl.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        confirmPassLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPassLbl.setText("Confirm Password");

        jButton1.setText("Set Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPasswordBtn(evt);
            }
        });

        showHide.setText("H");
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHide(evt);
            }
        });

        showHide2.setText("H");
        showHide2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHide2(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(confirmPassLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setPassLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(setPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(confirmPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showHide, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showHide2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton1)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(setPassLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showHide))
                .addGap(24, 24, 24)
                .addComponent(confirmPassLbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showHide2))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setPasswordBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPasswordBtn

        if (!String.valueOf(setPassField.getPassword()).equals
            (String.valueOf(confirmPassField.getPassword()))) {

            jLabel1.setText("Password and confirm password does not match.");
            return;
        }

        if (setPassField.getPassword().length == 0 ||
            confirmPassField.getPassword().length == 0) {

            jLabel1.setText("Fields are empty.");
            return;
        }
        
        String password = String.valueOf(setPassField.getPassword());
        String encryptedPassword = AESCrypt.encrypt(password, secret);

        try {
            JSONObject jsonObj = new JSONObject();

            jsonObj.put("password", encryptedPassword);

            FileWriter file = new FileWriter("login.json");
            file.write(jsonObj.toJSONString());
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        dispose();
        new EnterPasswordDialog(null, true).setVisible(true);
    }//GEN-LAST:event_setPasswordBtn

    private void showHide(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHide
        if (showHide.isSelected()) {
            setPassField.setEchoChar((char)0);
            showHide.setText("S");
        } else {
            setPassField.setEchoChar('•');
            showHide.setText("H");
        }
    }//GEN-LAST:event_showHide

    private void showHide2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHide2
        if (showHide2.isSelected()) {
            confirmPassField.setEchoChar((char)0);
            showHide2.setText("S");
        } else {
            confirmPassField.setEchoChar('•');
            showHide2.setText("H");
        }
    }//GEN-LAST:event_showHide2

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FlatLightLaf.setup();
//                SetPasswordDialog dialog = new SetPasswordDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel confirmPassLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField setPassField;
    private javax.swing.JLabel setPassLbl;
    private javax.swing.JToggleButton showHide;
    private javax.swing.JToggleButton showHide2;
    // End of variables declaration//GEN-END:variables
}
