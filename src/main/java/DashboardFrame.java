
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import jiconfont.icons.font_awesome.FontAwesome;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import jiconfont.swing.IconFontSwing;

public class DashboardFrame extends javax.swing.JFrame {
    public static final String URL = "jdbc:sqlite:test.db";
    
    public DashboardFrame() {
        initComponents(); 
       
        //Button Icons
        IconFontSwing.register(FontAwesome.getIconFont());
        DashboardFrame.addMenuItem.setIcon(IconFontSwing.buildIcon(FontAwesome.PLUS_SQUARE, 24));
        
        // Disable Resizeable Divider
        splitPane.setDividerSize(-1); 
        
        splitPane.getLeftComponent().setVisible(false);

        //Display all data in table
        Operations.displayAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        copyPassword = new javax.swing.JMenuItem();
        copyUsername = new javax.swing.JMenuItem();
        copyEmail = new javax.swing.JMenuItem();
        updateItem = new javax.swing.JMenuItem();
        deleteItem = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        toolbar = new javax.swing.JToolBar();
        addMenuItem = new javax.swing.JButton();
        splitPane = new javax.swing.JSplitPane();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panel2 = new javax.swing.JPanel();
        site = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        details = new javax.swing.JLabel();
        siteField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        scrollPane2 = new javax.swing.JScrollPane();
        detailsField = new javax.swing.JTextArea();
        updateBtn = new javax.swing.JButton();
        showHide = new javax.swing.JToggleButton();

        copyPassword.setText("Copy Password");
        copyPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyPasswordPopupItem(evt);
            }
        });
        jPopupMenu1.add(copyPassword);

        copyUsername.setText("Copy Username");
        copyUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyUsernamePopupItem(evt);
            }
        });
        jPopupMenu1.add(copyUsername);

        copyEmail.setText("Copy Email");
        copyEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyEmailPopupItem(evt);
            }
        });
        jPopupMenu1.add(copyEmail);

        updateItem.setText("Update");
        updateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePopupItem(evt);
            }
        });
        jPopupMenu1.add(updateItem);

        deleteItem.setText("Delete");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePopupItem(evt);
            }
        });
        jPopupMenu1.add(deleteItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.BorderLayout());

        toolbar.setFloatable(false);
        toolbar.setRollover(true);
        toolbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addMenuItem.setFocusable(false);
        addMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addMenuItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn(evt);
            }
        });
        toolbar.add(addMenuItem);

        panel.add(toolbar, java.awt.BorderLayout.PAGE_START);

        splitPane.setPreferredSize(new java.awt.Dimension(945, 575));

        scrollPane.setPreferredSize(new java.awt.Dimension(919, 529));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Site", "Email", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setFillsViewportHeight(true);
        table.setPreferredSize(new java.awt.Dimension(919, 529));
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        scrollPane.setViewportView(table);

        splitPane.setRightComponent(scrollPane);

        panel2.setMinimumSize(new java.awt.Dimension(300, 300));
        panel2.setPreferredSize(new java.awt.Dimension(300, 300));

        site.setText("Site");

        email.setText("E-mail");

        username.setText("Username");

        password.setText("Password");

        details.setText("Details");

        detailsField.setColumns(20);
        detailsField.setRows(5);
        scrollPane2.setViewportView(detailsField);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn(evt);
            }
        });

        showHide.setText("H");
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(updateBtn))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password)
                                    .addComponent(username)
                                    .addComponent(email)
                                    .addComponent(site)
                                    .addComponent(details))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(siteField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showHide, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(site))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showHide)))
                .addGap(18, 18, 18)
                .addComponent(details)
                .addGap(18, 18, 18)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addGap(38, 38, 38))
        );

        splitPane.setLeftComponent(panel2);

        panel.add(splitPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn
        try {
            new AddItemFrame().setVisible(true);
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }//GEN-LAST:event_addBtn

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        // Display selected row data
        if (table.getSelectedRow() > -1) {
            String rowData = String.valueOf(table.getSelectedRow() + 1);
            Operations.displaySelectedRowToFields(rowData);
        } 
    }//GEN-LAST:event_tableMouseClicked

    private void updateBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn
        
        
        char[] pw = passwordField.getPassword();
        String encryptedPassword = AESCrypt.encrypt(String.valueOf(pw), AddItemFrame.secretKey);
        
        Database.updateSQLData(siteField.getText(),
                                 emailField.getText(),
                                 usernameField.getText(),
                                 encryptedPassword,
                                 detailsField.getText(),
                                 String.valueOf(table.getSelectedRow() + 1));
        
        Operations.updateTableData("SELECT site, username, email FROM safeVault");
        
        Operations.clearField();
        splitPane.getLeftComponent().setVisible(false);

    }//GEN-LAST:event_updateBtn

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (evt.isPopupTrigger() && table.getSelectedRowCount() != 0) {
                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }    
        }

    }//GEN-LAST:event_tableMouseReleased

    private void updatePopupItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePopupItem
        if (!splitPane.getLeftComponent().isVisible()) {
            splitPane.getLeftComponent().setVisible(true); 
            splitPane.setDividerLocation(-1); // Show Pane
        }
        
        /* 
            The difference between .isVisible(true) and .setDividerLocation(-1)
            is that the former makes the specified pane, well.. visible. Whereas 
            the latter sets the size of the component. Having a -1 value sets 
            the component to its preferred size
        */
    }//GEN-LAST:event_updatePopupItem

    private void deletePopupItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePopupItem
        if (table.getSelectedRow() > -1) {
            String rowData = String.valueOf(table.getSelectedRow()+1);
            Database.deleteSQL(rowData);
            splitPane.getLeftComponent().setVisible(false);

        }  
    }//GEN-LAST:event_deletePopupItem

    private void copyPasswordPopupItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyPasswordPopupItem
        String getPassword = "";
        if (table.getSelectedRow() > -1) {
            String rowData = String.valueOf(table.getSelectedRow() + 1);
            getPassword = Operations.get("password", rowData);
        } 
        
        String decryptedPassword = AESCrypt.decrypt(getPassword, AddItemFrame.secretKey);
        
        copyToClipboard(decryptedPassword);
    }//GEN-LAST:event_copyPasswordPopupItem

    private void copyUsernamePopupItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyUsernamePopupItem
        String getUsername = "";
        if (table.getSelectedRow() > -1) {
            String rowData = String.valueOf(table.getSelectedRow() + 1);
            getUsername = Operations.get("username", rowData);
        } 
        
        copyToClipboard(getUsername);
    }//GEN-LAST:event_copyUsernamePopupItem

    private void copyEmailPopupItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyEmailPopupItem
        String getEmail = "";
        if (table.getSelectedRow() > -1) {
            String rowData = String.valueOf(table.getSelectedRow() + 1);
            getEmail = Operations.get("email", rowData);
        } 
        
        copyToClipboard(getEmail);
    }//GEN-LAST:event_copyEmailPopupItem

    private void showHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideActionPerformed
        if (showHide.isSelected()) {
            passwordField.setEchoChar((char)0);
            showHide.setText("S");
        } else {
            passwordField.setEchoChar('•');
             showHide.setText("H");
        }
    }//GEN-LAST:event_showHideActionPerformed

    public void copyToClipboard(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
    
    public static void main(String[] args) {
        FlatLightLaf.setup(); 
        java.awt.EventQueue.invokeLater(() -> new DashboardFrame().setVisible(true));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addMenuItem;
    private javax.swing.JMenuItem copyEmail;
    private javax.swing.JMenuItem copyPassword;
    private javax.swing.JMenuItem copyUsername;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JLabel details;
    public static javax.swing.JTextArea detailsField;
    private javax.swing.JLabel email;
    public static javax.swing.JTextField emailField;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel password;
    public static javax.swing.JPasswordField passwordField;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JToggleButton showHide;
    private javax.swing.JLabel site;
    public static javax.swing.JTextField siteField;
    private javax.swing.JSplitPane splitPane;
    public static javax.swing.JTable table;
    private javax.swing.JToolBar toolbar;
    private javax.swing.JButton updateBtn;
    private javax.swing.JMenuItem updateItem;
    private javax.swing.JLabel username;
    public static javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables



}
