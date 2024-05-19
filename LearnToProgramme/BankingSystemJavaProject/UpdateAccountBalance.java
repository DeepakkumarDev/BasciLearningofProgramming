import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAccountBalance {
    public void updateAccountBalance(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter New Balance: ");
        float balance = scanner.nextFloat();

        String sql = "UPDATE Accounts SET balance=? WHERE id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setFloat(1, balance);
        preparedStatement.setInt(2, id);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Balance updated successfully!");
        } else {
            System.out.println("Failed to update balance!");
        }
    }
}
