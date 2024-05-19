import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAccount {
    public void deleteAccount(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM Accounts WHERE id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Failed to delete account!");
        }

        AddNewAccount.numberOfBankAccount--;


    }
}
