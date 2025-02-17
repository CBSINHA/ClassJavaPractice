class Papa{
    int age=50;
}
class Beta extends Papa{
    int age1=20;
}
class Inheritance{
    public static void main(String[] args) {
        Beta obj=new Beta();
        System.out.println("Pitaji ki age: "+obj.age+ " Beta ji ki age: "+obj.age1);
    }
}