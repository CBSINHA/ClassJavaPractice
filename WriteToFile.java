import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteToFile {
    public static void main(String[] args) {
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("test.dat"))){
            Person person=new Person("Shashank", 50);
            oos.writeObject(person);
            System.out.println("Object serialized successfully");
        }catch(Exception e){
            System.out.println("Error caught!!");
        }
    }
}
