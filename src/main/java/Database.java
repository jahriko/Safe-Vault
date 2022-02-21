

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Database {
    public static Connection connect = null;
    private static PreparedStatement prepStat = null;
    private static String URL = "jdbc:sqlite:";
    private static String resetPath = "";
    
    public static Connection getConnection() {
        URL = "jdbc:sqlite:";
        String getFilePath = new File("").getAbsolutePath();
        String fileAbsolutePath = getFilePath.concat("\\src\\safeVault.db");
        resetPath = fileAbsolutePath;
        
        try {
            if (isDatabaseExist(fileAbsolutePath)) {
                connect = DriverManager.getConnection(URL + fileAbsolutePath);

            } else {
                createDatabase("safeVault");
                connect = DriverManager.getConnection(URL + fileAbsolutePath);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
        return connect;
    }
    
    private static boolean isDatabaseExist(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }
    
    private static void createDatabase(String fileName) {
        String getFilePath = new File("").getAbsolutePath();
        String fileAbsolutePath = "";

        fileAbsolutePath = getFilePath.concat("\\src\\"+ fileName +".db");
        resetPath = fileAbsolutePath;
        
        try (Connection connect = DriverManager.getConnection(URL + resetPath)){
            if (connect != null) {
                createTable();
            }
        } catch (SQLException e) {
            System.out.println("===ERROR AT createDatabase()===");
            e.printStackTrace();
        }

    }
    
    private static void createTable() {
        final String SQL = "CREATE TABLE IF NOT EXISTS safeVault (site, email, username, password, details)";

        try (Connection connect = DriverManager.getConnection(URL + resetPath)){
            Statement statement = connect.createStatement();
            statement.executeUpdate(SQL);
            System.out.println("\n==Table Created==\n");
        } catch (SQLException e) {
            e.printStackTrace();
        } 

    }
    
    public static void insertData(String siteField, String emailField, String usernameField, char[] passwordField, String detailsField) {
        final String SQL = "INSERT INTO safeVault (site, email, username, password ,details) VALUES (?, ?, ?, ?, ?)";

        try (Connection connect = DriverManager.getConnection(URL + resetPath)){
            prepStat = connect.prepareStatement(SQL);
            prepStat.setString(1, siteField);
            prepStat.setString(2, emailField);
            prepStat.setString(3, usernameField);
            prepStat.setString(4, String.valueOf(passwordField));
            prepStat.setString(5, detailsField);
            prepStat.executeUpdate();

        } catch (SQLException e) {
            System.out.println("===ERROR AT insertData()===\n");
            e.printStackTrace();
        } 
    }
    
    public static void updateSQLData(String site, 
                                     String email, 
                                     String username, 
                                     String password, 
                                     String details,
                                     String tableRow) {
        
        final String SQL = """
                     UPDATE safeVault 
                     SET site = ?, 
                         email = ?,
                         username = ?,
                         password = ?,
                         details = ?
                     WHERE rowid = ?
                     """;
        
        try (Connection connect = Database.getConnection();
             PreparedStatement prepStat = connect.prepareStatement(SQL);) {
            
                if (connect != null) {
                    prepStat.setString(1, site);
                    prepStat.setString(2, email);
                    prepStat.setString(3, username);
                    prepStat.setString(4, password);
                    prepStat.setString(5, details);
                    prepStat.setString(6, tableRow);
                    prepStat.executeUpdate();
                    
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteSQL(String rowID) {
        final String SQL = "DELETE FROM safeVault WHERE rowid = " + rowID + ";";

        try (Connection connect = Database.getConnection();
             Statement statement = connect.createStatement();) {

            statement.executeUpdate(SQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        ((DefaultTableModel) Frame.jTable1.getModel()).removeRow(Integer.parseInt(rowID)- 1);  
        Operations.clearField(); 
    }
}