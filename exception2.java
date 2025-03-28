import java.util.*;
public class exception2 {
    public static void main(String[]args){
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error division by 0");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This is the finally block");
        }
    }
}
