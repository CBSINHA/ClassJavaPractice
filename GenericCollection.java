import java.util.*;
class GenericCollection{
    public static void main(String[]ar){
        ArrayList <String> names=new ArrayList<>();
        ArrayList<Integer> sum=new ArrayList<>();
        sum.add(10);
        sum.add(20);
        System.out.println(sum.get(0)+sum.get(1)+"\n");
        names.add("Shashank");
        names.add("Sinha");
        System.out.println(names);
        names.set(0,"One");
        System.out.println(names.get(0));
        System.out.println("\n");
        for(int i:sum){
            System.out.println(i);
        }
    }
}