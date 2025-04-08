import java.io.*;
public class BufferedReaderClass {
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message ♥:");
        String message=in.readLine();
        System.out.println("Your message: "+message);
    }
}
