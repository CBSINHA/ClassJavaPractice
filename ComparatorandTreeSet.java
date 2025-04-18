import java.util.*;
public class ComparatorandTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>(Comparator.reverseOrder());
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
    }
}
