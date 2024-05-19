import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;


public class UpdateAccountDetails {
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


    public void updateAccountDetails(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID to Update: ");
        int oldId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (!isIdExists(conn, oldId)) {
            System.out.println("Account ID does not exist. Please enter a valid Account ID.");
            return;
        }
        System.out.print("Enter New Account ID: ");
        int newId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        while (isIdExists(conn, newId)) {
            System.out.println("Account ID already exists. Please enter a different Account ID.");
            System.out.print("Enter New Account ID: ");
            newId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        }
        System.out.print("Enter New First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter New Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter New Balance: ");
        float balance = scanner.nextFloat();
        String sql = "UPDATE Accounts SET id=?, firstName=?, lastName=?, balance=? WHERE id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, newId);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setFloat(4, balance);
        preparedStatement.setInt(5, oldId);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Account details updated successfully!");
        } else {
            System.out.println("Failed to update account details!");
        }
    }


    public void updateAccount(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID to Update: ");
        int oldId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (!isIdExists(conn, oldId)) {
            System.out.println("Account ID does not exist. Please enter a valid Account ID.");
            return;
        }
        System.out.print("Enter New First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter New Last Name: ");
        String lastName = scanner.nextLine();
        String sql = "UPDATE Accounts SET firstName=?, lastName=? WHERE id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setInt(3, oldId);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("First name and last name updated successfully!");
        } else {
            System.out.println("Failed to update first name and last name!");
        }
    }    

    private boolean isIdExists(Connection conn, int id) throws SQLException {
        String sql = "SELECT * FROM Accounts WHERE id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
}
