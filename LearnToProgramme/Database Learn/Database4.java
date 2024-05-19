import java.sql.*;
import java.util.*;

public class Database4 {
    public static void main(String[] args) throws Exception{

        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter student Data ");
        int r=sc.nextInt();
        String name=sc.next();
        String city=sc.next();
        int dno=sc.nextInt();
        stm.setInt(1,r);
        stm.setString(2,name);
        stm.setString(3,city);
        stm.setInt(4,dno);
        stm.executeUpdate();
        
        stm.close();
        con.close();
    }
    
}
