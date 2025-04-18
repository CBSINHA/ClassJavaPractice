import java.util.*;
class Person implements Comparable <Person>{
    String name;
    public Person(String name){
        this.name=name;
    }
public int compareTo (Person other){
    return this.name.compareTo(other.name);
}
public String toString(){
    return name;
}
}
public class TreeSetprogram {
    public static void main(String[] args) {
        TreeSet<Person> set=new TreeSet<>();
        set.add(new Person("Shashank"));
        set.add(new Person("Ashutosh"));
        set.add(new Person("Animesh"));
        System.out.println(set);
    }
}
