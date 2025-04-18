import java.util.*;
class GenericCollection{
    public static void main(String[]ar){
        ArrayList <String> names=new ArrayList<>();
        names.add("Shashank");
        names.add("Sinha");
        System.out.println(names);
        names.set(0,"One");
        System.out.println(names.get(0));
    }
}