import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class JDBC_ResultSet {
    public static void main(String[] args) {
        String sql="SELECT * FROM employees";
        try(Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery(sql)){
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id")+", Name: "+rs.getString("name")+", Salary: "+rs.getDouble("salary"));
            }
        }catch(Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
