import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TransientKeywoard {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("input.txt");FileOutputStream fos=new FileOutputStream("output.txt")){
            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
        }catch(Exception e){
            System.out.println("Exception caught!!");
        }
    }
}
