import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBC_Delete {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String user="root";
        String passwd="password";
        String str="DELETE FROM employees WHERE id= ?";
        try(Connection connection=DriverManager.getConnection(url, user, passwd);
        PreparedStatement ps=connection.prepareStatement(str);){
            ps.setInt(1,101);
            int rowsUpdated=ps.executeUpdate();
            System.out.println(rowsUpdated+" row(s) updated");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
