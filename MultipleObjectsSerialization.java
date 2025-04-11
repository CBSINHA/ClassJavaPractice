import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MultipleObjectsSerialization {
    public static void main(String[] args) {
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("people.dat"))){
            oos.writeObject(new Person("Alice",30));
            oos.writeObject(new Person("Shashank",33));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error!!");
        }
    }
}
