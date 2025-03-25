
public class throwing {
    static void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be graeter than or equal to 18");
        }
    }
    public static void main(String [] ar){
        checkAge(10);
    }
}
