import java.sql.*;
import java.util.*;

public class Database3 {
    public static void main(String[] args) throws Exception{

        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stm=con.createStatement();
        //stm.executeUpdate("insert into dept values (70,'chem')");
        //stm.executeUpdate("delete from dept where deptno>=60");
        stm.executeUpdate("update dept set dname='phy' where deptno=50");



        stm.close();
        con.close();
    }
    
}
