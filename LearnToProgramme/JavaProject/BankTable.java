import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BankTable {
    BankConnection bankConnection;
    public BankTable(BankConnection bankConnection) {
        this.bankConnection = bankConnection;

    }

    public void createTable() {
        Connection conn = bankConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println("Creating table in given database...");
            String sql = "CREATE TABLE IF NOT EXISTS Accounts " +
                         "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         " firstName VARCHAR(255), " +
                         " lastName VARCHAR(255), " +
                         " balance FLOAT)";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
        public int countRowsInAccountsTable() {
        int rowCount = 0;
        Connection conn = bankConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS rowCount FROM Accounts");
            if (rs.next()) {
                rowCount = rs.getInt("rowCount");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowCount;
    }
    
}
