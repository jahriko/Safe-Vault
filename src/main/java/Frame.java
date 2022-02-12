
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;
import jiconfont.swing.IconFontSwing;
import jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons;

public class Frame extends javax.swing.JFrame {
    public static final String URL = "jdbc:sqlite:test.db";
    
    Connection connect = null;
    Statement statement = null;
    PreparedStatement prepStat = null;
    ResultSet resultSet = null;
    
    private int loc = 0;
    
    public Frame() {
        initComponents();

        addButtonIcon("Add", addButton);
        addButtonIcon("Delete", deleteButton);
        addButtonIcon("Edit", editButton);
        loc = jSplitPane2.getDividerLocation();
        jSplitPane2.setDividerSize(-1); // Hides divider
        jSplitPane2.getLeftComponent().setVisible(false);
        
//        Database.getConnection();
        

        try { populateSQL(jTable1); } catch ( Exception e ) { e.printStackTrace(); }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        siteField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailsField = new javax.swing.JTextArea();
        updateButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addButton.setFocusable(false);
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(addButton);

        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(deleteButton);

        editButton.setFocusable(false);
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(editButton);

        jPanel2.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jSplitPane2.setPreferredSize(new java.awt.Dimension(945, 575));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(919, 529));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setFillsViewportHeight(true);
        jTable1.setPreferredSize(new java.awt.Dimension(919, 529));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jSplitPane2.setRightComponent(jScrollPane1);

        jPanel3.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel4.setText("Site");

        jLabel5.setText("Password");

        jLabel3.setText("Username");

        jLabel6.setText("E-mail");

        detailsField.setColumns(20);
        detailsField.setRows(5);
        jScrollPane2.setViewportView(detailsField);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(updateButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(siteField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(38, 38, 38))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel2.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");
        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            new AddItem().setVisible(true);
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            try {
                deleteSQL(String.valueOf(jTable1.getSelectedRow()+1));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }  
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

    }//GEN-LAST:event_editButtonActionPerformed
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (!jSplitPane2.getLeftComponent().isVisible()) {
            jSplitPane2.getLeftComponent().setVisible(true);
            jSplitPane2.setDividerLocation(loc);
        }
        
        if (jTable1.getSelectedRow() > -1) {
            try {
                getSelectedData(String.valueOf(jTable1.getSelectedRow() + 1));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            
            final String SQL = """
                                UPDATE safeVault 
                                SET site = ?, 
                                    email = ?,
                                    username = ?,
                                    password = ?,
                                    details = ?
                                WHERE rowid = ?
                                """;
            
            final String loadDataToTable = "SELECT site, username, email FROM safeVault";
            
            if (connect != null) {
                String currentSite = siteField.getText();
                String currentEmail = emailField.getText();
                String currentUsername = usernameField.getText();
                String currentPassword = String.valueOf(passwordField.getPassword());
                String currentDetails = detailsField.getText();   
                
                Database.getConnection();
                connect = Database.connect;
                prepStat = connect.prepareStatement(SQL);
                prepStat.setString(1, currentSite);
                prepStat.setString(2, currentEmail);
                prepStat.setString(3, currentUsername);
                prepStat.setString(4, currentPassword);
                prepStat.setString(5, currentDetails);
                prepStat.setString(6, String.valueOf(jTable1.getSelectedRow() + 1));
                prepStat.executeUpdate();
                jTable1.setModel(customModel(loadDataToTable));
                clearField();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
        
        
    }
    
    private void populateSQL(javax.swing.JTable table) throws SQLException, ClassNotFoundException {
        
        final String SQL = "SELECT rowid, * FROM safeVault";
        
        Database.getConnection();
        connect = Database.connect;
        statement = connect.createStatement();
        resultSet = statement.executeQuery(SQL);
        
        while (resultSet.next()) {  
            String[] row = new String[3];
            for (int i = 1 ; i <= 3 ; i++) {
                row[i-1] = resultSet.getString(i+1);
            }
            ((DefaultTableModel) table.getModel()).insertRow(resultSet.getRow() - 1, row);
        }
        connect.close();
        statement.close();
        resultSet.close();
    }
    
    private void getSelectedData (String rowID) throws ClassNotFoundException, SQLException {
        final String SQL = "SELECT * FROM safeVault WHERE rowid = ?";
        
        Database.getConnection();
        connect = Database.connect;
        prepStat = connect.prepareStatement(SQL);
        prepStat.setInt(1, Integer.valueOf(rowID));
            
        resultSet = prepStat.executeQuery();
        
        if (resultSet.next()) {
            siteField.setText(resultSet.getString("site"));
            emailField.setText(resultSet.getString("email"));
            usernameField.setText(resultSet.getString("username"));
            passwordField.setText(resultSet.getString("password"));
            detailsField.setText(resultSet.getString("details"));
        }
        
        connect.close();
        prepStat.close();
        resultSet.close();
    }
    
    private void deleteSQL(String rowID) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        final String SQL = "DELETE FROM safeVault WHERE rowid = " + rowID + ";";
        
        Database.getConnection();
        connect = Database.connect;
        statement = connect.createStatement();
        statement.executeUpdate(SQL);
        
        ((DefaultTableModel) jTable1.getModel()).removeRow(Integer.parseInt(rowID)- 1);  
        clearField();
        
    }
    
    private void clearField() {
        siteField.setText("");
        emailField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        detailsField.setText("");
    }
    
    private void addButtonIcon(String buttonIs, javax.swing.JButton button) {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        Icon icon = null;
        
        if (buttonIs.equals("Add")) {
            icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ADD_BOX, 24);
        } else if (buttonIs.equals("Delete")) {
            icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.DELETE, 24);
        } else if (buttonIs.equals("Edit")) {
            icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.EDIT, 24);
        }
        
        button.setIcon(icon);
    }
    
    public static DefaultTableModel customModel(String query) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        try {
            Connection connect = Database.getConnection();
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    Object[] dataObj = {
                        resultSet.getString("site"),
                        resultSet.getString("email"),
                        resultSet.getString("username")
                    };
                    model.addRow(dataObj);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea detailsField;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField siteField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables



}
