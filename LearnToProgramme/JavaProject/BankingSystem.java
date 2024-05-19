import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        BankConnection bankConnection = new BankConnection();
        BankDatabase bankDatabase = new BankDatabase(bankConnection);
        BankTable banktable=new BankTable(bankConnection);
        Connection conn = bankConnection.getConnection();

        bankDatabase.createDatabase();
        banktable.createTable();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("*** Banking System Menu ***");
                System.out.println("1. Add New Account");
                System.out.println("2. View Account Details");
                System.out.println("3. Update Account Details");
                System.out.println("4. Delete Account");
                System.out.println("5. Print Total Number of Bank Accounts entered by you : ");
                System.out.println("6. Print Number of Accounts Present in Database");
                System.out.println("7. View All Accounts Details Present in the Database");
                System.out.println("8. Deposit Money to Your Account");
                System.out.println("9. Withdraw Money from Your Account");
                System.out.println("10. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        AddNewAccount addNewAccount = new AddNewAccount();
                        addNewAccount.addNewAccount(conn);
                        break;
                    case 2:
                        ViewAccountDetails viewAccountDetails = new ViewAccountDetails();
                        viewAccountDetails.viewAccountDetails(conn);
                        break;    
                    case 3:

                        //UpdateAccountDetails updateAccountBalance = new UpdateAccountDetails();
                        //updateAccountBalance.updateAccountBalance(conn);
                        UpdateAccountDetails updatdDetails=new UpdateAccountDetails();
                        //updatdDetails.updateAccountDetails(conn);
                        updatdDetails.updateAccount(conn);
                        break;
                    case 4:
                        DeleteAccount deleteAccount = new DeleteAccount();
                        deleteAccount.deleteAccount(conn);
                        break;
                    case 5:
                        AddNewAccount.printNumberOfBankAccount();
                        break;
                    case 6:
                        int totalaccountNumber=banktable.countRowsInAccountsTable();
                        System.out.println("Number of account present in database : "+totalaccountNumber);
                        break;
                    case 7:
                        ViewAccountDetails viewAllAccount = new ViewAccountDetails();
                        viewAllAccount.viewAllAccounts(conn);
                        break;
                    case 8:
                        AccountTransactions actd=new AccountTransactions();;
                        actd.deposit(conn);
                        break;
                    case 9:
                        AccountTransactions actw=new AccountTransactions();
                        actw.withdraw(conn);
                        break;
                    case 10:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            bankConnection.closeConnection();
        }
    }
}
