import java.sql.Connection;
import java.sql.DriverManager;
public class JDBC {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String user="root";
        String passwd="password";
        try(Connection connection=DriverManager.getConnection(url, user, passwd)){
            System.out.println("Successfully connected to the Database");
        }catch(Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        
    }
}
