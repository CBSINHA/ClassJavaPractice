import java.util.*;
public class MultipleInputandOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lines of text(type 'quit' to exit)");
        while(true){
            String str=sc.nextLine();
            if("quit".equalsIgnoreCase(str)) break;
            System.out.println("You wrote: "+str);
        }
    }
}
