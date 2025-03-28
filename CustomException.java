import java.util.*;
class exception3 {
    static String mes;
}
    class CustomException extends exception3{
        CustomException(String message){
            mes=message;
        }
        public static void main(String[] args) {
            CustomException obj=new CustomException("HI I am Shashank");
            System.out.println(mes);
        }
    }

