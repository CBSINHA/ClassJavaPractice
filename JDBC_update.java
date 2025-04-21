import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBC_update {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String user="root";
        String passwd="password";
        String str="UPDATE employees SET salary =? WHERE id= ?";
        try(Connection connection=DriverManager.getConnection(url, user, passwd);
        PreparedStatement ps=connection.prepareStatement(str)){
            ps.setDouble(1,70000.0);
            ps.setInt(2,101);
            int roesUpdated=ps.executeUpdate();
            System.out.println(roesUpdated+" row(s) updated");
        }catch(Exception e){
            e.getMessage();
        }
    }
}
