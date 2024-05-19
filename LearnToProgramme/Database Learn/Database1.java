import java.sql.*;
public class Database1 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select * from students");
        while(rs.next()){
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");
            //System.out.println("");


        }
        stm.close();
        con.close();

    }
    
}
