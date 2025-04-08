import java.util.*;
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try{
            throw new CustomException("Something went wronk!");
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
