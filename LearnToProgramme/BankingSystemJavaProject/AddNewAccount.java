import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddNewAccount {
    public static int numberOfBankAccount;
    public void addNewAccount(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();
        System.out.print("Enter Initial Balance: ");
        float balance = scanner.nextFloat();

        String sql = "INSERT INTO Accounts (firstName, lastName, balance) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setFloat(3, balance);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Account added successfully!");
        } else {
            System.out.println("Failed to add account!");
        }

        numberOfBankAccount++;
    }

    public static void printNumberOfBankAccount(){
        System.out.println(numberOfBankAccount);
    }
}
