import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountTransactions {
    public void deposit(Connection conn) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give the accountID to Deposit money: ");
        int accountId=scanner.nextInt();
        System.out.println("Enter the amount would like to Deposit in the account : ");
        float amount=scanner.nextFloat();
        String sql = "UPDATE Accounts SET balance = balance + ? WHERE id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setFloat(1, amount);
        preparedStatement.setInt(2, accountId);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Failed to deposit amount!");
        }
    }
    
    public void withdraw(Connection conn) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give the accountID for withdraw money : ");
        int accountId=scanner.nextInt();
        System.out.println("Enter the amount to withdraw from  account: ");
        float amount=scanner.nextFloat(); 
        String sql = "UPDATE Accounts SET balance = balance - ? WHERE id = ? AND balance >= ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setFloat(1, amount);
        preparedStatement.setInt(2, accountId);
        preparedStatement.setFloat(3, amount);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Failed to withdraw amount! Insufficient balance.");
        }
    }
}
