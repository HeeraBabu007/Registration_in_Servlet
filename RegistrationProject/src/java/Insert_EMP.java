import java.sql.*;

public class Insert_EMP
{
    public static void main(String args[])
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
           String Query="insert into student1 values('heera','babu')";
           PreparedStatement pst=con.prepareStatement(Query);
           pst.executeUpdate();
           con.close();
           pst.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}