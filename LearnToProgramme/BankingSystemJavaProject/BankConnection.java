import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankConnection {
    private static final String DB_URL = "jdbc:sqlite:C://sqlite//bank1.db";
    //public static final String DB_URL = "jdbc:sqlite:C://sqlite//bank1.db";
    private Connection conn;

    public BankConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to Database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getUrl(){
        return DB_URL;
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
