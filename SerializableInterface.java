import java.io.*;
class Person implements Serializable{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Person{name="+name+" age="+age+"}";
    }
}
class SerializableInterface{
    public static void main(String[] args) {
        Person person =new Person("Shashank", 100);
        System.out.println(person);
    }
}