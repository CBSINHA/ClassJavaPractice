import java.util.*;
class Exception {
    static String mes;
}
    class CustomException extends Exception{
        CustomException(String message){
            mes=message;
        }
        public static void main(String[] args) {
            CustomException obj=new CustomException("HI I am Shashank");
            System.out.println(mes);
        }
    }

