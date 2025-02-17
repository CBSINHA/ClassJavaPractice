class Papa{
    int age=50;
}
class Beta extends Papa{
    int age1=20;
}
class Animal{
    void eat(){System.out.println("eating.......");}
}
class Dog extends Animal{void bark(){System.out.println("Bhau bhau bhau......");}}
class Pilla extends Dog{void weep(){System.out.println("Kutte ka pilla ro raha hai T_T...");}}
class Billa extends Animal{void meow(){System.out.println("Miau....");}}
class Inheritance{
    public static void main(String[] args) {
        Beta obj=new Beta();
        Pilla pilla=new Pilla();
        Billa billa=new Billa();
        billa.eat();
        billa.meow();
        System.out.println("Pitaji ki age: "+obj.age+ " Beta ji ki age: "+obj.age1);
        pilla.eat();
        pilla.bark();
        pilla.weep();
    }
}