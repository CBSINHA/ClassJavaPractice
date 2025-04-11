import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectstoaFile {
    public static void main(String[] args) {
        
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("people.dat"))){
            Person person=(Person) ois.readObject();
            System.out.println("Object deserialized: "+person);
    }catch(Exception e){
        System.out.println("Error found!!: "+e.getMessage());
    }
}
}
