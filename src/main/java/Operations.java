
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Operations {

    public static void clearField() {
        Frame.siteField.setText("");
        Frame.emailField.setText("");
        Frame.usernameField.setText("");
        Frame.passwordField.setText("");
        Frame.detailsField.setText("");
    }
    
    public static DefaultTableModel updateTableData(String query) {
        DefaultTableModel tableModel = (DefaultTableModel) Frame.jTable1.getModel();
        tableModel.setRowCount(0);
        
        try (Connection connect = Database.getConnection();
             Statement statement = connect.createStatement();) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
                if (resultSet.isBeforeFirst()) {
                    
                    while (resultSet.next()) {
                        Object[] data = {
                            resultSet.getString("site"),
                            resultSet.getString("email"),
                            resultSet.getString("username")       
                        };
                        tableModel.addRow(data);
                    }

                } 
 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return tableModel;
    }
    
    public static void displayAll() {
        final String SQL = "SELECT rowid, * FROM safeVault";
        
        try (Connection connect = Database.getConnection();
             Statement statement = connect.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL);) {
            
            while (resultSet.next()) {
                
                String[] row = new String[3];
                
                for (int i = 1; i <= 3; i++) {
                    row[i-1] = resultSet.getString(i+1);
                }
                
                ((DefaultTableModel) Frame.jTable1
                                            .getModel())
                                            .insertRow(resultSet.getRow() - 1, row);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void displaySelectedRowToFields (String rowID) {
        final String SQL = "SELECT * FROM safeVault WHERE rowid = ?";
        
        try (Connection connect = Database.getConnection();
             PreparedStatement prepStat = connect.prepareStatement(SQL);) {

            prepStat.setInt(1, Integer.valueOf(rowID));
            ResultSet resultSet = prepStat.executeQuery();

            if (resultSet.next()) {
                Frame.siteField.setText(resultSet.getString("site"));
                Frame.emailField.setText(resultSet.getString("email"));
                Frame.usernameField.setText(resultSet.getString("username"));
                Frame.passwordField.setText(resultSet.getString("password"));
                Frame.detailsField.setText(resultSet.getString("details"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}