import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankDatabase {
    BankConnection bankConnection;

    public BankDatabase(BankConnection bankConnection) {
        this.bankConnection = bankConnection;
    }
        public void createDatabase() {
        // You can perform any additional setup here, such as creating tables
        System.out.println("Creating database...");
        //Connection conn = bankConnection.getConnection();
        //try (conn) {
        //try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C://sqlite//bank1.db")) {
        try (Connection connection=DriverManager.getConnection(BankConnection.getUrl())){
        //try (Connection connection = bankConnection.getConnection()) {
            // Additional setup code if needed
            System.out.println("Database created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
