import java.io.*;
public class PrintWriterClass {
    public static void main(String[] args) {
        PrintWriter writer=new PrintWriter(System.out,true);
        writer.println("Hello, CONSOLE!");
        writer.printf("This is the formatted double: %.2f",123.456789);
    }
}
