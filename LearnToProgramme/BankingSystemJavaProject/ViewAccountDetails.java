import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewAccountDetails {
    public void viewAccountDetails(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM Accounts WHERE id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("Account Details:");
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("First Name: " + resultSet.getString("firstName"));
            System.out.println("Last Name: " + resultSet.getString("lastName"));
            System.out.println("Balance: " + resultSet.getFloat("balance"));
        } else {
            System.out.println("Account not found!");
        }
    }
    public void viewAllAccounts(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Accounts";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        System.out.println("All Accounts:");
        System.out.println("ID\tFirst Name\tLast Name\tBalance");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t"
                    + resultSet.getString("firstName") + "\t"
                    + resultSet.getString("lastName") + "\t"
                    + resultSet.getFloat("balance"));
        }
    }

}
