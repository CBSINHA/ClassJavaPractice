import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBC_queries {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String user="root";
        String passwd="password";
        String sql="INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";
        try(Connection connection=DriverManager.getConnection(url, user, passwd)){
            System.out.println("Successfully connected to the Database");
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(2,"Shashank");
            statement.setInt(1,101);
            statement.setDouble(3,600000.0);
            int rowsInserted=statement.executeUpdate();
            System.out.println(rowsInserted+" row(s) inserted!!");
        }catch(Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        
    }
}
