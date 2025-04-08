import java.util.*;
public class InputErrorsClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        if(sc.hasNextInt()){
            int val=sc.nextInt();
            System.out.println("You entered: "+ val);
        }
        else{
            System.out.println("Invalid Input please enter an integer");
        }
    }
}
